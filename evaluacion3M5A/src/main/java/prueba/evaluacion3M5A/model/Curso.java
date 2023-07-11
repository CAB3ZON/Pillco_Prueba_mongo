/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.evaluacion3M5A.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author USUARIO
 */
@Document(collection = "Curso")
@Data
public class Curso {
     @Id
    private Long cursoId;
    
    private String nombre;
    private String nivel;
    private String descripcion;
    
}
