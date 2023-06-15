package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Produto;
import br.com.cadsma.gestormobileapi.repositories.ProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProdutoService {
    private static final Logger logger = LoggerFactory.getLogger(ProdutoService.class);

    private final ProdutoRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Produto> list, boolean primeiraExportacao, boolean excluirRegistros) {
        try {
            if(list != null && !list.isEmpty()) {
                if (excluirRegistros)
                    repository.deleteAllByCodigoEmpresa(Produto.ENTITY_NAME, list.get(0).getCodigoEmpresa(), entityManager);

                 if(primeiraExportacao)
                     for(var entity : list)
                         entityManager.persist(entity);
                 else
                    repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirProdutoService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
