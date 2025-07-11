package com.levelvini.librarymanagemet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "issues")
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
