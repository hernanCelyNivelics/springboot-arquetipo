package com.nivelics.materiasms.controller;

import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.service.CreateMateriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/materias/crear")
public class CreateMateriaController {

    @Autowired
    private CreateMateriaService createMateriaService;

    @PostMapping
    public MateriaDto create(@Valid @RequestBody MateriaDto materiaDto){
        return createMateriaService.create(materiaDto);
    }


}
