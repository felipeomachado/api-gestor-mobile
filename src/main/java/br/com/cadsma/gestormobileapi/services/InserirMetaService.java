package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.entities.Meta;
import br.com.cadsma.gestormobileapi.repositories.GrupoRepository;
import br.com.cadsma.gestormobileapi.repositories.MetaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirMetaService {
    private static final Logger logger = LoggerFactory.getLogger(InserirMetaService.class);

    private final MetaRepository repository;

    public InserirMetaService(MetaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Meta> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirMetaService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
