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

@WebMvcTest(SeccionController.class)

class SeccionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getSecciones()  throws Exception {
        mockMvc.perform(get("/secciones")
                        .param("distrito_id", "1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(4)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].nombre", is("Capital")));

    }
    @Test
    public void testGetSeccionById() throws Exception {
        mockMvc.perform(get("/secciones")
                        .param("distrito_id", "1")
                        .param("seccion_id", "2")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].id", is(2)))
                .andExpect(jsonPath("$[0].nombre", is("Calamuchita")));
    }
}