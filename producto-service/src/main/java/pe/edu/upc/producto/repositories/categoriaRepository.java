package pe.edu.upc.producto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.producto.entities.categoria;

@Repository
public interface categoriaRepository extends JpaRepository<categoria, Long> {
}
