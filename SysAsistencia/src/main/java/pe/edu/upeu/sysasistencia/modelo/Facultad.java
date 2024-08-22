package pe.edu.upeu.sysasistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "upeu_facultad")
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    @Column(length = 60, nullable = false)
    private String nombreFac;
    @Column(length = 8, nullable = false)
    private String estado;
    @Column(length = 8, nullable = false)
    private String iniciales;

}
