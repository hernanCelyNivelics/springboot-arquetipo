package com.nivelics.materiasms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "materia")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codigo;

    private String nombre;
}
