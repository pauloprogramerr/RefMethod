package anotations.spring;

import org.springframework.stereotype.Controller;

@Controller
class MeuControlador {
    public String exibirPagina() {
        return "home"; // Retorna o nome da página HTML (ex.: home.html)
    }
}
