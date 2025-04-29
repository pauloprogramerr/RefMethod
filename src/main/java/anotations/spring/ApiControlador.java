package anotations.spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControlador {

    @GetMapping("/api")
    public String obterDados() {
        return "Resposta em Json."; // Retorna dados em formato JSON ou outro
    }
}
