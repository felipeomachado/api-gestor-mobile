package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.repositories.PrazoRepository;
import br.com.cadsma.gestormobileapi.repositories.RotaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirRotaService {
    private static final Logger logger = LoggerFactory.getLogger(InserirRotaService.class);

    private final RotaRepository repository;

    public InserirRotaService(RotaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Rota> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirRotaService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
