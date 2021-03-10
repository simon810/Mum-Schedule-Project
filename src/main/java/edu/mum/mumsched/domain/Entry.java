package edu.mum.mumsched.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private EntryType entryType;
//    @OneToMany(mappedBy = "entry")
//    private List<Student> students=new ArrayList<>();
}
