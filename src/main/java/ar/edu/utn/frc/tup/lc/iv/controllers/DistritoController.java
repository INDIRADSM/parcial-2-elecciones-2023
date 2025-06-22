package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/distritos")
public class DistritoController {
    @GetMapping
    public List<Distrito> getDistritos(@RequestParam(required = false, name = "distrito_nombre") String nombre) {
        List<Distrito> distritos = List.of(
                new Distrito(1L, "Ciudad Autónoma de Buenos Aires"),
                new Distrito(2L, "Buenos Aires"),
                new Distrito(3L, "Catamarca"),
                new Distrito(4L, "Córdoba")
        );
        if (nombre == null || nombre.isEmpty()) return distritos;
        return distritos.stream().filter(d -> d.getNombre().toLowerCase().contains(nombre.toLowerCase())).toList();
    }
}


