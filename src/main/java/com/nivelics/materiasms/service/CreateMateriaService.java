package com.nivelics.materiasms.service;

import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.dto.MateriaResponseDto;

import java.util.List;

public interface CreateMateriaService {

    MateriaDto create(MateriaDto materiaDto);

    List<MateriaResponseDto> getAll();

    MateriaDto update(String id, MateriaDto materiaDto);
}
