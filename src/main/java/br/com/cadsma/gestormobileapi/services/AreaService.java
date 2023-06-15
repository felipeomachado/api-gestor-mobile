package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.repositories.AreaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class AreaService {
    private static final Logger logger = LoggerFactory.getLogger(AreaService.class);

    private final AreaRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public AreaService(AreaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Area> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(Area.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);
                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("AreaService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Area> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("AreaService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
