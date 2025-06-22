package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/secciones")
public class SeccionController {
    @GetMapping
    public List<Seccion> getSecciones(
            @RequestParam("distrito_id") Long distritoId,
            @RequestParam(value = "seccion_id", required = false) Long seccionId) {

        List<Seccion> todas = List.of(
                new Seccion(1L, "Capital"),
                new Seccion(2L, "Calamuchita"),
                new Seccion(3L, "Colón"),
                new Seccion(26L, "Unión")
        );

        if (seccionId != null) {
            return todas.stream().filter(s -> s.getId().equals(seccionId)).toList();
        }

        return todas;
    }
}
