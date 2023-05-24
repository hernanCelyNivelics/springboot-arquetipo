package com.nivelics.materiasms.controller;

import com.nivelics.builder.InitMateria;
import com.nivelics.materiasms.service.UpdateMateriaService;
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
class UpdateMateriaControllerTest {

    @InjectMocks
    private UpdateMateriaController updateMateriaController;

    @Mock
    UpdateMateriaService updateMateriaService;

    InitMateria materia = new InitMateria();

    @Test
    void update() {
    }
}