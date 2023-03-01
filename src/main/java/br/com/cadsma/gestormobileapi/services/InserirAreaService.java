package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.repositories.AreaRepository;
import br.com.cadsma.gestormobileapi.repositories.GrupoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirAreaService {
    private static final Logger logger = LoggerFactory.getLogger(InserirAreaService.class);

    private final AreaRepository repository;

    public InserirAreaService(AreaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Area> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirAreaService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
