package com.erykszczesniak.blog.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    String title;
    @Column(columnDefinition = "VARCHAR(4000)")
    String details;
    @Column
    String featuredImageUrl;
    @Column
    String createdAt;
    @Column
    String category;


}
