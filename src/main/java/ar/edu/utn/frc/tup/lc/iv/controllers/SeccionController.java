package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/secciones")
public class SeccionController {
    @GetMapping
    public ResponseEntity<?> getSecciones(
            @RequestParam(value = "distrito_id", required = false) Long distritoId,
            @RequestParam(value = "seccion_id", required = false) Long seccionId) {

        List<Seccion> todas = List.of(
                new Seccion(1L, "Capital"),
                new Seccion(2L, "Calamuchita"),
                new Seccion(3L, "Colón"),
                new Seccion(26L, "Unión")
        );

        List<Seccion> filtradas = (seccionId != null)
                ? todas.stream().filter(s -> s.getId().equals(seccionId)).toList()
                : todas;

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("distrito", "Córdoba");
        response.put("secciones", filtradas);

        return ResponseEntity.ok(response);
    }
}
