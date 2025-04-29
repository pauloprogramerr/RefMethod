package allinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionInterfce2 {
    public void visualizacaoHierarquica() {
        Map<String, List<String>> hierarquia = Map.of(
                "Gerente", List.of("Analista", "Supervisor"),
                "Diretor", List.of("Gerente", "Consultor")
        );

        BiFunction<String, List<String>, String> visualizarHierarquia = (cargo, subordinados) ->
                cargo + " -> " + String.join(", ", subordinados);

        hierarquia.entrySet().stream()
                .map(entry -> visualizarHierarquia.apply(entry.getKey(), entry.getValue()))
                .forEach(System.out::println);
    }
    public void mensagemAutomaitca() {
        List<String> usuarios = Arrays.asList("João", "Maria", "Carlos");

        BiFunction<String, String, String> gerarMensagem = (nome, mensagem) ->
                "Para: " + nome + " -> " + mensagem;

        usuarios.stream()
                .map(usuario -> gerarMensagem.apply(usuario, "Bem-vindo ao sistema!"))
                .forEach(System.out::println);
    }

    public void previsaoEstoque() {
        Map<String, Integer> estoqueAtual = Map.of("Produto A", 10, "Produto B", 15);

        BiFunction<Integer, Integer, Integer> calcularProjecao = (atual, incremento) -> atual + incremento;

        estoqueAtual.forEach((produto, quantidade) ->
                System.out.println(produto + ": Projeção -> " + calcularProjecao.apply(quantidade, 5))
        );
    }

    public void analiseDesempenho () {
        Map<String, Double> desempenho = Map.of("Projeto A", 85.0, "Projeto B", 90.0);

        BiFunction<Double, Double, String> avaliarDesempenho = (nota, limite) ->
                nota >= limite ? "Excelente" : "Precisa Melhorar";

        desempenho.forEach((projeto, nota) ->
                System.out.println(projeto + ": " + avaliarDesempenho.apply(nota, 88.0))
        );
    }

    public void calculoHorasTrabalhadas () {
        Map<String, Integer> horasTrabalhadas = Map.of("João", 40, "Maria", 30);

        BiFunction<Integer, Integer, Integer> calcularPagamento = (horas, valorHora) -> horas * valorHora;

        horasTrabalhadas.forEach((funcionario, horas) ->
                System.out.println(funcionario + ": Pagamento R$ " + calcularPagamento.apply(horas, 50))
        );
    }

}
