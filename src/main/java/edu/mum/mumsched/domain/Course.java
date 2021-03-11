package edu.mum.mumsched.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String courseCode;
    private String title;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Faculty faculty;
    @ElementCollection
    private List<String> sections=new ArrayList<>();


    //    private Integer maxNumber;
//    private Integer minNumber;
//    @ManyToMany
//    private List<Faculty> faculties=new ArrayList<>();
//    @ManyToMany(mappedBy = "courses")
//    private List<Block> blocks=new ArrayList<>();





}
