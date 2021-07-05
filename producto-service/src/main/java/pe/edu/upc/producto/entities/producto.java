package pe.edu.upc.producto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "productos")
@Data
public class producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", length = 40, nullable = false)
    private String productName;

    @Column(name = "quantity", length = 40, nullable = false)
    private Integer quantity;

    @Column(name = "product_price", nullable = false)
    private Double price;

    @Column(name = "units_stock", nullable = false)
    private Integer stock;

    @Column(name = "discontinued", nullable = false)
    private Boolean discontinued;

    //Buenas Practicas
    //Createdat y Status
    @Column(name = "created_at")//Forma correcta para el nombre de una tabla
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;  //tener cuidado con los nombres para un atributo de una clase

    @Column(length = 1, nullable = false)
    private String status;
    //Relaciones
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proveedor_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private proveedor proveedor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private categoria categoria;
}
