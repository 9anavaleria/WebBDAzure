package co.edu.poli.examen333.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.examen333.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {
   
}
