package edu.mum.mumsched.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullName;
//    @ManyToOne
//    private Block blocks;
    @OneToMany
    private List<Course> courses=new ArrayList<>();


}
