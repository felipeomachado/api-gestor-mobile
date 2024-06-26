package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.repositories.FornecedorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FornecedorService {
    private static final Logger logger = LoggerFactory.getLogger(FornecedorService.class);

    private final FornecedorRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Fornecedor> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(Fornecedor.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("FornecedorService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Fornecedor> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("FornecedorService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
