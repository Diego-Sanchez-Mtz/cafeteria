package fca.cafeteria.presentation;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.domain.BebidaDomain;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bebidas")
public class BebidaController {
    private final BebidaDomain bebidaDomain;

    //Inyección por constructor
    public BebidaController(BebidaDomain bebidaDomain) {
        this.bebidaDomain = bebidaDomain;
    }

    @PostMapping( "/registrar")
    public Bebida registrarBebida(
            @RequestParam String nombre,
            @RequestParam String tipoBebida){

        return bebidaDomain.registrarBebida(nombre, tipoBebida);

    }
}
