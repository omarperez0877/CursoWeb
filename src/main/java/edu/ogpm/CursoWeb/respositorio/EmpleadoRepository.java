package edu.ogpm.CursoWeb.respositorio;

import edu.ogpm.CursoWeb.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
