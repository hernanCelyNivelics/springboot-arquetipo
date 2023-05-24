package com.nivelics.materiasms.controller;

import com.nivelics.builder.InitMateria;
import com.nivelics.materiasms.service.FindByIdMateriaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
class FindByIdMateriaControllerTest {

    InitMateria initMateria = new InitMateria();;

    @InjectMocks
    private FindByIdMateriaController findByIdMateriaController;

    @Mock
    private FindByIdMateriaService findByIdMateriaService;

    @Test
    void findById() {
        var materia = initMateria.initMat();
        when(findByIdMateriaService.readById(materia.getId())).thenReturn(initMateria.initMat());
        var response = findByIdMateriaController.findById(materia.getId());
        assertEquals(materia,response);
    }
}