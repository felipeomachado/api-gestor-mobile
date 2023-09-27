package br.com.cadsma.gestormobileapi.test_transaction;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class Service1 {

    private final Service2 service2;

    public Service1(Service2 service2) {
        this.service2 = service2;
    }

    //@Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void execute() throws Exception {
        try {
            service2.execute();
        }catch (Exception ex) {
            System.out.println("logg error: " + ex.getMessage());
            throw ex;
        }
    }
}
