package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Titulo;
import br.com.cadsma.gestormobileapi.repositories.TituloRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirTituloService {
    private static final Logger logger = LoggerFactory.getLogger(InserirTituloService.class);


    private final TituloRepository repository;

    public InserirTituloService(TituloRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Titulo> list, boolean excluirRegistros) {
        try {
            if(list != null && list.size() > 0) {
                if (excluirRegistros)
                    this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());

                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirTituloService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
