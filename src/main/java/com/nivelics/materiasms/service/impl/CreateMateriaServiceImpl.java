package com.nivelics.materiasms.service.impl;

import com.nivelics.materiasms.converter.MateriaConverter;
import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.dto.MateriaResponseDto;
import com.nivelics.materiasms.entity.Materia;
import com.nivelics.materiasms.exceptions.MateriaNotFoundException;
import com.nivelics.materiasms.repository.MateriaRepository;
import com.nivelics.materiasms.service.CreateMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateMateriaServiceImpl implements CreateMateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private MateriaConverter materiaConverter;

    @Override
    public MateriaDto create(MateriaDto materiaDto) {
        Materia materia = materiaConverter.dtoToEntity(materiaDto);
        materia = materiaRepository.save(materia);
        return materiaConverter.entityToDto(materia);
    }

    public List<MateriaResponseDto> getAll() {
        return materiaConverter.listEntityToDto(materiaRepository.findAll());
    }

    @Override
    public MateriaDto update(String id, MateriaDto materiaDto) {
        Materia materia = materiaRepository.findById(Integer.parseInt(id)).orElseThrow(null);
        if (materia == null) throw new MateriaNotFoundException();
        materia.setCodigo(materiaDto.getCodigo());
        materia.setNombre(materiaDto.getNombre());
        return materiaConverter.entityToDto(materiaRepository.save(materia));
    }
}
