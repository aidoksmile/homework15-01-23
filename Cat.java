public class Cat extends Animal implements Runable{
    private String color;

    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }

    @Override
    public String say() {
        return "мяу";
    }

    @Override
    public String toString() {
        return "Cat " + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 15;
    }
}
