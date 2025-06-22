package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/resultados")

public class ResultadoController {
    @GetMapping
    public Map<String, Object> getResultados(@RequestParam Long distrito_id, @RequestParam Long seccion_id) {
        List<Resultado> resultados = List.of(
                new Resultado(1, "LA LIBERTAD AVANZA", 24965, 0.3497),
                new Resultado(2, "JUNTOS POR EL CAMBIO", 17239, 0.2415),
                new Resultado(3, "HACEMOS POR NUESTRO PAIS", 16164, 0.2264),
                new Resultado(4, "UNION POR LA PATRIA", 11192, 0.1567),
                new Resultado(5, "FRENTE DE IZQUIERDA Y DE TRABAJADORES - UNIDAD", 750, 0.0105),
                new Resultado(6, "EN BLANCO", 645, 0.0090),
                new Resultado(7, "NULO", 423, 0.0059),
                new Resultado(8, "IMPUGNADO", 1, 0.0001),
                new Resultado(9, "RECURRIDO", 1, 0.0001)
        );

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("distrito", "Córdoba");
        response.put("seccion", "Unión");
        response.put("resultados", resultados);
        return response;
    }
}

