/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.evaluacion3M5A.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.evaluacion3M5A.model.Profesor;
import prueba.evaluacion3M5A.service.ProfesorServicelmpl;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {
     @Autowired
     ProfesorServicelmpl profesorService;
     @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProductos() {
        return new ResponseEntity<>(profesorService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProducto(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profesorService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProducto(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor personaENcontrada = profesorService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setDireccion(p.getDireccion());
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setTelefono(p.getTelefono());
                return new ResponseEntity<>(profesorService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProducto(@PathVariable Long id) {
        profesorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
