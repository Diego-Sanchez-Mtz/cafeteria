package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbebida")
public class Bebida {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "idtipobebida")
    private int idTipoBebida;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdTipoBebida(int idTipoBebida) {
        this.idTipoBebida = idTipoBebida;
    }

    public int getIdTipoBebida() {
        return idTipoBebida;
    }

}//Fin de la clase
