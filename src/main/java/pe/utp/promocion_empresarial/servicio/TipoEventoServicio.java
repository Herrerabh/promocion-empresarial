package pe.utp.promocion_empresarial.servicio;

import pe.utp.promocion_empresarial.dto.tipoEvento.TipoEventoDto;
import pe.utp.promocion_empresarial.entidad.TipoEvento;

import java.util.List;

public interface TipoEventoServicio {

    List<TipoEventoDto> findAllTipoEventos();

    TipoEventoDto findTipoEventoById(Long tipoEventoId);

    TipoEvento guardarCambiosTipoEvento(TipoEvento tipoEvento);

    void eliminarTipoEvento(Long tipoEventoId);
}
