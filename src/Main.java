public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то н совершеннолетний");
        }
        else {
            System.out.println("Нужно немного подождать");
        }
        System.out.println("Task2");
        int temperature = 19;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Task3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость" + speed + ", можно ездить спокойно");
        }
        System.out.println("Task4");
        int old = 21;
        if (old > 2 && old < 6) {
            System.out.println("Если возраст человека равен " + old + ", то ему нужно ходить в детский сад");
        }
        if (old > 7 && old < 17) {
            System.out.println("Если возраст человека равен " + old + ", то ему нужно ходить в школу");
        }
        if (old >= 18 && old <= 24) {
            System.out.println("Если возраст человека равен " + old + ", то его место в университете");
        }
        if (old > 24) {
            System.out.println("Если возраст человека равен " + old + ", то ему пора ходить на работу");
        }
        System.out.println("Task5");
        int ageChild = 9;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild  + ", он не может кататься на аттракционе.");
        }
        if (ageChild > 5 || ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild  + ", то он может кататься только в сопровождении" +
                    " взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild  + ", то он может кататься без сопровождения взрослого.");
        }
        System.out.println("Task6");
        int capacity = 102;
        int passengers = 94;
        int seat = 60;
        int stay = 42;
        if (passengers < seat) {
            System.out.println("В вагоне есть " + (seat - passengers) + " сидячих мест и " + stay + " стоячих мест");
        } else if (passengers >= seat && passengers < capacity) {
            System.out.println("В вагоне нет сидячих мест, но есть " + (capacity - passengers) + " стоячих мест");
        } else {
            System.out.println("Мест нет!");
        }
        System.out.println("Task7");
        int one = 25;
        int two = 39;
        int three = 66;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}