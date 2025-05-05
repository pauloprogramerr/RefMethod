package anotations;


import anotations.spring.Animal;

class Cachorro extends Animal {
    @Override // Indica que um método sobrescreve um método da classe pai.
    public void fazerSom (){
        System.out.println ("Au au");
    }
}
