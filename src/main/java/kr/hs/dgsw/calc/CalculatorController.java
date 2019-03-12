package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping
    public String getString(){
        return "Hello World";
    }
}

// e0cf6b93e89c3cdea597dc148afdbb6751b7a13f