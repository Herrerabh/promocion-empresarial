package pe.utp.promocion_empresarial.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.utp.promocion_empresarial.dto.tipoEvento.TipoEventoDto;
import pe.utp.promocion_empresarial.entidad.TipoEvento;
import pe.utp.promocion_empresarial.servicio.TipoEventoServicio;

import java.util.List;

@RestController
@RequestMapping("/tipoEvento")
public class TipoEventoControlador {

    @Autowired
    TipoEventoServicio tipoEventoServicio;

    @GetMapping
    public List<TipoEventoDto> findAllTiposEvento() {
        return tipoEventoServicio.findAllTipoEventos();
    }

    @GetMapping("/{tipoEventoId}")
    public ResponseEntity<TipoEventoDto> findTipoEventoById(@PathVariable Long tipoEventoId) {
        TipoEventoDto tipoEventoDto = tipoEventoServicio.findTipoEventoById(tipoEventoId);
        return ResponseEntity.ok()
                .body(tipoEventoDto);
    }

    @PostMapping
    public ResponseEntity<TipoEvento> guardarTipoEvento(@RequestBody TipoEvento tipoEvento) {
        TipoEvento tipoEventoGuardado = tipoEventoServicio.guardarCambiosTipoEvento(tipoEvento);
        return ResponseEntity.ok()
                .body(tipoEventoGuardado);
    }

    @PutMapping
    public ResponseEntity<TipoEvento> editarTipoEvento(@RequestBody TipoEvento tipoEvento) {
        TipoEvento tipoEventoGuardado = tipoEventoServicio.guardarCambiosTipoEvento(tipoEvento);
        return ResponseEntity.ok()
                .body(tipoEventoGuardado);
    }

    @DeleteMapping("/{tipoEventoId}")
    public ResponseEntity<Void> eliminarTipoEvento(@PathVariable Long tipoEventoId) {
        tipoEventoServicio.eliminarTipoEvento(tipoEventoId);
        return ResponseEntity.noContent()
                .build();
    }
}
