package com.nivelics.materiasms.configurations;

import com.nivelics.materiasms.exceptions.MateriaNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import static com.nivelics.materiasms.configurations.Constants.MATERIA_NOT_FOUND_EXCEPTION;
import static com.nivelics.materiasms.configurations.Constants.RESPONSE_MESSAGE_KEY;

@ControllerAdvice
public class ControllerAdvisor {
    @ExceptionHandler(MateriaNotFoundException.class)
    public ResponseEntity<Map<String, String>>handleMateriaException(MateriaNotFoundException materiaNotFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(RESPONSE_MESSAGE_KEY, MATERIA_NOT_FOUND_EXCEPTION));

    }
}
