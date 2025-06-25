package ar.edu.utn.frc.tup.lc.iv.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cargos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "distrito_id", nullable = false)
    private Long distritoId;
}
