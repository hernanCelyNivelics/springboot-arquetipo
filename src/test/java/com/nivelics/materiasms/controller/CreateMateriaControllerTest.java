package com.nivelics.materiasms.controller;

import com.google.gson.Gson;
import com.nivelics.builder.InitMateria;
import com.nivelics.materiasms.dto.MateriaDto;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.nivelics.materiasms.service.CreateMateriaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
class CreateMateriaControllerTest {

        @Mock
    private CreateMateriaService materiaService;

    @InjectMocks
    private CreateMateriaController materiaController;

    InitMateria materia = new InitMateria();

    @Test
    void createMock() {
        var materiaDto = materia.initMateria();
        when(materiaService.create(materiaDto)).thenReturn(materiaDto);
        var response = materiaController.create(materiaDto);
        assertEquals(materiaDto, response);
    }

}