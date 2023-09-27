package br.com.cadsma.gestormobileapi.test_transaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class TestController {

    private  final Service1 service1;

    public TestController(Service1 service1) {
        this.service1 = service1;
    }

    @GetMapping
    public String test() throws Exception {
        service1.execute();
        return "ok";
    }
}
