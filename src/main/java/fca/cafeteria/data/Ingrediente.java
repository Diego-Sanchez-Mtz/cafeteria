package fca.cafeteria.data;

public class Ingrediente {
    private int idIngrediente;
    private String nombre;
    private String descripcion;
    private float costo;

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdIngrediente() {
        return this.idIngrediente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }
}
