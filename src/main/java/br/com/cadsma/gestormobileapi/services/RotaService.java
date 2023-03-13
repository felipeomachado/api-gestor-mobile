package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.enums.ExclusaoEnum;
import br.com.cadsma.gestormobileapi.enums.SituacaoEnum;
import br.com.cadsma.gestormobileapi.repositories.RotaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RotaService {
    private static final Logger logger = LoggerFactory.getLogger(RotaService.class);

    private final RotaRepository repository;

    public RotaService(RotaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Rota> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("RotaService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Rota> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresaAndSituacaoAndExcluido(codigoEmpresa,
                    SituacaoEnum.ATIVO.getCodigo(), ExclusaoEnum.NAO_EXCLUIDO.getCodigo());
        }catch (Exception ex) {
            logger.error("RotaService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
