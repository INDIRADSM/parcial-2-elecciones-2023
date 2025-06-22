package ar.edu.utn.frc.tup.lc.iv.models;

public class Distrito {
    private Long id;
    private String nombre;

    public Distrito() {}

    public Distrito(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
