package pe.utp.promocion_empresarial.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.utp.promocion_empresarial.dto.marca.MarcaDto;
import pe.utp.promocion_empresarial.entidad.Marca;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Long> {

    List<MarcaDto> findAllBy();

    MarcaDto findByMarcaId(Long rolId);

}
