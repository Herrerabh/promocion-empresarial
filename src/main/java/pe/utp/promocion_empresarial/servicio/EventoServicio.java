package pe.utp.promocion_empresarial.servicio;

import pe.utp.promocion_empresarial.dto.evento.EventoDto;
import pe.utp.promocion_empresarial.entidad.Evento;

import java.util.List;

public interface EventoServicio {

    List<EventoDto> findAllEventos();

    EventoDto findEventoById(Long eventoId);

    Evento guardarCambiosEvento(Evento evento);

    void eliminarEvento(Long eventoId);
}
