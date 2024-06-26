package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.SegmentoExcecao;
import br.com.cadsma.gestormobileapi.entities.pks.SegmentoExcecaoPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;

@Repository
@Transactional
@EnableTransactionManagement
public interface SegmentoExcecaoRepository extends JpaRepository<SegmentoExcecao, SegmentoExcecaoPk> {
}
