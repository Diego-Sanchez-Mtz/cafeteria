package fca.cafeteria.domain;

import fca.cafeteria.data.CafeteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BebidaDomain {
    @Autowired
    private CafeteriaRepository cafeteriaRepository;


}
