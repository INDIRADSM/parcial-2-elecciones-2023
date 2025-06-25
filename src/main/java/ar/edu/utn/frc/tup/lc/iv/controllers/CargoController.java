package ar.edu.utn.frc.tup.lc.iv.controllers;
import ar.edu.utn.frc.tup.lc.iv.models.*;
import ar.edu.utn.frc.tup.lc.iv.models.Cargo;
import ar.edu.utn.frc.tup.lc.iv.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.*;

@RestController
@RequestMapping("/cargos")
public class CargoController {
    private final CargoService cargoService;

    // 👇 Este constructor es fundamental para que funcione la inyección
    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping
    public ResponseEntity<?> getCargos(@RequestParam(value = "distrito_id", required = false) Long distritoId) {
        if (distritoId == null) {
            // Si no se pasa distrito_id, respondemos con todos los cargos simulados
            List<Cargo> cargos = List.of(
                    new Cargo(1L, "PRESIDENTE Y VICE"),
                    new Cargo(3L, "DIPUTADO NACIONAL"),
                    new Cargo(8L, "PARLAMENTO MERCOSUR NACIONAL"),
                    new Cargo(9L, "PARLAMENTO MERCOSUR REGIONAL")
            );
            return ResponseEntity.ok(cargos);
        } else {
            // Si se pasa distrito_id, devolvemos un Map con distrito y cargos simulados
            Map<String, Object> response = new HashMap<>();
            response.put("distrito", new Distrito(distritoId, "Córdoba"));
            response.put("cargos", List.of(
                    new Cargo(1L, "PRESIDENTE Y VICE"),
                    new Cargo(3L, "DIPUTADO NACIONAL"),
                    new Cargo(8L, "PARLAMENTO MERCOSUR NACIONAL"),
                    new Cargo(9L, "PARLAMENTO MERCOSUR REGIONAL")
            ));
            return ResponseEntity.ok(response);
        }
    }
}
