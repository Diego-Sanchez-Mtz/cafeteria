package fca.cafeteria.domain;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.BebidaRepository;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.data.TipoBebidaRepository;
import org.springframework.stereotype.Service;

@Service
public class BebidaDomain {

    private final BebidaRepository bebidaRepository;
    private final TipoBebidaDomain tipoBebidaDomain;

    //Inyeccion de dependencias por medio del contructor
    public BebidaDomain (BebidaRepository bebidaRepository, TipoBebidaRepository tipoBebidaRepository, TipoBebidaDomain tipoBebidaDomain) {
        this.bebidaRepository = bebidaRepository;
        this.tipoBebidaDomain = tipoBebidaDomain;
    }

    public boolean existeBebida(String bebida) {
        return bebidaRepository.findByNombre(bebida) != null;
    }

    public Bebida registrarBebida(String nombre, String tipoDescripcion) {
        // Verificamos si ya existe la bebida
        if (existeBebida(nombre)) {
            return null;
        }

        Integer idTipo;

        // Verificamos si ya existe el tipo
        if (tipoBebidaDomain.existeTipoBebida(tipoDescripcion)) {
            TipoBebida tipo = tipoBebidaDomain.obtenerPorDescripcion(tipoDescripcion);
            idTipo = tipo.getId();
        }else{
            // Si no existe el tipo, lo registramos
            TipoBebida nuevoTipo = tipoBebidaDomain.registrarTipoBebida(tipoDescripcion);
            idTipo = nuevoTipo.getId();
        }

        // Construimos la nueva bebida
        Bebida bebida = new Bebida();
        bebida.setNombre(nombre);
        bebida.setIdTipoBebida(idTipo);

        return bebidaRepository.save(bebida);
    }

}//Fin de la clase
