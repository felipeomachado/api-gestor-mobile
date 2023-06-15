package br.com.cadsma.gestormobileapi.services;

import br.com.cadsma.gestormobileapi.entities.Empresa;
import br.com.cadsma.gestormobileapi.repositories.EmpresaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmpresaService {
    private static final Logger logger = LoggerFactory.getLogger(EmpresaService.class);

    private final EmpresaRepository repository;

    public EmpresaService(EmpresaRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void inserir(Empresa empresa) {
        try {
            repository.save(empresa);

            repository.findById(empresa.getCodigoEmpresa()).ifPresent(obj -> {
                obj.setNome(empresa.getNome());
                obj.setFantasia(empresa.getFantasia());
                obj.setQtdMesesMediaSugestao(empresa.getQtdMesesMediaSugestao());
                obj.setEndereco(empresa.getEndereco());
                obj.setBairro(empresa.getBairro());
                obj.setCidade(empresa.getCidade());
                obj.setUf(empresa.getUf());
                obj.setTelefone(empresa.getTelefone());
                obj.setPermiteDesconto(empresa.isPermiteDesconto());
                obj.setTipoDesconto(empresa.getTipoDesconto());
                obj.setTipoHistoricoCompras(empresa.getTipoHistoricoCompras());
                obj.setControlaSaldo(empresa.isControlaSaldo());
                obj.setApenasComPreco(empresa.isApenasComPreco());
                obj.setPercentualReajusteConsumidor(obj.getPercentualReajusteConsumidor());
                obj.setPercentualFinanPrazo(obj.getPercentualFinanPrazo());
                obj.setProdSemSaldoVenda(obj.isProdSemSaldoVenda());
                obj.setLimiteDesconto(obj.getLimiteDesconto());

                repository.save(obj);
            });
        }catch (Exception ex) {
            logger.error("EmpresaService >> inserir >> {}", ex.getMessage());
            throw ex;
        }
    }

    public Empresa recuperar(Long codigoEmpresa) {
        try {
            return repository.findById(codigoEmpresa).orElseThrow();
        }catch (Exception ex) {
            logger.error("EmpresaService >> recuperar >> {}", ex.getMessage());
            throw ex;
        }
    }
}
