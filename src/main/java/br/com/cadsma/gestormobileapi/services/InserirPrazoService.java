package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.repositories.PrazoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirPrazoService {
    private static final Logger logger = LoggerFactory.getLogger(InserirPrazoService.class);

    private final PrazoRepository repository;

    public InserirPrazoService(PrazoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Prazo> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirPrazoService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
