package fca.cafeteria.data;

public class BebidaIngrediente {
    private int idBebidaIngrediente;
    private int idBebida;
    private int idIngrediente;
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
