package com.nivelics.materiasms.controller;

import com.nivelics.builder.InitMateria;
import com.nivelics.materiasms.dto.MateriaDto;
import com.nivelics.materiasms.entity.Materia;
import com.nivelics.materiasms.service.CreateMateriaService;
import com.nivelics.materiasms.service.FindAllMateriaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
class FindAllMateriaControllerTest {

    @Mock
    private FindAllMateriaService materiaService;

    @InjectMocks
    private FindAllMateriaController materiaController;

    InitMateria materia = new InitMateria();

    @Test
    void readAll() {
        List <Materia>mat = materia.initListMateria();
        when(materiaService.readAll()).thenReturn(mat);
        var response = materiaController.readAll();
        assertEquals(mat.get(0).getCodigo(), response.get(0).getCodigo());
    }
}