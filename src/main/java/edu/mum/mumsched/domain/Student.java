package edu.mum.mumsched.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Entry entry;
    @OneToMany
    private List<RegisterRecord> registerRecordes=new ArrayList<>();



}
