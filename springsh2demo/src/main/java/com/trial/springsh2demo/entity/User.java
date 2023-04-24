package com.trial.springsh2demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_user")
@Setter
@Getter
@ToString

public class User {


        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long id;

        private String fname;
        private String lname;
        private String email;

        private int age;

        private String location;

        @CreationTimestamp
        @Column(name="created_at", nullable=false, updatable=false)
        private Date createdAt;

        @UpdateTimestamp
        @Column(name="updated_at")
        private Date updatedAt;

    }
