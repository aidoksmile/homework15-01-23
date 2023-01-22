import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }

    private Radio radio = new Radio();

    public List<Speakable> getSpeakables() {
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an : animals) {
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public List<Runable> getRunner() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal an : animals) {
            if (an instanceof Runable) {
                result.add((Runable) an);
            }
        }
        return result;
    }

    public List<Flyable> getFlyers() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal an : animals) {
            if (an instanceof Flyable) {
                result.add((Flyable) an);
            }
        }
        return result;
    }

    public List<Swimable> getSwimmer() {
        List<Swimable> result = new ArrayList<Swimable>();
        for (Animal an : animals) {
            if (an instanceof Swimable) {
                result.add((Swimable) an);
            }
        }
        return result;
    }

    public int getChampionOfRunners() {
        int max = 0;
        for (Runable runner : getRunner()) {
            if (max < runner.speedOfRun()) {
                max = runner.speedOfRun();
            }
        }
        return max;
    }

    public int getChampionOfFlyers() {
        int max = 0;
        for (Flyable flyer : getFlyers()) {
            if (max < flyer.speedOfFly()) {
                max = flyer.speedOfFly();
            }
        }
        return max;
    }

    public int getChampionOfSwimmers() {
        int max = 0;
        for (Swimable swimmer : getSwimmer()) {
            if (max < swimmer.speedOfSwim()) {
                max = swimmer.speedOfSwim();
            }
        }
        return max;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
