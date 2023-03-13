package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.entities.pks.AreaPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
@EnableTransactionManagement
public interface AreaRepository extends MyJpaRepository<Area, AreaPk> {
    List<Area> findAllByCodigoEmpresaAndSituacaoAndExcluido(int codigoEmpresa, int situacao, int excluido);
}
