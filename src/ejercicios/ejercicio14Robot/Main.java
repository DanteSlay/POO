package ejercicios.ejercicio14Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot();

        Robot robot2 = new Robot("Soni", "T800", 50);

        Robot robot3 = new Robot("Jhony", "5");

        System.out.println(robot1.toString());
        System.out.println(robot2.toString());
        System.out.println(robot3.toString());
    }



}
