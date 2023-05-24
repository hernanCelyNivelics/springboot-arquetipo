package com.nivelics.materiasms.converter;

import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.entity.Materia;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MateriaConverter {

    public MateriaDto entityToDto(Materia materia){
        var materiaDto = new MateriaDto();
        BeanUtils.copyProperties(materia, materiaDto);
        return materiaDto;
    }

    public Materia dtoToEntity(MateriaDto materiaDto){
        var materia = new Materia();
        BeanUtils.copyProperties(materiaDto, materia);
        return materia;
    }
}
