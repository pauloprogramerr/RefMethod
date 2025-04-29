package anotations.spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UsuarioApi {
    @GetMapping("/usuarios")
    public String listarUsuario() {
        return "Listando todos os usuários";
    }

    @PostMapping("/usuarios")
    public String criarUsuario() {
        return "Usuário criado com sucesso";
    }
}