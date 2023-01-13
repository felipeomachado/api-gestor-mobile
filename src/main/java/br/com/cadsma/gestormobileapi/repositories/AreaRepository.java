package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Area;
import br.com.cadsma.gestormobileapi.entities.pks.AreaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<Area, AreaId> {
}
