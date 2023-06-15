package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.FormaPagamento;
import br.com.cadsma.gestormobileapi.entities.Setor;
import br.com.cadsma.gestormobileapi.entities.pks.FormaPagamentoPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public interface FormaPagamentoRepository extends MyJpaRepository<FormaPagamento, FormaPagamentoPk> {

}
