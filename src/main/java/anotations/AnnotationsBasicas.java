package anotations;

import java.util.ArrayList;

class AnotationsBasicas {

@SuppressWarnings ("unchecked") // Supressão de advertências de compilador.java
public void exemploWarning() {
    ArrayList lista = new ArrayList();
    lista.add ("sem tipos genericos");
    }
}


class Animal {
    public void fazerSom (){
        System.out.println ("Som de animal");
    }

    @Deprecated // Indica que o método está obsoleto e não deve ser mais utilizado.
    public void methodAntigo() {
        System.out.println ("Método antigo");
    }
}
class Cachorro extends Animal {
    @Override // Indica que um método sobrescreve um método da classe pai.
    public void fazerSom (){
        System.out.println ("Au au");
    }
}
