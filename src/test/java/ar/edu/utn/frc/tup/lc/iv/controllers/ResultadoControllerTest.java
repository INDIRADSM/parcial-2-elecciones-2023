package ar.edu.utn.frc.tup.lc.iv.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(ResultadoController.class)
class ResultadoControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    void getResultados() throws Exception{
        mockMvc.perform(get("/resultados")
                        .param("distrito_id", "1")
                        .param("seccion_id", "1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distrito", is("Córdoba")))
                .andExpect(jsonPath("$.seccion", is("Unión")))
                .andExpect(jsonPath("$.resultados", hasSize(9)))
                .andExpect(jsonPath("$.resultados[0].id", is(1)))
                .andExpect(jsonPath("$.resultados[0].candidato", is("LA LIBERTAD AVANZA")))
                .andExpect(jsonPath("$.resultados[0].votos", is(24965)))
                .andExpect(jsonPath("$.resultados[0].porcentaje", is(0.3497)));
    }
}