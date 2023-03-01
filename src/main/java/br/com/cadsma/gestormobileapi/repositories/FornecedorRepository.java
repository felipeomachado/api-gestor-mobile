package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Fornecedor;
import br.com.cadsma.gestormobileapi.entities.pks.FornecedorPk;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface FornecedorRepository extends MyJpaRepository<Fornecedor, FornecedorPk> {
}
