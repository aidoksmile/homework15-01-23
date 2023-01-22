public abstract class Animal implements Speakable {
    private String name;
    private int box;

    public Animal(String name, int box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return String.format("name is %s box num: %d", name, box);
    }

    public abstract String say();
}
