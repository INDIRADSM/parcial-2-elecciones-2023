package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/resultados")

public class ResultadoController {
    @GetMapping
    public Map<String, Object> getResultados(
            @RequestParam(value = "distrito_id", required = false) Long distritoId,
            @RequestParam(value = "seccion_id", required = false) Long seccionId) {

        // Validate distrito_id and seccion_id if required

        List<Resultado> resultados = List.of(
                // ...
        );

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("distrito", distritoId != null ? "Córdoba" : "Distrito no especificado");
        response.put("seccion", seccionId != null ? "Unión" : "Sección no especificada");
        response.put("resultados", resultados);

        return response;
    }
}

