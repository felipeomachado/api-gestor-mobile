package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Rota;
import br.com.cadsma.gestormobileapi.entities.pks.RotaPk;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public interface RotaRepository extends MyJpaRepository<Rota, RotaPk> {
}
