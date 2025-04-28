package anotations.spring;

/*
    @Controller: Marca uma classe como controladora no Spring MVC.
    @RestController: Similar a @Controller, mas retorna respostas JSON diretamente.
    @Autowired: Injeta automaticamente uma dependência em um campo, método ou construtor.

 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que a classe é um controlador Spring MVC.
@RequestMapping("/api") // Define o caminho base para os endpoints.
public class UsuarioController {

    @Autowired
    private Usuarioservice usuarioservice;

    @GetMapping("/usuarios") // Define o método HTTP e o caminho do endpoint.
    public String listarUsuario () {
        return "Listando todos os usuários";
    }
}


@Service
class Usuarioservice {
    public String obterUsusario() {
        return "Usuário obtido com sucesso";
    }
}
