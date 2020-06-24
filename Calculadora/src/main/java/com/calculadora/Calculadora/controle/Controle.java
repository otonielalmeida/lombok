package com.calculadora.Calculadora.controle;

import com.calculadora.Calculadora.modelo.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    @GetMapping("/calculadora")
    public String mensagem(){
        Calculadora c = new Calculadora();
        c.setValor1(10);
        c.setValor2(5);
        return c.mostrarDados();
    }
}
