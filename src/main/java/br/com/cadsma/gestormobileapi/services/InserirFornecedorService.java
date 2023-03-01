package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.repositories.FornecedorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirFornecedorService {
    private static final Logger logger = LoggerFactory.getLogger(InserirFornecedorService.class);

    private final FornecedorRepository repository;

    public InserirFornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Fornecedor> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirFornecedorService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
