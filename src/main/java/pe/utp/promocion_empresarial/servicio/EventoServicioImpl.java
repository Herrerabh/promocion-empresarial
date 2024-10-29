package pe.utp.promocion_empresarial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.utp.promocion_empresarial.dto.evento.EventoDto;
import pe.utp.promocion_empresarial.entidad.Evento;
import pe.utp.promocion_empresarial.repositorio.EventoRepositorio;

import java.util.List;

@Service
public class EventoServicioImpl implements EventoServicio {

    @Autowired
    EventoRepositorio eventoRepositorio;

    @Override
    public List<EventoDto> findAllEventos() {
        return eventoRepositorio.findAllBy();
    }

    @Override
    public EventoDto findEventoById(Long eventoId) {
        return eventoRepositorio.findByEventoId(eventoId);
    }

    @Override
    public Evento guardarCambiosEvento(Evento evento) {
        return eventoRepositorio.save(evento);
    }

    @Override
    public void eliminarEvento(Long eventoId) {
        eventoRepositorio.deleteById(eventoId);
    }
}
