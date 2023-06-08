package com.nivelics.materiasms.controller;

import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.dto.MateriaResponseDto;
import com.nivelics.materiasms.service.CreateMateriaService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/materias")
public class CreateMateriaController {

    @Autowired
    private CreateMateriaService createMateriaService;

    @PostMapping("/crear")
    public MateriaDto create(@Valid @RequestBody MateriaDto materiaDto){
        return createMateriaService.create(materiaDto);
    }

    @GetMapping("/list")
    public List<MateriaResponseDto> getMaterias(){
        return createMateriaService.getAll();
    }

    @PutMapping("/{id}")
    public MateriaDto update(@PathVariable String id, @RequestBody MateriaDto materiaDto){
        return createMateriaService.update(id, materiaDto);
    }

}
