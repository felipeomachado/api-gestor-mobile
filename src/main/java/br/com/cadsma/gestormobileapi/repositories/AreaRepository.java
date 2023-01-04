package br.com.cadsma.gestormobileapi.repositories;

import br.com.cadsma.gestormobileapi.entities.Area;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AreaRepository {

    private final MongoTemplate mongoTemplate;

    public AreaRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void insert(List<Area> areaList) {
        mongoTemplate.save(areaList, Area.COLLECTION_NAME);
    }
}
