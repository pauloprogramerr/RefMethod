package allinterfaces;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BifunctionInterface {
        public void transformacaoStrings() {
            List<String> palavras = Arrays.asList("java", "python", "c++");
            List<String> palavrasMaiusculas = palavras.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println(palavrasMaiusculas);

        }

        public void correcaoAutomaitica() {
            BiFunction<String, String, String> corrigirErro = (texto, palavraErrada) -> texto.replace(palavraErrada, "correto");

            List<String> textos = Arrays.asList("err: dado1", "err: dado2", "dado3 sem erro");
            List<String> corrigidos = textos.stream().map(t -> corrigirErro.apply(t, "err")).toList();

            System.out.println(corrigidos);

        }

        public void aplicacaoDescontoVendas() {
            Map<String, Double> produtos = Map.of("Produto A", 100.0, "Produto B", 200.0);

            BiFunction<Double, Double, Double> calcularDesconto = (preco, desconto) -> preco * (1 - desconto);
            produtos.forEach((produto, preco) ->
                    System.out.println(produto + " -> R$ " + calcularDesconto.apply(preco, 0.1))
            );

        }

        public void validacaoAcesso() {
            Map<String, Boolean> acessos = Map.of("User1", true, "User2", false);

            BiFunction<String, Boolean, String> validarAcesso = (usuario, acesso) -> acesso ? "Permitido" : "Negado";
            acessos.forEach((user, acesso) ->
                    System.out.println(user + ": " + validarAcesso.apply(user, acesso))
            );
        }

        public void filtragemRegistroDuplicados() {
            List<String> registros = Arrays.asList("registro1", "registro2", "registro1", "registro3");

            // Remover duplicados com .map() e .distinct()
            List<String> unicos = registros.stream().distinct().collect(Collectors.toList());
            System.out.println(unicos);
        }

        public void normailzacaoDados() {
            BiFunction<String, String, String> normalizar = (texto, padrao) -> texto.toLowerCase().trim() + padrao;

            List<String> dados = Arrays.asList(" Nome ", " EMAIL ");
            List<String> normalizados = dados.stream().map(d -> normalizar.apply(d, "_ok")).toList();

            System.out.println(normalizados);

        }

        public void processamentoDeValoresFincaceiros() {
            Map<String, Double> vendas = Map.of("Produto A", 150.0, "Produto B", 250.0);

            // BiFunction para calcular impostos
            BiFunction<Double, Double, Double> calcularImposto = (valor, taxa) -> valor * taxa;

            vendas.forEach((produto, preco) ->
                    System.out.println(produto + ": Imposto = R$ " + calcularImposto.apply(preco, 0.2))
            );
        }

        public void integracaoApisSimuladas() {
            BiFunction<String, String, String> simularAPI = (endpoint, parametro) ->
                    "Chamada para " + endpoint + " com parâmetro " + parametro;

            List<String> chamadas = List.of(
                    simularAPI.apply("https://api.empresa.com/dados", "id=123"),
                    simularAPI.apply("https://api.empresa.com/usuarios", "id=456")
            );

            chamadas.forEach(System.out::println);
        }
        public void geracaoDeRelatorios () {
            List<String> relatorios = Arrays.asList("Financeiro", "RH", "TI");

            BiFunction<String, Integer, String> gerarRelatorio = (nome, id) -> "Relatório " + nome + " ID: " + id;

            relatorios.stream().map(rel -> gerarRelatorio.apply(rel, rel.hashCode())).forEach(System.out::println);

        }

        public void gerenciamentoDePermissao() {
            Map<String, Boolean> usuarios = Map.of("Admin", true, "Guest", false, "User", true);

            BiFunction<String, Boolean, String> verificarPermissao = (nome, temPermissao) ->
                    temPermissao ? nome + ": Acesso Permitido" : nome + ": Acesso Negado";

            usuarios.entrySet().stream()
                    .map(entry -> verificarPermissao.apply(entry.getKey(), entry.getValue()))
                    .forEach(System.out::println);

        }
        public void conversaoDeFormatoDeDados () {
            List<Integer> valores = Arrays.asList(1, 2, 3);

            BiFunction<Integer, String, String> formatarValor = (numero, prefixo) -> prefixo + numero;

            List<String> formatados = valores.stream()
                    .map(v -> formatarValor.apply(v, "ID-"))
                    .toList();

            System.out.println(formatados);
        }

        public void agregacaoDeResultados () {
            List<Integer> resultados = Arrays.asList(10, 20, 30);

            BiFunction<List<Integer>, String, String> agregarResultados = (lista, nome) ->
                    nome + ": Total -> " + lista.stream().mapToInt(Integer::intValue).sum();

            System.out.println(agregarResultados.apply(resultados, "Vendas"));

        }


}
