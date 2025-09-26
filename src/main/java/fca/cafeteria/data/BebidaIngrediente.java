package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbebidaingrediente")
public class BebidaIngrediente {
    @Id
    @Column(name = "idbebidaingrediente")
    private int idBebidaIngrediente;
    @Column(name = "idbebida")
    private int idBebida;
    @Column(name = "idingrediente")
    private int idIngrediente;
    @Column(name = "cantidad")
    private int cantidad;

    public void setIdBebidaIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getIdBebidaIngrediente(){
        return this.idBebidaIngrediente;
    }

    public void setIdBebida(int idBebida){
        this.idBebida = idBebida;
    }

    public int getIdBebida(){
        return this.idBebida;
    }

    public  void setIdIngrediente(int idIngrediente){
        this.idIngrediente = idIngrediente;
    }

    public int getIdIngrediente(){
        return this.idIngrediente;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }
}
