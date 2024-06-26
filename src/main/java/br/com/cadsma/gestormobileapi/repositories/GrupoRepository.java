package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Grupo;
import br.com.cadsma.gestormobileapi.entities.pks.GrupoPk;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface GrupoRepository extends MyJpaRepository<Grupo, GrupoPk> {
}
