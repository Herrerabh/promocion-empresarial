package pe.utp.promocion_empresarial.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.utp.promocion_empresarial.dto.evento.EventoDto;
import pe.utp.promocion_empresarial.entidad.Evento;
import java.util.List;

@Repository
public interface EventoRepositorio extends JpaRepository<Evento, Long> {

    List<EventoDto> findAllBy();

    EventoDto findByEventoId(Long eventoId);
}
