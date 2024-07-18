package edu.ogpm.CursoWeb.servicio;

import edu.ogpm.CursoWeb.modelo.Empleado;
import edu.ogpm.CursoWeb.respositorio.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> getEmpleadoById(Integer id) {
        return empleadoRepository.findById(id);
    }

    public Empleado createEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Empleado updateEmpleado(Integer id, Empleado empleadoDetails) {
        Empleado empleado = empleadoRepository.findById(id).orElseThrow();
        empleado.setNombre(empleadoDetails.getNombre());
        empleado.setDepartamento(empleadoDetails.getDepartamento());
        empleado.setSueldo(empleadoDetails.getSueldo());
        return empleadoRepository.save(empleado);
    }

    public void deleteEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
    }
}
