package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.ClienteRca;
import br.com.cadsma.gestormobileapi.repositories.ClienteRcaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteRcaService {
    private static final Logger logger = LoggerFactory.getLogger(ClienteRcaService.class);

    private final ClienteRcaRepository repository;
    @PersistenceContext
    private EntityManager entityManager;

    public ClienteRcaService(ClienteRcaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<ClienteRca> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(ClienteRca.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        } catch (DataAccessException ex) {
            logger.error("Erro ao inserir ClienteRca: {}", ex.getMessage());
            throw new RuntimeException("Erro ao inserir ClienteRca", ex);
        }
    }

    public List<ClienteRca> recuperar(int codigoEmpresa) {
        try {
            //return repository.findAllByCodigoEmpresa(codigoEmpresa);
            return List.of();
        }catch (Exception ex) {
            logger.error("ClienteRcaService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
