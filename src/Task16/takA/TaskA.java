package Task16.takA;

public class TaskA {
    public static void main(String[] args) {
        Bird[] perro = new Bird[3];
        Cat[] cats = new Cat[3];
        Dog[] dogs = new Dog[3];
        Fish[] fishs = new Fish[3];

        for (int i = 0; i < cats.length; i++) {
            perro[i] = new Bird();
            cats[i] = new Cat();
            dogs[i] = new Dog();
            fishs[i] = new Fish();

            fishs[i].setName("Рыба " + i);
            cats[i].setName("Кошка " + i);
            dogs[i].setName("Собака " + i);
            perro[i].setName("Папугай " + i);




        }

    }
}
