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
@Table(name = "upeu_evento_inscripcion")
public class EventoInscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "estado", nullable = false, length = 8)
    private String estado;
    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona personaId;
    @JoinColumn(name = "evento_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Evento eventoId;
}