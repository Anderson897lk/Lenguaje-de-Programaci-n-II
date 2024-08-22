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
@Table(name = "upeu_escuela")
public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long      id;
    @Column(name = "nombreeap", nullable = false)
    private String nombreeap;
    @Column(name = "estado", nullable = false, length = 8)
    private String estado;
    @Column(name = "inicialeseap", nullable = false, length = 8)
    private String inicialeseap;

    @ManyToOne (fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name= "facultad_id" , referencedColumnName = "id",nullable = false,
            foreignKey =@ForeignKey(name = "FK_ESCUELA_FACULTAD"))
    private Facultad facultadid;
}
