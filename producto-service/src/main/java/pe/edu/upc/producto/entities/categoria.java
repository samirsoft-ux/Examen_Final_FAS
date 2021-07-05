package pe.edu.upc.producto.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "categorias")
@Data
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name", length = 40, nullable = false)
    private String categoryName;

    @Column(name = "description", length = 60, nullable = false)
    private String description;

    @Column(name = "picture", length = 60, nullable = false)
    @Lob
    private String picture;

    //Buenas Practicas
    //Createdat y Status
    @Column(name = "created_at")//Forma correcta para el nombre de una tabla
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;  //tener cuidado con los nombres para un atributo de una clase

    @Column(length = 1, nullable = false)
    private String status;
    //Relaciones(No tiene Foreign Keys)
}
