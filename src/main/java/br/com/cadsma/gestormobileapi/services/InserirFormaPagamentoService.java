package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.FormaPagamento;
import br.com.cadsma.gestormobileapi.repositories.FormaPagamentoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirFormaPagamentoService {
    private static final Logger logger = LoggerFactory.getLogger(InserirFormaPagamentoService.class);


    private final FormaPagamentoRepository repository;

    public InserirFormaPagamentoService(FormaPagamentoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<FormaPagamento> list) {
        try {
            if(list != null && list.size() > 0) {
                this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());
                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirFormaPagamentoService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
