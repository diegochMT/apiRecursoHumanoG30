package co.usa.recursohumano.recursohumano.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.usa.recursohumano.recursohumano.model.Empleado;
import co.usa.recursohumano.recursohumano.service.EmpleadoServicio;

@RestController
@RequestMapping("api/empleado")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class EmpleadoControlador {
    @Autowired
    private EmpleadoServicio empleadoServicio;

    @GetMapping("/all")
    public List<Empleado>getEmpleados(){
        return empleadoServicio.getALL();
    }

    @GetMapping("/{id}")
    public Optional<Empleado>getEmpleado(@PathVariable("id")int id){
        return empleadoServicio.getEmpleado(id);

    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado save(@RequestBody Empleado empleado){
        return empleadoServicio.save(empleado);
    }

}
