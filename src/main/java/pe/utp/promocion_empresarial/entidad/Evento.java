package pe.utp.promocion_empresarial.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "tbl_evento")
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    @Id
    @Column(name="even_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventoId;

    @Column(name="even_nombre", nullable = false,length = 100)
    private String eventoNombre;

    @Column(name="even_descripcion", nullable = false,length = 255)
    private String eventoDescripcion;

    @Column(name="even_fecha_inicio", nullable = false)
    private Date eventoFechaInicio;

    @Column(name="even_fecha_fin", nullable = false)
    private Date eventoFechaFin;

    @Column(name="even_hora_inicio", nullable = false)
    private Date eventoHoraInicio;

    @Column(name="even_hora_fin", nullable = false)
    private Date eventoHoraFin;

    @Column(name="even_lugar", nullable = false,length = 150)
    private String eventoLugar;

    @Column(name="even_plantilla_diploma", nullable = false, length = 255)
    private String eventoPlantillaDiploma;

    @ManyToOne
    @JoinColumn(name = "tipo_even_id", nullable = false)
    private TipoEvento tipoEvento;

    @OneToMany(mappedBy = "evento")
    private Set<EventoEmprendedor> eventoEmprendedor;

}
