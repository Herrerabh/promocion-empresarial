package pe.utp.promocion_empresarial.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.utp.promocion_empresarial.dto.tipoEvento.TipoEventoDto;
import pe.utp.promocion_empresarial.entidad.TipoEvento;

import java.util.List;

@Repository
public interface TipoEventoRepositorio extends JpaRepository<TipoEvento, Long> {

    List<TipoEventoDto> findAllBy();

    TipoEventoDto findByTipoEventoId(Long tipoEventoId);
}
