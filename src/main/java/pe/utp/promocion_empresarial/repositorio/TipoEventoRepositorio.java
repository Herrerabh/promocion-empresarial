package pe.utp.promocion_empresarial.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.utp.promocion_empresarial.dto.tipoEvento.TipoEventoDto;
import pe.utp.promocion_empresarial.entidad.TipoEvento;

import java.util.List;

public interface TipoEventoRepositorio extends JpaRepository<TipoEvento, Long> {

    List<TipoEventoDto> findAllBy();

    TipoEventoDto findByTipoEventoId(Long tipoEventoId);
}
