package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.entities.Setor;
import br.com.cadsma.gestormobileapi.enums.ExclusaoEnum;
import br.com.cadsma.gestormobileapi.enums.SituacaoEnum;
import br.com.cadsma.gestormobileapi.repositories.SetorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class SetorService {
    private static final Logger logger = LoggerFactory.getLogger(SetorService.class);

    private final SetorRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public SetorService(SetorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Setor> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(Setor.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("SetorService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Setor> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("SetorService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
