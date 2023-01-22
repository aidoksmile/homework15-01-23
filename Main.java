public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya", 1, "gray"))
                .addAnimal(new Horse("Ignat", 10))
                .addAnimal(new Duck("Donald", 5))
                .addAnimal(new Turtle("Leonardo", 2))
                .addAnimal(new Penguin("Shkiper", 3));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }
        
        System.out.println("________");

        System.out.println("Sound of the zoo");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.say()); // говорить умеют cat, duck, horse, penguin, radio
        }
        
        System.out.println("________");

        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Speed of run: " + runner.speedOfRun()); // бегать умеют cat, duck, horse, penguin, turtle
        }
        
        System.out.println("________");

        int maxSpeedOfRun = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max speed of run: " + maxSpeedOfRun));

        System.out.println("________");

        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.println("Speed of fly: " + flyer.speedOfFly()); // летать умеет duck
        }

        System.out.println("________");

        int maxSpeedOfFly = zoo1.getChampionOfFlyers();
        System.out.println(String.format("Max speed of fly: " + maxSpeedOfFly));

        System.out.println("________");

        for (Swimable swimmer : zoo1.getSwimmer()) {
            System.out.println("Speed of swim: " + swimmer.speedOfSwim()); // плавать умеют duck, penguin, turtle
        }

        System.out.println("________");

        int maxSpeedOfSwim = zoo1.getChampionOfSwimmers();
        System.out.println(String.format("Max speed of swim: " + maxSpeedOfSwim));
    }

}