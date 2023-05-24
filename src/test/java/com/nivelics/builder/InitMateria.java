package com.nivelics.builder;

import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.entity.Materia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitMateria {

    public MateriaDto initMateria() {
        return MateriaDto
                .builder()
                .id(1)
                .codigo("123")
                .nombre("Sistemas")
                .build();
    }
    public Materia initMat() {
        return Materia
                .builder()
                .id(1)
                .codigo("123")
                .nombre("Sistemas")
                .build();
    }
    public MateriaDto initMateriaSinId() {
        return MateriaDto
                .builder()
                .codigo("123")
                .nombre("Sistemas")
                .build();
    }

    public List<Materia> initListMateria() {
        var materia = Materia
                .builder()
                .id(1)
                .codigo("123")
                .nombre("Sistemas")
                .build();
        List datos = (List) Arrays.asList(materia);

        return datos;
    }

    public Materia deleteMateria() {
        var materia = Materia
                .builder()
                .id(1)
                .build();
        return materia;
    }

}
