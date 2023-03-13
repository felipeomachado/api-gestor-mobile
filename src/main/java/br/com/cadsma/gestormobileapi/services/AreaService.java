package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.enums.ExclusaoEnum;
import br.com.cadsma.gestormobileapi.enums.SituacaoEnum;
import br.com.cadsma.gestormobileapi.repositories.AreaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AreaService {
    private static final Logger logger = LoggerFactory.getLogger(AreaService.class);

    private final AreaRepository repository;

    public AreaService(AreaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Area> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("AreaService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Area> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresaAndSituacaoAndExcluido(codigoEmpresa,
                    SituacaoEnum.ATIVO.getCodigo(), ExclusaoEnum.NAO_EXCLUIDO.getCodigo());
        }catch (Exception ex) {
            logger.error("AreaService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }
}
