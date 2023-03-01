package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.ProdutoInfo;
import jdk.jshell.spi.ExecutionControl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtualizarProdutoService {
    private static final Logger logger = LoggerFactory.getLogger(InserirProdutoService.class);

    public void execute(List<ProdutoInfo> list) {
        try {
            System.out.print("Not iplemented");
        }catch (Exception ex) {
            logger.error("AtualizarProdutoService >> execute >> {}", ex.getMessage());
            throw ex;
        }
    }
}
