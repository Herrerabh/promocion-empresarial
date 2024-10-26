package pe.utp.promocion_empresarial.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Table(name = "tbl_tipo_evento")
@NoArgsConstructor
@AllArgsConstructor
public class TipoEvento {

    @Id
    @Column(name = "tipo_even_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tipoEventoId;

    @Column(name = "tipo_even_nombre",nullable = false, length = 50)
    private String tipoEventoNombre;

    @OneToMany(mappedBy = "tipoEvento")
    private Set<Evento> evento;

}
