package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Cliente;
import br.com.cadsma.gestormobileapi.repositories.ClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InserirClienteService {
    private static final Logger logger = LoggerFactory.getLogger(InserirClienteService.class);


    private final ClienteRepository repository;

    public InserirClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void execute(List<Cliente> list, boolean excluirRegistros) {
        try {
            if(list != null && list.size() > 0) {
                if (excluirRegistros)
                    this.repository.deleteAllByCodigoEmpresa(list.get(0).getCodigoEmpresa());

                this.repository.saveAll(list);
            }
        }catch (Exception ex) {
            logger.error("InserirClienteService >> execute >> {}", ex.getMessage());
        }
    }
}
