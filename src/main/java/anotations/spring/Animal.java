package anotations.spring;

class Animal {
    public void fazerSom (){
        System.out.println ("Som de animal");
    }

    @Deprecated // Indica que o método está obsoleto e não deve ser mais utilizado.
    public void methodAntigo() {
        System.out.println ("Método antigo");
    }
}