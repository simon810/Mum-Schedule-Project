package edu.mum.mumsched.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private BlockName blockName;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            joinColumns = {@JoinColumn(name = "block_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private List<Course> courses=new ArrayList<>();
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            joinColumns = {@JoinColumn(name = "block_id")},
//            inverseJoinColumns = {@JoinColumn(name = "faculty_id", unique = false)})
//    private List<Faculty> faculties=new ArrayList<>();


}
