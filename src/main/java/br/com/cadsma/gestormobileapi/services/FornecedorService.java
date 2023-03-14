package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.repositories.FornecedorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FornecedorService {
    private static final Logger logger = LoggerFactory.getLogger(FornecedorService.class);

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Fornecedor> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("FornecedorService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Fornecedor> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresa(codigoEmpresa);
        }catch (Exception ex) {
            logger.error("FornecedorService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
