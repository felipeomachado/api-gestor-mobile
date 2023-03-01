package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Titulo;
import br.com.cadsma.gestormobileapi.entities.pks.TituloPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface TituloRepository extends MyJpaRepository<Titulo, TituloPk> {
}
