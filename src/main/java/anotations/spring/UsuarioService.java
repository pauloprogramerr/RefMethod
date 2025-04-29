package anotations.spring;

import org.springframework.stereotype.Service;

@Service
class UsuarioService {
    public String obterUsusario() {
        return "Usuário obtido com sucesso";
    }
}
