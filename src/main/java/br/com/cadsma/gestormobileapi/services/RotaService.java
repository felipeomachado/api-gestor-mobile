package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.enums.ExclusaoEnum;
import br.com.cadsma.gestormobileapi.enums.SituacaoEnum;
import br.com.cadsma.gestormobileapi.repositories.RotaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class RotaService {
    private static final Logger logger = LoggerFactory.getLogger(RotaService.class);

    private final RotaRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public RotaService(RotaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Rota> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(Rota.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("RotaService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Rota> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("RotaService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
