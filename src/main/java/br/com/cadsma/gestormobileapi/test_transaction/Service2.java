package br.com.cadsma.gestormobileapi.test_transaction;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Service2 {

    private final TableARepository repository;
    private final Service3 service3;

    public Service2(TableARepository repository, Service3 service3) {
        this.repository = repository;
        this.service3 = service3;
    }

    public void execute() throws Exception {
        repository.save(new TableA("Table A"));
        service3.execute();
    }
}
