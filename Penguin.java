public class Penguin extends Animal implements  Runable, Swimable{

    public Penguin(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfSwim() {
        return 10;
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public String say() {
        return "кряк";
    }
    
}
