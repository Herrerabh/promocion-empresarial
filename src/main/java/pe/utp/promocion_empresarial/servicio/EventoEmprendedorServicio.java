package pe.utp.promocion_empresarial.servicio;

import pe.utp.promocion_empresarial.dto.eventoEmprendedor.EventoEmprendedorDto;
import pe.utp.promocion_empresarial.entidad.EventoEmprendedor;

import java.util.List;

public interface EventoEmprendedorServicio {

    List<EventoEmprendedorDto> findAllEventoEmprendedores();

    EventoEmprendedorDto findEventoEmprendedorById(Long eventoEmprendedorId);

    EventoEmprendedor guardarCambiosEventoEmprendedor(EventoEmprendedor eventoEmprendedor);

    void eliminarEventoEmprendedor(Long eventoEmprendedorId);
}
