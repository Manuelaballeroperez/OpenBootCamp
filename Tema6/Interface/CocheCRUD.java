package Tema6.Interface;

import Tema6.Coche;

import java.util.List;

public interface CocheCRUD {

     void save(Coche coche);
     void delete(Coche coche);
     List<Coche> findAll();


}
