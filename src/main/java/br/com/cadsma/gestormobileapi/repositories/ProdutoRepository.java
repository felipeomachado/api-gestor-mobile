package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Produto;
import br.com.cadsma.gestormobileapi.entities.pks.ProdutoPk;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface ProdutoRepository extends MyJpaRepository<Produto, ProdutoPk> {
}
