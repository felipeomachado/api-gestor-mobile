package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.GrupoEquipe;
import br.com.cadsma.gestormobileapi.entities.pks.GrupoEquipePk;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface GrupoEquipeRepository extends MyJpaRepository<GrupoEquipe, GrupoEquipePk> {
}
