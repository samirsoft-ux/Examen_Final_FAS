package pe.edu.upc.producto.services.impls;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.producto.entities.proveedor;
import pe.edu.upc.producto.repositories.proveedorRepository;
import pe.edu.upc.producto.services.proveedorService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class proveedorServiceImpl implements proveedorService{
    @Autowired
    private proveedorRepository proveedorRepository;

    @Transactional
    @Override
    public proveedor save(proveedor entity) throws Exception {
        return proveedorRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<proveedor> findAll() throws Exception {
        return proveedorRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<proveedor> findById(Long aLong) throws Exception {
        return proveedorRepository.findById(aLong);
    }

    @Transactional
    @Override
    public proveedor update(proveedor entity) throws Exception {
        return proveedorRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        proveedorRepository.deleteById(aLong);
    }
}
