package anotations.spring;

import org.springframework.beans.factory.annotation.Autowired;

class Componente {

    @Autowired
    private MeuServico meuServico;

    public void executar() {
        meuServico.processaDados(); // Chama o serviço
    }
}
