package com.nivelics.materiasms.converter;

import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.dto.MateriaResponseDto;
import com.nivelics.materiasms.entity.Materia;
import org.mapstruct.ap.internal.gem.ReportingPolicyGem;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MateriaConverter {

    public MateriaDto entityToDto(Materia materia){
        var materiaDto = new MateriaDto();
        BeanUtils.copyProperties(materia, materiaDto);
        return materiaDto;
    }



    public List<MateriaResponseDto> listEntityToDto(List<Materia> materias){
        List<MateriaResponseDto> materiaDto = new ArrayList<>();
        for (Materia materia: materias
             ) {
            var materiaResponseDto = new MateriaResponseDto();
            BeanUtils.copyProperties(materia, materiaResponseDto);
            materiaDto.add(materiaResponseDto);
        }

        return materiaDto;
    }

    public Materia dtoToEntity(MateriaDto materiaDto){
        var materia = new Materia();
        BeanUtils.copyProperties(materiaDto, materia);
        return materia;
    }
}
