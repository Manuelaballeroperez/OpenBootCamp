package Tema6.Interface;

import Tema6.Coche;

import java.util.ArrayList;
import java.util.List;

public class CocheCRDImpl implements CocheCRUD {


    private List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
            coches.add(coche);
    }

    @Override
        public void delete(Coche coche) {
            coches.remove(coche);
        }

    @Override
        public List<Coche> findAll() {
            return coches;
        }
    }

