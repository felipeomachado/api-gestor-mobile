package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.repositories.PrazoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class PrazoService {
    private static final Logger logger = LoggerFactory.getLogger(PrazoService.class);

    private final PrazoRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public PrazoService(PrazoRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public void inserir(List<Prazo> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(Prazo.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("PrazoService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Prazo> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("PrazoService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
