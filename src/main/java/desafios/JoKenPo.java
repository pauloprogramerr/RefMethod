package desafios;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoKenPo {



    public static void testandoJokePo (String[] esc) {

        // 0 ganha 1 e 3,  1 ganha 2 e 4,  2 ganha 3 e 0
        // 3 ganha 4 e 1,  4 ganha 0 e 2,  em caso de empate, imprime empate

        Arrays
                .stream (esc)
                .flatMap (s -> Stream.of(s.split(" ")))
                .forEach (System.out::println);
    }

    public static void main(String[] args) {
        String[] esc = {"tesoura", "papel", "pedra", "lagarto", "spock"};
        testandoJokePo (esc);
    }
}
