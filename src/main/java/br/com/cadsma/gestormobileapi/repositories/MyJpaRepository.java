package br.com.cadsma.gestormobileapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.util.List;

@NoRepositoryBean
public interface MyJpaRepository<T, ID> extends JpaRepository<T, ID> {
    List<T> findAllByCodigoEmpresa(int codigoEmpresa);

    default void deleteAllByCodigoEmpresa(String entity, int codigoEmpresa, EntityManager entityManager) {
        entityManager.createQuery(String.format("delete from %s where empresa_codigo = %s", entity, codigoEmpresa)).executeUpdate();
    }
}
