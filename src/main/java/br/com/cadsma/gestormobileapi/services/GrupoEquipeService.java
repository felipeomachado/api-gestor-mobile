package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.GrupoEquipe;
import br.com.cadsma.gestormobileapi.repositories.GrupoEquipeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class GrupoEquipeService {
    private static final Logger logger = LoggerFactory.getLogger(GrupoEquipeService.class);

    private final GrupoEquipeRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public GrupoEquipeService(GrupoEquipeRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<GrupoEquipe> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(GrupoEquipe.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("GrupoEquipeService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<GrupoEquipe> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("GrupoEquipeService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
