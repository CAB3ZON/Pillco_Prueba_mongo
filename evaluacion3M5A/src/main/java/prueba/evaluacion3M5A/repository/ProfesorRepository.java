    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prueba.evaluacion3M5A.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import prueba.evaluacion3M5A.model.Profesor;

/**
 *
 * @author USUARIO
 */
public interface ProfesorRepository extends MongoRepository<Profesor,Long> {
    
}
