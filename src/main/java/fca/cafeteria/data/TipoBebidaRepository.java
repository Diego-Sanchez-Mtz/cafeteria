package fca.cafeteria.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoBebidaRepository extends JpaRepository <TipoBebida, Integer> {
    TipoBebida findByDescripcion(String descripcion);
}

