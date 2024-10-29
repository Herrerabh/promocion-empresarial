package pe.utp.promocion_empresarial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.utp.promocion_empresarial.dto.eventoEmprendedor.EventoEmprendedorDto;
import pe.utp.promocion_empresarial.entidad.EventoEmprendedor;
import pe.utp.promocion_empresarial.repositorio.EventoEmprendedorRepositorio;

import java.util.List;

@Service
public class EventoEmprendedorServicioImpl implements EventoEmprendedorServicio {

    @Autowired
    EventoEmprendedorRepositorio eventoEmprendedorRepositorio;

    @Override
    public List<EventoEmprendedorDto> findAllEventoEmprendedores() {
        return eventoEmprendedorRepositorio.findAllBy();
    }

    @Override
    public EventoEmprendedorDto findEventoEmprendedorById(Long eventoEmprendedorId) {
        return eventoEmprendedorRepositorio.findByEventoEmprendedorId(eventoEmprendedorId);
    }

    @Override
    public EventoEmprendedor guardarCambiosEventoEmprendedor(EventoEmprendedor eventoEmprendedor) {
        return eventoEmprendedorRepositorio.save(eventoEmprendedor);
    }

    @Override
    public void eliminarEventoEmprendedor(Long eventoEmprendedorId) {
        eventoEmprendedorRepositorio.deleteById(eventoEmprendedorId);
    }
}
