package com.blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Setter
@Getter
@Table(name = "roles")
public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(length = 60)
        private String name;


//        @ManyToMany(mappedBy = "roles")
//        private Set<User> users = new HashSet<>();

        // Constructors, getters, and setters

    }


