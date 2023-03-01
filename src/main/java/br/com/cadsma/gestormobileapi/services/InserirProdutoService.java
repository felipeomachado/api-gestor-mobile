package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Produto;
import br.com.cadsma.gestormobileapi.repositories.ProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirProdutoService {
    private static final Logger logger = LoggerFactory.getLogger(InserirProdutoService.class);

    private final ProdutoRepository repository;

    public InserirProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Produto> list, boolean excluirRegistros) {
        try {
            if(list != null && list.size() > 0) {
                if (excluirRegistros)
                    this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());

                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirProdutoService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
