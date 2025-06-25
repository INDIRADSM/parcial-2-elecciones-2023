package ar.edu.utn.frc.tup.lc.iv.repositories;

import ar.edu.utn.frc.tup.lc.iv.entities.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CargoRepository extends JpaRepository<CargoEntity, Long> {
    List<CargoEntity> findByDistritoId(Long distritoId);
}
