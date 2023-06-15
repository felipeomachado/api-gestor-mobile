package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Cliente;
import br.com.cadsma.gestormobileapi.entities.Produto;
import br.com.cadsma.gestormobileapi.repositories.ClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {
    private static final Logger logger = LoggerFactory.getLogger(ClienteService.class);


    private final ClienteRepository repository;
    @PersistenceContext
    private EntityManager entityManager;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Cliente> list, boolean primeiraExportacao, boolean excluirRegistros) {
        try {
            if(list != null && !list.isEmpty()) {
                if (excluirRegistros)
                    repository.deleteAllByCodigoEmpresa(Cliente.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                if(primeiraExportacao)
                    for(var entity : list)
                        entityManager.persist(entity);
                else
                    repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirClienteService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
