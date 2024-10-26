package pe.utp.promocion_empresarial.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "tbl_evento_emprendedor")
@NoArgsConstructor
@AllArgsConstructor
public class EventoEmprendedor {

    @Id
    @Column(name = "even_empr_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventoEmprendedorId;

    @Column(name="even_empr_asistencia", nullable = false)
    @ColumnDefault(value = "0")
    private Integer eventoEmprendedorAsistencia;

    @Column(name="even_empr_diploma", nullable = false, length = 255)
    private String eventoEmprendedorDiploma;

    @Column(name="even_empr_estado_firma_diploma", nullable = false)
    @ColumnDefault(value = "0")
    private Integer eventoEmprendedorEstadoFirmaDiploma;

    @ManyToOne
    @JoinColumn(name="even_id", nullable = false)
    private Evento evento;

    @ManyToOne
    @JoinColumn(name="empr_id", nullable = false)
    private Emprendedor emprendedor;



}
