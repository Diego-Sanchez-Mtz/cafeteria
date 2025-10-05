package fca.cafeteria.domain;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.BebidaRepository;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.data.TipoBebidaRepository;
import org.springframework.stereotype.Service;

@Service
public class BebidaDomain {

    private final BebidaRepository bebidaRepository;
    private final TipoBebidaRepository tipoBebidaRepository;

    public BebidaDomain(BebidaRepository bebidaRepository, TipoBebidaRepository tipoBebidaRepository) {
        this.bebidaRepository = bebidaRepository;
        this.tipoBebidaRepository = tipoBebidaRepository;
    }

    public boolean existeBebida(String nombreBebida) {
        return bebidaRepository.findByNombre(nombreBebida) != null;
    }

    public Bebida registrarBebida(String nombre, String tipoDescripcion) {
        // Verificamos si ya existe la bebida
        if (existeBebida(nombre)) {
            System.out.println("Bebida existente");
            return null;
        }

        TipoBebida tipo = tipoBebidaRepository.findByDescripcion(tipoDescripcion)
                .orElseGet(() -> {
                    // Si no existe, lo creamos
                    TipoBebida nuevo = new TipoBebida();
                    nuevo.setDescripcion(tipoDescripcion);
                    return tipoBebidaRepository.save(nuevo);
                });
        // Verificamos si ya existe el tipo
        /*if (tipoBebidaDomain.existeTipoBebida(tipoDescripcion)) {
            TipoBebida tipo = tipoBebidaDomain.obtenerPorDescripcion(tipoDescripcion);
            idTipo = tipo.getId();
        }else{
            // Si no existe el tipo, lo registramos
            TipoBebida nuevoTipo = tipoBebidaDomain.registrarTipoBebida(tipoDescripcion);
            idTipo = nuevoTipo.getId();
        }*/

        // Construimos la nueva bebida
        Bebida bebida = new Bebida();
        bebida.setNombre(nombre);
        bebida.setTipoBebida(tipo);

        return bebidaRepository.save(bebida);
    }

}//Fin de la clase
