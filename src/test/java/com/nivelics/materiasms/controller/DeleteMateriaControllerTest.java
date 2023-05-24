package com.nivelics.materiasms.controller;

import com.nivelics.builder.InitMateria;
import com.nivelics.materiasms.entity.Materia;
import com.nivelics.materiasms.repository.MateriaRepository;
import com.nivelics.materiasms.service.CreateMateriaService;
import com.nivelics.materiasms.service.DeleteMateriaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
class DeleteMateriaControllerTest {


    @InjectMocks
    private DeleteMateriaController deleteMateriaController;

    @Mock
    private DeleteMateriaService deleteMateriaService;

    @Mock
    private MateriaRepository materiaRepository;
    InitMateria initMateria = new InitMateria();

    @Test
    void delete() {
        var mat = initMateria.initMat();
        deleteMateriaController.delete(mat.getId());
        verify(deleteMateriaService, times(1)).delete(mat.getId());
        verify(materiaRepository, times(1)).deleteById(mat.getId());
//        assertThat(materiaRepository.count()).isEqualTo(1);
    }
}