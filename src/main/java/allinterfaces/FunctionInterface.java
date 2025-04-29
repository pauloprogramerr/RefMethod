package allinterfaces;

import java.util.function.Function;
import java.util.*;
import java.util.stream.*;


public class FunctionInterface {
    /**
     * Function<T, R>  * Representa uma função que aceita um argumento e produz um resultado.
     */

    public void functionInterface() {
        Function<Integer, String> intToString = num -> "Número: " + num;
        System.out.println (intToString.apply(5)); // Saída: Número: 5
    }

    public static void main(String[] args) {
        // 1. Convertendo Integer para Double
        Function<Integer, Double> intParaDouble = Integer::doubleValue;
        List<Integer> inteiros = Arrays.asList(1, 2, 3);
        List<Double> doubles = inteiros.stream().map(intParaDouble).collect(Collectors.toList());
        System.out.println(doubles); // [1.0, 2.0, 3.0]

        // 2. Convertendo String para Integer
        Function<String, Integer> stringParaInt = Integer::parseInt;
        List<String> numerosStr = Arrays.asList("10", "20", "30");
        List<Integer> numerosInt = numerosStr.stream().map(stringParaInt).collect(Collectors.toList());
        System.out.println(numerosInt); // [10, 20, 30]

        // 3. Convertendo Double para String formatada
        Function<Double, String> doubleParaString = d -> String.format("%.2f", d);
        List<Double> valores = Arrays.asList(12.345, 67.89);
        List<String> formatados = valores.stream().map(doubleParaString).collect(Collectors.toList());
        System.out.println(formatados); // ["12.35", "67.89"]

        // 4. Convertendo Boolean para String
        Function<Boolean, String> booleanParaString = b -> b ? "Verdadeiro" : "Falso";
        List<Boolean> booleanos = Arrays.asList(true, false, true);
        List<String> textos = booleanos.stream().map(booleanParaString).collect(Collectors.toList());
        System.out.println(textos); // ["Verdadeiro", "Falso", "Verdadeiro"]

        // 5. Calculando o quadrado de números inteiros
        Function<Integer, Integer> quadrado = x -> x * x;
        List<Integer> valoresOriginais = Arrays.asList(2, 4, 6);
        List<Integer> quadrados = valoresOriginais.stream().map(quadrado).collect(Collectors.toList());
        System.out.println(quadrados); // [4, 16, 36]

        // 6. Convertendo List<String> em List<Character>
        Function<String, Character> primeiroCaractere = s -> s.charAt(0);
        List<String> palavras = Arrays.asList("Java", "Python", "Kotlin");
        List<Character> iniciais = palavras.stream().map(primeiroCaractere).collect(Collectors.toList());
        System.out.println(iniciais); // ['J', 'P', 'K']

        // 7. Convertendo List<Character> em List<Integer> (código ASCII)
        Function<Character, Integer> asciiCode = c -> (int) c;
        List<Character> letras = Arrays.asList('A', 'B', 'C');
        List<Integer> ascii = letras.stream().map(asciiCode).collect(Collectors.toList());
        System.out.println(ascii); // [65, 66, 67]

        // 8. Convertendo List<Integer> para List<String> (binário)
        Function<Integer, String> intParaBinario = Integer::toBinaryString;
        List<Integer> numerosBin = Arrays.asList(4, 8, 16);
        List<String> binarios = numerosBin.stream().map(intParaBinario).collect(Collectors.toList());
        System.out.println(binarios); // ["100", "1000", "10000"]

        // 9. Multiplicando valores em um array de float
        Function<Float, Float> dobrar = f -> f * 2;
        List<Float> floats = Arrays.asList(1.5f, 3.2f, 4.7f);
        List<Float> dobrados = floats.stream().map(dobrar).collect(Collectors.toList());
        System.out.println(dobrados); // [3.0, 6.4, 9.4]

        // 10. Convertendo uma lista de strings em seu tamanho
        Function<String, Integer> tamanhoString = String::length;
        List<String> textosLongos = Arrays.asList("Copilot", "Java", "Programação");
        List<Integer> tamanhos = textosLongos.stream().map(tamanhoString).collect(Collectors.toList());
        System.out.println(tamanhos); // [7, 4, 11]

        // 11. Convertendo List<Integer> para List<Long>
        Function<Integer, Long> intParaLong = Integer::longValue;
        List<Integer> numeros = Arrays.asList(100, 200, 300);
        List<Long> longs = numeros.stream().map(intParaLong).collect(Collectors.toList());
        System.out.println(longs); // [100, 200, 300]

        // 12. Convertendo um número inteiro para binário
        Function<Integer, String> intParaBinario1 = Integer::toBinaryString;
        List<Integer> valoresBin = Arrays.asList(4, 8, 16);
        List<String> binarios1 = valoresBin.stream().map(intParaBinario1).collect(Collectors.toList());
        System.out.println(binarios1); // ["100", "1000", "10000"]

        // 13. Convertendo List<Float> para List<String> formatada
        Function<Float, String> floatParaString = f -> String.format("%.2f", f);
        List<Float> valoresFloat = Arrays.asList(1.123f, 2.456f, 3.789f);
        List<String> formatadas = valoresFloat.stream().map(floatParaString).collect(Collectors.toList());
        System.out.println(formatadas); // ["1.12", "2.46", "3.79"]

        // 14. Convertendo List<Double> para List<Float>
        Function<Double, Float> doubleParaFloat = Double::floatValue;
        List<Double> valoresDouble = Arrays.asList(10.5, 20.75, 30.0);
        List<Float> valoresFloat2 = valoresDouble.stream().map(doubleParaFloat).collect(Collectors.toList());
        System.out.println(valoresFloat2); // [10.5, 20.75, 30.0]

        // 15. Convertendo List<Boolean> para mensagens
        Function<Boolean, String> boolParaMensagem = b -> b ? "Ligado" : "Desligado";
        List<Boolean> estados = Arrays.asList(true, false, true);
        List<String> mensagens = estados.stream().map(boolParaMensagem).collect(Collectors.toList());
        System.out.println(mensagens); // ["Ligado", "Desligado", "Ligado"]

        // 16. Transformando List<Character> em List<String>
        Function<Character, String> charParaString = String::valueOf;
        List<Character> letras1 = Arrays.asList('X', 'Y', 'Z');
        List<String> strings = letras1.stream().map(charParaString).collect(Collectors.toList());
        System.out.println(strings); // ["X", "Y", "Z"]

        // 17. Convertendo List<Integer> para List<String> (octal)
        Function<Integer, String> intParaOctal = Integer::toOctalString;
        List<Integer> valoresOctais = Arrays.asList(8, 16, 32);
        List<String> octais = valoresOctais.stream().map(intParaOctal).collect(Collectors.toList());
        System.out.println(octais); // ["10", "20", "40"]

        // 18. Convertendo List<Long> para List<String> formatada
        Function<Long, String> longParaString = l -> "Valor: " + l;
        List<Long> valoresLong = Arrays.asList(1000L, 2000L, 3000L);
        List<String> mensagensLong = valoresLong.stream().map(longParaString).collect(Collectors.toList());
        System.out.println(mensagensLong); // ["Valor: 1000", "Valor: 2000", "Valor: 3000"]

        // 19. Convertendo List<Double> para porcentagem formatada
        Function<Double, String> porcentagemFormatada = d -> String.format("%.1f%%", d * 100);
        List<Double> valoresPorcentagem = Arrays.asList(0.75, 0.82, 0.93);
        List<String> formatadasPorcentagem = valoresPorcentagem.stream().map(porcentagemFormatada).collect(Collectors.toList());
        System.out.println(formatadasPorcentagem); // ["75.0%", "82.0%", "93.0%"]

        // 20. Convertendo List<Integer> para valores negativos
        Function<Integer, Integer> paraNegativo = x -> -x;
        List<Integer> positivos = Arrays.asList(10, 20, 30);
        List<Integer> negativos = positivos.stream().map(paraNegativo).collect(Collectors.toList());
        System.out.println(negativos); // [-10, -20, -30]

        // 21. Convertendo List<String> para List<Character> (primeira letra)
        Function<String, Character> primeiraLetra = s -> s.charAt(0);
        List<String> palavras1 = Arrays.asList("Amigo", "Casa", "Gato");
        List<Character> iniciais1 = palavras1.stream().map(primeiraLetra).collect(Collectors.toList());
        System.out.println(iniciais1); // ['A', 'C', 'G']

        // 22. Convertendo List<String> para List<Integer> (quantidade de palavras)
        Function<String, Integer> contarPalavras = s -> s.split(" ").length;
        List<String> frases = Arrays.asList("Java é ótimo", "Programação é divertida");
        List<Integer> quantidadePalavras = frases.stream().map(contarPalavras).collect(Collectors.toList());
        System.out.println(quantidadePalavras); // [3, 2]

        // 23. Convertendo List<Integer> para raízes quadradas
        Function<Integer, Double> raizQuadrada = Math::sqrt;
        List<Integer> valoresRaiz = Arrays.asList(4, 9, 16);
        List<Double> raizes = valoresRaiz.stream().map(raizQuadrada).collect(Collectors.toList());
        System.out.println(raizes); // [2.0, 3.0, 4.0]

        // 24. Convertendo List<String> para minúsculas
        Function<String, String> paraMinusculas = String::toLowerCase;
        List<String> maiusculas = Arrays.asList("JAVA", "STREAMS", "MAP");
        List<String> minusculas = maiusculas.stream().map(paraMinusculas).collect(Collectors.toList());
        System.out.println(minusculas); // ["java", "streams", "map"]

        // 25. Adicionando prefixo a List<String>
        Function<String, String> adicionarPrefixo = s -> "Prefixo-" + s;
        List<String> valoresTexto = Arrays.asList("Casa", "Carro", "Caminhão");
        List<String> comPrefixo = valoresTexto.stream().map(adicionarPrefixo).collect(Collectors.toList());
        System.out.println(comPrefixo); // ["Prefixo-Casa", "Prefixo-Carro", "Prefixo-Caminhão"]

        // 26. Convertendo List<String> para List<Integer> (contagem de caracteres)
        Function<String, Integer> contarCaracteres = String::length;
        List<String> textosContagem = Arrays.asList("Programação", "Java", "Streams");
        List<Integer> quantidadeCaracteres = textosContagem.stream().map(contarCaracteres).collect(Collectors.toList());
        System.out.println(quantidadeCaracteres); // [11, 4, 7]

        // 27. Invertendo List<String>
        Function<String, String> inverterTexto = s -> new StringBuilder(s).reverse().toString();
        List<String> palavrasInverter = Arrays.asList("Copilot", "Code");
        List<String> invertidas = palavrasInverter.stream().map(inverterTexto).collect(Collectors.toList());
        System.out.println(invertidas); // ["tolipoC", "edoC"]

        // 28. Convertendo List<Integer> em List<Boolean> (par ou ímpar)
        Function<Integer, Boolean> ehPar = x -> x % 2 == 0;
        List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Boolean> resultados = numeros1.stream().map(ehPar).collect(Collectors.toList());
        System.out.println(resultados); // [false, true, false, true, false]

        // 29. Convertendo List<String> para List<String> com primeira letra maiúscula
        Function<String, String> capitalizar = s -> s.substring(0, 1).toUpperCase() + s.substring(1);
        List<String> palavras2 = Arrays.asList("java", "python", "kotlin");
        List<String> capitalizadas = palavras2.stream().map(capitalizar).collect(Collectors.toList());
        System.out.println(capitalizadas); // ["Java", "Python", "Kotlin"]

        // 30. Convertendo List<String> para List<Integer> com soma de valores numéricos dentro do texto
        Function<String, Integer> somarNumeros = s -> Arrays.stream(s.split(" "))
                .filter(p -> p.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();
        List<String> frasesComNumeros = Arrays.asList("O preço é 30", "Desconto de 50", "Valor total 100");
        List<Integer> somas = frasesComNumeros.stream().map(somarNumeros).collect(Collectors.toList());
        System.out.println(somas); // [30, 50, 100]


    }
}