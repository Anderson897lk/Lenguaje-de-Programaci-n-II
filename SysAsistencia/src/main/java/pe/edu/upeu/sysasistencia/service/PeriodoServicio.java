package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.repository.PeriodoRepositorio;

public class PeriodoServicio {

    PeriodoRepositorio pr=new PeriodoRepositorio();

    public Periodo guardar(Periodo p){
        if (p.getId()!=0){
            return pr.guardar(p);
        }
        else{
            return new Periodo();

        }
    }


}
