package fca.cafeteria.data;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ttipoBebida")
public class TipoBebida {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "tipoBebida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bebida> bebidas = new ArrayList<>();

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<Bebida> getBebidas() { return bebidas; }
    public void setBebidas(List<Bebida> bebidas) { this.bebidas = bebidas; }
}
