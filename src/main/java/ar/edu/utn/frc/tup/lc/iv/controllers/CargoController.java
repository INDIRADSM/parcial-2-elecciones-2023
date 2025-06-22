package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    @GetMapping
        public Map<String, Object> getCargosPorDistrito(@RequestParam("distrito_id") Long distritoId) {
            Map<String, Object> response = new HashMap<>();
            response.put("distrito", new Distrito(distritoId, "Córdoba"));
            response.put("cargos", List.of(
                    new Cargo(1L, "PRESIDENTE Y VICE"),
                    new Cargo(3L, "DIPUTADO NACIONAL"),
                    new Cargo(8L, "PARLAMENTO MERCOSUR NACIONAL"),
                    new Cargo(9L, "PARLAMENTO MERCOSUR REGIONAL")
            ));
            return response;
        }

}
