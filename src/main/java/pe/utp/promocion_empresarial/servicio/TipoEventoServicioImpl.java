package pe.utp.promocion_empresarial.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.utp.promocion_empresarial.dto.tipoEvento.TipoEventoDto;
import pe.utp.promocion_empresarial.entidad.TipoEvento;
import pe.utp.promocion_empresarial.repositorio.TipoEventoRepositorio;

import java.util.List;

@Service
public class TipoEventoServicioImpl implements TipoEventoServicio {

    @Autowired
    TipoEventoRepositorio tipoEventoRepositorio;

    @Override
    public List<TipoEventoDto> findAllTipoEventos() {
        return tipoEventoRepositorio.findAllBy();
    }

    @Override
    public TipoEventoDto findTipoEventoById(Long tipoEventoId) {
        return tipoEventoRepositorio.findByTipoEventoId(tipoEventoId);
    }

    @Override
    public TipoEvento guardarCambiosTipoEvento(TipoEvento tipoEvento) {
        return tipoEventoRepositorio.save(tipoEvento);
    }

    @Override
    public void eliminarTipoEvento(Long tipoEventoId) {
        tipoEventoRepositorio.deleteById(tipoEventoId);
    }
}

