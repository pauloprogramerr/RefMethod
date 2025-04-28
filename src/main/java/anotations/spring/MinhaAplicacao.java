package anotations.spring;


import anotations.jpa.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
    @SpringBootApplication Marca a classe principal de uma aplicação Spring Boot.
    Combina três anotações: @Configuration, @EnableAutoConfiguration e @ComponentScan.
    @Controller Indica que uma classe é um controlador no Spring MVC para tratar requisições web.
    @RestController
    Combina @Controller e @ResponseBody, tornando a classe capaz de responder diretamente com dados (ex.: JSON).
    @Service Marca uma classe como um serviço da camada de lógica de negócio.
    @Repository Indica que a classe interage diretamente com o banco de dados. Combina com frameworks como JPA.
     @Autowired Injeta automaticamente dependências em classes Spring.
    @Configuration Marca uma classe como um arquivo de configuração para definir beans ou configurações personalizadas.
    @RequestMapping Define mapeamento de URLs para métodos ou classes controladoras.
    @GetMapping, @PostMapping, @PutMapping, @DeleteMapping Atalhos para mapear métodos
    HTTP como GET, POST, PUT e DELETE.


 */
@SpringBootApplication
public class MinhaAplicacao {

    public static void main(String[] args) {
        SpringApplication.run (MinhaAplicacao.class);
    }
}

@Controller
class MeuControlador {
    public String exibirPagina() {
        return "home"; // Retorna o nome da página HTML (ex.: home.html)
    }
}

@RestController
class ApiControlador {

    @GetMapping("/api")
    public String obterDados() {
        return "Resposta em Json."; // Retorna dados em formato JSON ou outro
    }
}

@Service
 class MeuServico {


    public String processaDados() {
        return "Dados processados com sucesso"; // Lógica de negócio
    }
 }
 interface UsuarioReposutory extends JpaRepository<Usuario, Long> {
 }

 class Componente {

    @Autowired
    private MeuServico meuServico;

    public void executar() {
        meuServico.processaDados(); // Chama o serviço
    }
 }

 @Configuration
 class MinhaConfiguracao {

     @Bean
    public String mensagem() {
        return "Configuração personalizada"; // Configuração personalizada
    }
 }

 @RestController
 @RequestMapping("/api")
 class ApiController {

    @RequestMapping("/dados")
    public String obterDados() {
        return "Dados obtidos";
    }
 }

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