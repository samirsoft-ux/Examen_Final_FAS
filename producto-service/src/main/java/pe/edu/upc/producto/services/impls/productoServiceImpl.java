package pe.edu.upc.producto.services.impls;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.producto.entities.producto;
import pe.edu.upc.producto.repositories.productoRepository;
import pe.edu.upc.producto.services.productoService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class productoServiceImpl implements productoService{
    @Autowired
    private productoRepository productoRepository;

    @Transactional
    @Override
    public producto save(producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<producto> findAll() throws Exception {
        return productoRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<producto> findById(Long aLong) throws Exception {
        return productoRepository.findById(aLong);
    }

    @Transactional
    @Override
    public producto update(producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        productoRepository.deleteById(aLong);
    }
}
