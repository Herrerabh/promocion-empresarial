package pe.utp.promocion_empresarial.repositorio;

import org.springframework.stereotype.Repository;
import pe.utp.promocion_empresarial.dto.eventoEmprendedor.EventoEmprendedorDto;
import pe.utp.promocion_empresarial.entidad.EventoEmprendedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface EventoEmprendedorRepositorio extends JpaRepository<EventoEmprendedor, Long> {

    List<EventoEmprendedorDto> findAllBy();

    EventoEmprendedorDto findByEventoEmprendedorId(Long eventoEmprendedorId);

}
