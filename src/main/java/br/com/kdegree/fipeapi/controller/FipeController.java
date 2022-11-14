package br.com.kdegree.fipeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Random;

@RestController
public class FipeController {

    @GetMapping("/api/{modelo}/{ano}")
    public Fipe getFipe(@PathVariable String modelo, @PathVariable int ano){
        int valor = new Random().nextInt(10000, 100000) + 10000;
        return new Fipe(BigDecimal.valueOf(valor));
    }

    class Fipe{
        BigDecimal valor;
        public Fipe(BigDecimal valor){this.valor = valor;}
        public BigDecimal getValor() {return valor;}
    }
}
