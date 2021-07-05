package pe.edu.upc.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.producto.entities.proveedor;

@Repository
public interface proveedorRepository extends JpaRepository<proveedor, Long> {
}
