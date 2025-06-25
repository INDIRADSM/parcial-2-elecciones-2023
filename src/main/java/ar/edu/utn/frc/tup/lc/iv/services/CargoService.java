package ar.edu.utn.frc.tup.lc.iv.services;

import ar.edu.utn.frc.tup.lc.iv.models.Cargo;
import java.util.List;

public interface CargoService {
    List<Cargo> getCargosByDistritoId(Long distritoId);
    List<Cargo> getAllCargos();
}
