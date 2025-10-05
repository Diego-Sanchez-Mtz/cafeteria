package fca.cafeteria.domain;

import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.data.TipoBebidaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoBebidaDomain {
    private final TipoBebidaRepository tipoBebidaRepository;

    //Inyección por cinstructor
    public TipoBebidaDomain(TipoBebidaRepository tipoBebidaRepository) {
        this.tipoBebidaRepository = tipoBebidaRepository;
    }

    public Optional<TipoBebida> buscarPorDescripcion(String descripcion) {
        return tipoBebidaRepository.findByDescripcion(descripcion);
    }

    //Validar si tipo existe
    public boolean existeTipoBebida(String tipoBebida) {
        return buscarPorDescripcion(tipoBebida).isPresent();
    }

    //Registrar tipo
    public TipoBebida registrarTipoBebida(String descripcion) {
        return tipoBebidaRepository.findByDescripcion(descripcion)
                .orElseGet(()-> {
                    TipoBebida nuevoTipo = new TipoBebida();
                    nuevoTipo.setDescripcion(descripcion);
                    return tipoBebidaRepository.save(nuevoTipo);
                });
    }

    //Buscar tipoBebida por descripcion
    public TipoBebida obtenerPorDescripcion(String descripcion) {
        return tipoBebidaRepository.findByDescripcion(descripcion).orElse(null);
    }


}