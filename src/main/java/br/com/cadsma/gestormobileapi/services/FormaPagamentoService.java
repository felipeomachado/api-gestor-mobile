package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.FormaPagamento;
import br.com.cadsma.gestormobileapi.entities.Setor;
import br.com.cadsma.gestormobileapi.enums.ExclusaoEnum;
import br.com.cadsma.gestormobileapi.enums.SituacaoEnum;
import br.com.cadsma.gestormobileapi.repositories.FormaPagamentoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FormaPagamentoService {
    private static final Logger logger = LoggerFactory.getLogger(FormaPagamentoService.class);
    private final FormaPagamentoRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public FormaPagamentoService(FormaPagamentoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<FormaPagamento> list) {
        try {
            if(list != null && !list.isEmpty()) {
                repository.deleteAllByCodigoEmpresa(FormaPagamento.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                for(var entity : list)
                    entityManager.persist(entity);
            }
        }catch (Exception ex) {
            logger.error("InserirFormaPagamentoService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<FormaPagamento> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("InserirFormaPagamentoService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
