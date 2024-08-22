package pe.edu.upeu.sysasistencia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.service.PeriodoServicio;

@RestController
@RequestMapping("/prueba")

public class PeriodoControl {
    PeriodoServicio ps;

    @GetMapping
    public Periodo mostrarDatos(){
        ps=new PeriodoServicio();
        return ps.guardar(new Periodo(1L, "2024-2","Active"));
    }


}
