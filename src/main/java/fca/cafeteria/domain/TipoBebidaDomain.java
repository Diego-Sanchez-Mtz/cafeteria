package fca.cafeteria.domain;

import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.data.TipoBebidaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoBebidaDomain {
    private final TipoBebidaRepository tipoBebidaRepository;

    //Inyección por cinstructor
    public TipoBebidaDomain(TipoBebidaRepository tipoBebidaRepository) {
        this.tipoBebidaRepository = tipoBebidaRepository;
    }

    //Validar si tipo existe
    public boolean existeTipoBebida(String tipoBebida) {
        return tipoBebidaRepository.findByDescripcion(tipoBebida) != null;
    }

    //Registrar tipo
    public TipoBebida registrarTipoBebida(String descripcion) {
        TipoBebida nuevoTipo = new TipoBebida();
        nuevoTipo.setDescripcion(descripcion);
        return tipoBebidaRepository.save(nuevoTipo);
    }

    //Buscar tipoBebida por descripcion
    public TipoBebida obtenerPorDescripcion(String tipoBebida) {
        return tipoBebidaRepository.findByDescripcion(tipoBebida);
    }
}