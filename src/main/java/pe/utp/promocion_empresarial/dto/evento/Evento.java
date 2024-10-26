package pe.utp.promocion_empresarial.dto.evento;

import pe.utp.promocion_empresarial.entidad.TipoEvento;

import java.util.Date;

public interface Evento {

    Long getEventoId();

    String getEventoNombre();

    String getEventoDescripcion();

    Date getEventoFechaInicio();

    Date getEventoFechaFin();

    Date getEventoHoraInicio();

    Date getEventoHoraFin();

    String getEventoLugar();

    String getEventoPlantillaDiploma();

    TipoEvento getTipoEvento();

}
