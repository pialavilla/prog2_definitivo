package TrabajoPractico2_Punto1;

public class Animal {
    private String name;
    private int age ;
    private String animalType;
    private double price;

    public Animal(String name, int age, String animalType,double price) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.price = price;
    }

    //metodo alimentar
    public void feed(String name){
        System.out.println("alimentando a: "+name);
    }
    //sobreescribir el toString para que devuelva una presentacion de animal
    @Override
    public String toString(){
        return "animal: "+name+ ", edad: "+age+", tipo: "+animalType+ ", precio: $"+price;
    }
}
