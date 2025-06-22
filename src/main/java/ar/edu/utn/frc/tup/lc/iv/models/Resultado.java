package ar.edu.utn.frc.tup.lc.iv.models;

public class Resultado {
    private int orden;
    private String nombre;
    private int votos;
    private double porcentaje;

    public Resultado() {}

    public Resultado(int orden, String nombre, int votos, double porcentaje) {
        this.orden = orden;
        this.nombre = nombre;
        this.votos = votos;
        this.porcentaje = porcentaje;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
