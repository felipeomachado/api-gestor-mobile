package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.entities.Setor;
import br.com.cadsma.gestormobileapi.repositories.FornecedorRepository;
import br.com.cadsma.gestormobileapi.repositories.SetorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirSetorService {
    private static final Logger logger = LoggerFactory.getLogger(InserirSetorService.class);

    private final SetorRepository repository;

    public InserirSetorService(SetorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Setor> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirSetorService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
