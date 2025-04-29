package anotations.spring;

import anotations.spring.MinhaAnnotation;

class Usuario {

    @MinhaAnnotation(value = "teste") // Exemplo de uso da anotação personalizada.
    public void metodoExemplo() {
        System.out.println("método anotado");
    }
}