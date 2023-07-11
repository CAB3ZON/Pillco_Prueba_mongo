/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.evaluacion3M5A.model;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author USUARIO
 */

@Document(collection = "Profesor")
@Data
public class Profesor {
    @Id
    private Long profId;
    
    private List<Curso>listCursos;
    private String nombre;
    private String direccion;
    private String telefono;
    
}
