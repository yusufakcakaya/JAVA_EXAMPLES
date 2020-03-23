package Polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats a lot of people ";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }
    public String plot() {
        return "Alians attempt to take over the world ";
    }
}
class MazeRunner extends Movie{
    public MazeRunner() {
        super("MAzeRunner");
    }
    public String plot() {
        return "KIds try and escape a maze ";
    }
}
class Forgetable extends Movie{
    public Forgetable( ) {
        super("Forgetable");
    }
}

public class Main {
    public static void main(String[]args){
        for (int i = 1; i < 10; i++){
            Movie movie = randomMovie();
            System.out.println("Movie " +i+ ": " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
        int randomNUmber = (int) (Math.random()*4) +1;
        System.out.println("Random number generated was: " + randomNUmber);
        switch (randomNUmber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgetable();
        }
        return null;
    }
}
