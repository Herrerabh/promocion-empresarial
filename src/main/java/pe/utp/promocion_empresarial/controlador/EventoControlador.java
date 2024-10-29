package pe.utp.promocion_empresarial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.utp.promocion_empresarial.dto.evento.EventoDto;
import pe.utp.promocion_empresarial.entidad.Evento;
import pe.utp.promocion_empresarial.servicio.EventoServicio;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoControlador {

    @Autowired
    EventoServicio eventoServicio;

    @GetMapping
    public List<EventoDto> findAllEventos() {
        return eventoServicio.findAllEventos();
    }

    @GetMapping("/{eventoId}")
    public ResponseEntity<EventoDto> findEventoById(@PathVariable Long eventoId) {
        EventoDto eventoDto = eventoServicio.findEventoById(eventoId);
        return ResponseEntity.ok()
                .body(eventoDto);
    }

    @PostMapping
    public ResponseEntity<Evento> guardarEvento(@RequestBody Evento evento) {
        Evento eventoGuardado = eventoServicio.guardarCambiosEvento(evento);
        return ResponseEntity.ok()
                .body(eventoGuardado);
    }

    @PutMapping
    public ResponseEntity<Evento> editarEvento(@RequestBody Evento evento) {
        Evento eventoGuardado = eventoServicio.guardarCambiosEvento(evento);
        return ResponseEntity.ok()
                .body(eventoGuardado);
    }

    @DeleteMapping("/{eventoId}")
    public ResponseEntity<Void> eliminarEvento(@PathVariable Long eventoId) {
        eventoServicio.eliminarEvento(eventoId);
        return ResponseEntity.noContent()
                .build();
    }
}
