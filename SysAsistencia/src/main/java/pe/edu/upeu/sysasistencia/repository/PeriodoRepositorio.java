package pe.edu.upeu.sysasistencia.repository;

import pe.edu.upeu.sysasistencia.modelo.Periodo;

public class PeriodoRepositorio {
    public Periodo guardar(Periodo p){
        System.out.println("Guardando Periodo");
        return p;
    }
}
