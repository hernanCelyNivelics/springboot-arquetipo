package com.nivelics.materiasms.controller;

import com.google.gson.Gson;
import com.nivelics.builder.InitMateria;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class CreateMateriaControllerDbTest {

    @Autowired
    private MockMvc mockMvc;

    InitMateria materia = new InitMateria();

    @Test
    void createConBd() throws Exception {
        Gson gson = new Gson();
        var materiaDto = materia.initMateriaSinId();
        var materisJson = gson.toJson(materiaDto);
        mockMvc.perform(MockMvcRequestBuilders.post(
                                "/api/v1/materias/crear")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(materisJson)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
}
