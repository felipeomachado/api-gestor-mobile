package br.com.cadsma.gestormobileapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MyJpaRepository<T, ID> extends JpaRepository<T, ID> {
    void deleteAllByCodigoEmpresa(int codigoEmpresa);
}
