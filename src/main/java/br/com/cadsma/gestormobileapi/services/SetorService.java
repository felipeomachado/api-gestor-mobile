package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Setor;
import br.com.cadsma.gestormobileapi.enums.ExclusaoEnum;
import br.com.cadsma.gestormobileapi.enums.SituacaoEnum;
import br.com.cadsma.gestormobileapi.repositories.SetorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SetorService {
    private static final Logger logger = LoggerFactory.getLogger(SetorService.class);

    private final SetorRepository repository;

    public SetorService(SetorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(List<Setor> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("SetorService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public List<Setor> recuperar(int codigoEmpresa) {
        try {
            return repository.findAllByCodigoEmpresaAndSituacaoAndExcluido(codigoEmpresa,
                    SituacaoEnum.ATIVO.getCodigo(), ExclusaoEnum.NAO_EXCLUIDO.getCodigo());
        }catch (Exception ex) {
            logger.error("SetorService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
