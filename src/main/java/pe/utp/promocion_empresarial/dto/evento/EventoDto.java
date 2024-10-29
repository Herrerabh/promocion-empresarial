package pe.utp.promocion_empresarial.dto.evento;

import pe.utp.promocion_empresarial.entidad.TipoEvento;

import java.time.LocalTime;
import java.util.Date;

public interface EventoDto {

    Long getEventoId();

    String getEventoNombre();

    String getEventoDescripcion();

    Date getEventoFechaInicio();

    Date getEventoFechaFin();

    LocalTime getEventoHoraInicio();

    LocalTime getEventoHoraFin();

    String getEventoLugar();

    String getEventoPlantillaDiploma();

    TipoEvento getTipoEvento();

}
