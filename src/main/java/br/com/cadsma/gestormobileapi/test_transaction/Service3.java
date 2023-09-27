package br.com.cadsma.gestormobileapi.test_transaction;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Service3 {

    private final TableBRepository repository;

    public Service3(TableBRepository repository) {
        this.repository = repository;
    }

    public void execute() throws Exception {
        repository.save(new TableB("Table B"));
        throw new TestException("test");
    }
}
