package pe.utp.promocion_empresarial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.utp.promocion_empresarial.dto.eventoEmprendedor.EventoEmprendedorDto;
import pe.utp.promocion_empresarial.entidad.EventoEmprendedor;
import pe.utp.promocion_empresarial.servicio.EventoEmprendedorServicio;

import java.util.List;

@RestController
@RequestMapping("/eventoEmprendedor")
public class EventoEmprendedorControlador {

    @Autowired
    EventoEmprendedorServicio eventoEmprendedorServicio;

    @GetMapping
    public List<EventoEmprendedorDto> findAllEventoEmprendedores() {
        return eventoEmprendedorServicio.findAllEventoEmprendedores();
    }

    @GetMapping("/{eventoEmprendedorId}")
    public ResponseEntity<EventoEmprendedorDto> findEventoEmprendedorById(@PathVariable Long eventoEmprendedorId) {
        EventoEmprendedorDto eventoEmprendedorDto = eventoEmprendedorServicio.findEventoEmprendedorById(eventoEmprendedorId);
        return ResponseEntity.ok()
                .body(eventoEmprendedorDto);
    }

    @PostMapping
    public ResponseEntity<EventoEmprendedor> guardarEventoEmprendedor(@RequestBody EventoEmprendedor eventoEmprendedor) {
        EventoEmprendedor eventoEmprendedorGuardado = eventoEmprendedorServicio.guardarCambiosEventoEmprendedor(eventoEmprendedor);
        return ResponseEntity.ok()
                .body(eventoEmprendedorGuardado);
    }

    @PutMapping
    public ResponseEntity<EventoEmprendedor> editarEventoEmprendedor(@RequestBody EventoEmprendedor eventoEmprendedor) {
        EventoEmprendedor eventoEmprendedorGuardado = eventoEmprendedorServicio.guardarCambiosEventoEmprendedor(eventoEmprendedor);
        return ResponseEntity.ok()
                .body(eventoEmprendedorGuardado);
    }

    @DeleteMapping("/{eventoEmprendedorId}")
    public ResponseEntity<Void> eliminarEventoEmprendedor(@PathVariable Long eventoEmprendedorId) {
        eventoEmprendedorServicio.eliminarEventoEmprendedor(eventoEmprendedorId);
        return ResponseEntity.noContent()
                .build();
    }
}