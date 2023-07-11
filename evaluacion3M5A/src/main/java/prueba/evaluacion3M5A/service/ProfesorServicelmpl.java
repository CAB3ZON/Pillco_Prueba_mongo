/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.evaluacion3M5A.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import prueba.evaluacion3M5A.model.Profesor;
import prueba.evaluacion3M5A.repository.ProfesorRepository;

/**
 *
 * @author USUARIO
 */
@Service
public class ProfesorServicelmpl extends GenericServiceImpl<Profesor,Long> implements GenericService<Profesor,Long> {

    
   @Autowired
   ProfesorRepository profesorRepository;
    @Override
    public CrudRepository<Profesor, Long> getDao() {
return profesorRepository;    }
    
}
