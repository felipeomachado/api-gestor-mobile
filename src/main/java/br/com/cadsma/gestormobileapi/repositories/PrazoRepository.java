package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Prazo;
import br.com.cadsma.gestormobileapi.entities.pks.PrazoPk;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface PrazoRepository extends MyJpaRepository<Prazo, PrazoPk> {
}
