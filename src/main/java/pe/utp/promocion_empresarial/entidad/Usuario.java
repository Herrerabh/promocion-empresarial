package pe.utp.promocion_empresarial.entidad;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tbl_usuario")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "usua_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usuarioId;

    @Column(name = "usua_usuario", nullable = false, length = 50)
    private String usuarioUsuario;

    @Column(name = "usua_contrasena", nullable = false, length = 50)
    private String usuarioContrasena;

    @Column(name = "usua_dni", nullable = false, length = 8)
    private String usuarioDni;

    @Column(name = "usua_nombre", nullable = false, length = 50)
    private String usuarioNombre;

    @Column(name = "usua_apellido_paterno", nullable = false, length = 50)
    private String usuarioApellidoPaterno;

    @Column(name = "usua_apellido_materno", nullable = false, length = 50)
    private String usuarioApellidoMaterno;

    @Column(name = "usua_correo", nullable = false, length = 100)
    private String usuarioCorreo;

    @Column(name = "usua_telefono", nullable = false, length = 9)
    private String usuarioTelefono;

    // TODO: Format date (DD-MM-YYYY)
    @Column(name = "usua_fecha_de_nacimiento", nullable = false)
    private Date usuarioFechaDeNacimiento;

    @ColumnDefault(value = "0")
    @Column(name = "usua_estado", nullable = false)
    private Integer usuarioEstado;

    // TODO: Default date time
    @Column(name = "usua_fecha_de_creacion", nullable = true)
    private LocalDateTime usuarioFechaDeCreacion;

    @ManyToMany
    @JoinTable(name = "tbl_usuario_rol", joinColumns = @JoinColumn(name = "usua_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles;

}
