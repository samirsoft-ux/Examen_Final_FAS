package pe.edu.upc.producto.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "proveedores")
@Data
public class proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", length = 40, nullable = false)
    private String companyName;

    @Column(name = "contact_name", length = 40, nullable = false)
    private String contactName;

    @Column(name = "address", length = 40, nullable = false)
    private String address;

    @Column(name = "city", length = 40, nullable = false)
    private String city;

    @Column(name = "phone", length = 40, nullable = false)
    private String phone;

    @Column(name = "fax", length = 40, nullable = false)
    private String fax;

    //Buenas Practicas
    //Createdat y Status
    @Column(name = "created_at")//Forma correcta para el nombre de una tabla
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;  //tener cuidado con los nombres para un atributo de una clase

    @Column(length = 1, nullable = false)
    private String status;
    //Relaciones(No tiene Foreign Keys)
}
