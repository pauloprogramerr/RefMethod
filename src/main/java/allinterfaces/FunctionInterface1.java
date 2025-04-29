package allinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.UUID;

public class FunctionInterface1 {

    public void intefaceFunctional() {
    // 1. Normalizar nomes de clientes removendo espaços extras
        Function<String, String> normalizarNome = nome -> nome.trim ();
        List<String> nomes = Arrays.asList (" João ", " Maria ", " Carlos ");
        List<String> nomesLimpos = nomes.stream ().map (normalizarNome).collect (Collectors.toList ());
        System.out.println (nomesLimpos); // ["João", "Maria", "Carlos"]

    // 2. Padronizar e-mails para caixa baixa
        Function<String, String> padronizarEmail = String::toLowerCase;
        List<String> emails = Arrays.asList ("Cliente@EMAIL.COM", "Usuario@Empresa.com");
        List<String> emailsPadronizados = emails.stream ().map (padronizarEmail).collect (Collectors.toList ());
        System.out.println (emailsPadronizados); // ["cliente@email.com", "usuario@empresa.com"]

    // 3. Corrigir preços removendo valores negativos
        Function<Double, Double> corrigirPreco = preco -> Math.abs (preco);
        List<Double> precos = Arrays.asList (-100.50, 200.0, -50.75);
        List<Double> precosCorrigidos = precos.stream ().map (corrigirPreco).collect (Collectors.toList ());
        System.out.println (precosCorrigidos); // [100.50, 200.0, 50.75]

    // 4. Converter lista de números de telefone para formato internacional
        Function<String, String> formatarTelefone = telefone -> "+55 " + telefone.replaceAll ("[^0-9]", "");
        List<String> telefones = Arrays.asList ("(31) 98765-4321", "21 99999-1234");
        List<String> telefonesFormatados = telefones.stream ().map (formatarTelefone).collect (Collectors.toList ());
        System.out.println (telefonesFormatados); // ["+55 31987654321", "+55 21999991234"]

    // 5. Corrigir registros vazios e substituir por "Indefinido"
        Function<String, String> tratarVazio = s -> s.isEmpty () ? "Indefinido" : s;
        List<String> cargos = Arrays.asList ("Gerente", "", "Analista");
        List<String> cargosCorrigidos = cargos.stream ().map (tratarVazio).collect (Collectors.toList ());
        System.out.println (cargosCorrigidos); // ["Gerente", "Indefinido", "Analista"]

    // 6. Transformar salários brutos em líquidos com imposto de 15%
        Function<Double, Double> calcularSalarioLiquido = salario -> salario * 0.85;
        List<Double> salarios = Arrays.asList (5000.0, 7000.0, 3000.0);
        List<Double> salariosLiquidos = salarios.stream ().map (calcularSalarioLiquido).collect (Collectors.toList ());
        System.out.println (salariosLiquidos); // [4250.0, 5950.0, 2550.0]

    // 7. Converter datas para o formato padrão YYYY-MM-DD
        Function<String, String> formatarData = data -> {
            String[] partes = data.split ("/");
            return partes[2] + "-" + partes[1] + "-" + partes[0];
        };
        List<String> datas = Arrays.asList ("12/04/2025", "05/09/2023");
        List<String> datasFormatadas = datas.stream ().map (formatarData).collect (Collectors.toList ());
        System.out.println (datasFormatadas); // ["2025-04-12", "2023-09-05"]

    // 8. Extrair apenas os domínios dos e-mails corporativos
        Function<String, String> extrairDominio = email -> email.substring (email.indexOf ('@') + 1);
        List<String> emailsCorporativos = Arrays.asList ("cliente@empresa.com", "usuario@sistema.org");
        List<String> dominios = emailsCorporativos.stream ().map (extrairDominio).collect (Collectors.toList ());
        System.out.println (dominios); // ["empresa.com", "sistema.org"]

    // 9. Ajustar códigos de produtos para formato consistente
        Function<String, String> ajustarCodigoProduto = codigo -> codigo.toUpperCase ().replace (" ", "_");
        List<String> codigos = Arrays.asList ("abc 123", "xyz 789");
        List<String> codigosAjustados = codigos.stream ().map (ajustarCodigoProduto).collect (Collectors.toList ());
        System.out.println (codigosAjustados); // ["ABC_123", "XYZ_789"]

    // 10. Calcular idade a partir do ano de nascimento
        Function<Integer, Integer> calcularIdade = ano -> 2025 - ano;
        List<Integer> anosNascimento = Arrays.asList (1990, 1985, 2000);
        List<Integer> idades = anosNascimento.stream ().map (calcularIdade).collect (Collectors.toList ());
        System.out.println (idades); // [35, 40, 25]

        // 11. Padronizar identificadores removendo caracteres inválidos
        Function<String, String> limparId = id -> id.replaceAll("[^a-zA-Z0-9]", "");
        List<String> ids = Arrays.asList("ABC#123", "XYZ@789");
        List<String> idsLimpos = ids.stream().map(limparId).collect(Collectors.toList());
        System.out.println(idsLimpos); // ["ABC123", "XYZ789"]

        // 12. Garantir que códigos de produto tenham 6 dígitos preenchendo com zeros
        Function<String, String> padronizarCodigo = codigo -> String.format("%06d", Integer.parseInt(codigo));
        List<String> codigosProduto = Arrays.asList("123", "78");
        List<String> codigosFormatados = codigosProduto.stream().map(padronizarCodigo).collect(Collectors.toList());
        System.out.println(codigosFormatados); // ["000123", "000078"]

        // 13. Ajustar valores de estoque removendo negativos e substituindo por zero
        Function<Integer, Integer> corrigirEstoque = estoque -> estoque < 0 ? 0 : estoque;
        List<Integer> estoque = Arrays.asList(10, -5, 7, -2);
        List<Integer> estoqueCorrigido = estoque.stream().map(corrigirEstoque).collect(Collectors.toList());
        System.out.println(estoqueCorrigido); // [10, 0, 7, 0]

        // 14. Gerar siglas para nomes de departamentos
        Function<String, String> gerarSigla = departamento -> Arrays.stream(departamento.split(" "))
                .map(palavra -> palavra.substring(0, 1).toUpperCase())
                .collect(Collectors.joining());
        List<String> departamentos = Arrays.asList("Recursos Humanos", "Tecnologia da Informação");
        List<String> siglas = departamentos.stream().map(gerarSigla).collect(Collectors.toList());
        System.out.println(siglas); // ["RH", "TI"]

        // 15. Converter valores monetários para formato padronizado com duas casas decimais
        Function<Double, String> formatarMoeda = valor -> String.format("R$ %.2f", valor);
        List<Double> valores = Arrays.asList(1500.5, 249.99);
        List<String> valoresFormatados = valores.stream().map(formatarMoeda).collect(Collectors.toList());
        System.out.println(valoresFormatados); // ["R$ 1500.50", "R$ 249.99"]

        // 16. Padronizar nomes de clientes para maiúsculas
        Function<String, String> nomeMaiusculo = String::toUpperCase;
        List<String> nomesClientes = Arrays.asList("joão", "ana", "maria");
        List<String> nomesPadronizados = nomesClientes.stream().map(nomeMaiusculo).collect(Collectors.toList());
        System.out.println(nomesPadronizados); // ["JOÃO", "ANA", "MARIA"]

        // 17. Calcular comissão de vendedores baseada em percentual de vendas
        Function<Double, Double> calcularComissao = venda -> venda * 0.10;
        List<Double> vendas = Arrays.asList(1000.0, 2500.0, 3000.0);
        List<Double> comissoes = vendas.stream().map(calcularComissao).collect(Collectors.toList());
        System.out.println(comissoes); // [100.0, 250.0, 300.0]

        // 18. Extrair extensões de arquivos
        Function<String, String> extrairExtensao = arquivo -> arquivo.substring(arquivo.lastIndexOf('.') + 1);
        List<String> arquivos = Arrays.asList("documento.pdf", "imagem.png", "dados.csv");
        List<String> extensoes = arquivos.stream().map(extrairExtensao).collect(Collectors.toList());
        System.out.println(extensoes); // ["pdf", "png", "csv"]

        // 19. Formatando nomes de cidades para padrão de título
        Function<String, String> formatarCidade = cidade -> Arrays.stream(cidade.split(" "))
                .map(palavra -> palavra.substring(0, 1).toUpperCase() + palavra.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        List<String> cidades = Arrays.asList("são paulo", "rio de janeiro");
        List<String> cidadesFormatadas = cidades.stream().map(formatarCidade).collect(Collectors.toList());
        System.out.println(cidadesFormatadas); // ["São Paulo", "Rio De Janeiro"]

        // 20. Transformar idade de clientes em faixas etárias
        Function<Integer, String> faixaEtaria = idade -> {
            if (idade < 18) return "Menor de idade";
            else if (idade < 60) return "Adulto";
            else return "Idoso";
        };
        List<Integer> idadesClientes = Arrays.asList(15, 35, 70);
        List<String> faixas = idadesClientes.stream().map(faixaEtaria).collect(Collectors.toList());
        System.out.println(faixas); // ["Menor de idade", "Adulto", "Idoso"]

        // 21. Verificar se e-mails são corporativos ou pessoais
        Function<String, String> tipoEmail = email -> email.contains("@empresa.com") ? "Corporativo" : "Pessoal";
        List<String> emails2 = Arrays.asList("joao@empresa.com", "ana@gmail.com", "carlos@empresa.com");
        List<String> tiposEmails = emails2.stream().map(tipoEmail).collect(Collectors.toList());
        System.out.println(tiposEmails); // ["Corporativo", "Pessoal", "Corporativo"]

        // 22. Extrair ano de validade de cartões de crédito
        Function<String, String> extrairAnoValidade = cartao -> cartao.split("/")[1];
        List<String> cartoes = Arrays.asList("12/25", "09/23", "06/30");
        List<String> anosValidade = cartoes.stream().map(extrairAnoValidade).collect(Collectors.toList());
        System.out.println(anosValidade); // ["25", "23", "30"]

        // 23. Ajustar nomes de arquivos para formato sem espaços
        Function<String, String> formatarArquivo = nome -> nome.replace(" ", "_").toLowerCase();
        List<String> arquivos2 = Arrays.asList("Relatório Anual.pdf", "Dados Clientes.csv");
        List<String> arquivosFormatados = arquivos2.stream().map(formatarArquivo).collect(Collectors.toList());
        System.out.println(arquivosFormatados); // ["relatório_anual.pdf", "dados_clientes.csv"]

        // 24. Converter lista de CPFs para formato adequado
        Function<String, String> formatarCPF = cpf -> cpf.replaceAll("[^0-9]", "");
        List<String> cpfs = Arrays.asList("123.456.789-00", "987.654.321-99");
        List<String> cpfsFormatados = cpfs.stream().map(formatarCPF).collect(Collectors.toList());
        System.out.println(cpfsFormatados); // ["12345678900", "98765432199"]

        // 25. Extrair apenas o nome do arquivo sem extensão
        Function<String, String> nomeSemExtensao = arquivo -> arquivo.substring(0, arquivo.lastIndexOf('.'));
        List<String> listaArquivos = Arrays.asList("documento.pdf", "planilha.xlsx");
        List<String> nomesArquivos = listaArquivos.stream().map(nomeSemExtensao).collect(Collectors.toList());
        System.out.println(nomesArquivos); // ["documento", "planilha"]

        // 26. Determinar status de entrega baseado no código
        Function<String, String> definirStatusEntrega = status -> {
            switch (status.toLowerCase()) {
                case "p":
                    return "Pendente";
                case "e":
                    return "Enviado";
                case "c":
                    return "Cancelado";
                default:
                    return "Indefinido";
            }
        };
        List<String> codigosStatus = Arrays.asList("P", "E", "C", "X");
        List<String> statusFinal = codigosStatus.stream().map(definirStatusEntrega).collect(Collectors.toList());
        System.out.println(statusFinal); // ["Pendente", "Enviado", "Cancelado", "Indefinido"]

        // 27. Gerar identificadores únicos para usuários (UUID)
        Function<String, String> gerarID = nome -> UUID.randomUUID().toString().substring(0, 8) + "-" + nome;
        List<String> nomesUsuarios = Arrays.asList("João", "Maria", "Carlos");
        List<String> idsGerados = nomesUsuarios.stream().map(gerarID).collect(Collectors.toList());
        System.out.println(idsGerados); // Exemplo: ["1234abcd-João", "abcd5678-Maria", "9efg1234-Carlos"]

        // 28. Remover caracteres especiais de endereços
        Function<String, String> limparEndereco = endereco -> endereco.replaceAll("[^a-zA-Z0-9 ]", "");
        List<String> enderecos = Arrays.asList("Rua A!pto 2", "Av. Central#Bloco B");
        List<String> enderecosLimpos = enderecos.stream().map(limparEndereco).collect(Collectors.toList());
        System.out.println(enderecosLimpos); // ["Rua Apto 2", "Av Central Bloco B"]

        // 29. Criar mensagens personalizadas para clientes
        Function<String, String> mensagemCliente = nome -> "Olá " + nome + ", obrigado por sua compra!";
        List<String> clientes = Arrays.asList("João", "Ana", "Carlos");
        List<String> mensagens = clientes.stream().map(mensagemCliente).collect(Collectors.toList());
        System.out.println(mensagens); // ["Olá João, obrigado por sua compra!", "Olá Ana, obrigado por sua compra!", "Olá Carlos, obrigado por sua compra!"]

        // 30. Ajustar siglas de categorias de produtos para formato correto
        Function<String, String> formatarCategoria = categoria -> categoria.trim().toUpperCase();
        List<String> categorias = Arrays.asList(" eletronicos ", " móveis ", " roupas ");
        List<String> categoriasFormatadas = categorias.stream().map(formatarCategoria).collect(Collectors.toList());
        System.out.println(categoriasFormatadas); // ["ELETRONICOS", "MÓVEIS", "ROUPAS"]

    }
}