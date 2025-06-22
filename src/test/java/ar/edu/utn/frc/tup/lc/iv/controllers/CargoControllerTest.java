package ar.edu.utn.frc.tup.lc.iv.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CargoController.class)


class CargoControllerTest {

    @BeforeEach
    void setUp() {
    }
    @Autowired
    private MockMvc mockMvc;


    @Test
    void getCargosPorDistrito()throws Exception  {
        mockMvc.perform(get("/cargos")
                        .param("distrito_id", "4")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.distrito.id", is(4)))
                .andExpect(jsonPath("$.distrito.nombre", is("Córdoba")))
                .andExpect(jsonPath("$.cargos", hasSize(4)))
                .andExpect(jsonPath("$.cargos[0].id", is(1)))
                .andExpect(jsonPath("$.cargos[0].nombre", is("PRESIDENTE Y VICE")))
                .andExpect(jsonPath("$.cargos[1].id", is(3)))
                .andExpect(jsonPath("$.cargos[1].nombre", is("DIPUTADO NACIONAL")))
                .andExpect(jsonPath("$.cargos[2].id", is(8)))
                .andExpect(jsonPath("$.cargos[3].id", is(9)));
    }
}