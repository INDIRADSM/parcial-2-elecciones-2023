package ar.edu.utn.frc.tup.lc.iv.services.impl;
import ar.edu.utn.frc.tup.lc.iv.entities.CargoEntity;
import ar.edu.utn.frc.tup.lc.iv.models.Cargo;
import ar.edu.utn.frc.tup.lc.iv.repositories.CargoRepository;
import ar.edu.utn.frc.tup.lc.iv.services.CargoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.utn.frc.tup.lc.iv.services.CargoService;

@Service
public class CargoServiceImpl implements CargoService {
    private final CargoRepository cargoRepository;

    public CargoServiceImpl(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    @Override
    public List<Cargo> getCargosByDistritoId(Long distritoId) {
        List<CargoEntity> entities = cargoRepository.findByDistritoId(distritoId);
        return entities.stream()
                .map(e -> new Cargo(e.getId(), e.getNombre()))
                .collect(Collectors.toList());
    }
    @Override
    public List<Cargo> getAllCargos() {
        return cargoRepository.findAll()
                .stream()
                .map(entity -> new Cargo(entity.getId(), entity.getNombre()))
                .toList();
    }

}
