public class Turtle extends Animal implements Runable, Swimable {

    public Turtle(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfSwim() {
        return 30;
    }

    @Override
    public int speedOfRun() {
        return 1;
    }

    @Override
    public String say() {
        return " ";
    }
    
}
