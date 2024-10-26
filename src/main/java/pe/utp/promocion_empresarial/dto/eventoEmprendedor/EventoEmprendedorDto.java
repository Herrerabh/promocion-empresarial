package pe.utp.promocion_empresarial.dto.eventoEmprendedor;

import pe.utp.promocion_empresarial.entidad.Emprendedor;
import pe.utp.promocion_empresarial.entidad.Evento;

public interface EventoEmprendedorDto {
    Long getEventoEmprendedorId();
    Integer getEventoEmprendedorAsistencia();
    String getEventoEmprendedorDiploma();
    Integer getEventoEmprendedorFirmaDiploma();

    Evento getEvento();

    Emprendedor getEmprendedor();

}
