package pe.edu.upc.producto.services.impls;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.producto.entities.categoria;
import pe.edu.upc.producto.repositories.categoriaRepository;
import pe.edu.upc.producto.services.categoriaService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class categoriaServiceImpl implements categoriaService{
    @Autowired
    private categoriaRepository categoriaRepository;

    @Transactional
    @Override
    public categoria save(categoria entity) throws Exception {
        return categoriaRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<categoria> findAll() throws Exception {
        return categoriaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<categoria> findById(Long aLong) throws Exception {
        return categoriaRepository.findById(aLong);
    }

    @Transactional
    @Override
    public categoria update(categoria entity) throws Exception {
        return categoriaRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) throws Exception {
        categoriaRepository.deleteById(aLong);
    }
}
