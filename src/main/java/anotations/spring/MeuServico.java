package anotations.spring;

import org.springframework.stereotype.Service;

@Service
class MeuServico {

    public String processaDados() {
        return "Dados processados com sucesso"; // Lógica de negócio
    }
}