package com.nivelics.materiasms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MateriaDto {

    private int id;

    @NotBlank(message = "El código no debe estar vacío")
    @Size(max = 10)
    private String codigo;

    @NotBlank(message = "El nombre del curso no debe estar vacío")
    @Size(max = 20)
    private String nombre;
}
