public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();

        task6();

        System.out.println();

        task7();
    }

    public static void task1() {
        System.out.println("Задача #1");

        int age = 17;
        if (age >= 18) {
            System.out.println("Вам 18 или больше");
        } else {
            System.out.println("Вам меньше 18 лет");
        }
    }

    public static void task2() {
        System.out.println("Задача #2");

        int temperature = -3;
        int mustTemperature = -5;
        if (temperature < mustTemperature) {
            System.out.println("Сегодня холодно, наденьте шапку");
        } else {
            System.out.println("Сегодня не так холодно, шапку можно не надевать");
        }
    }

    public static void task3() {
        System.out.println("Задача #3");

        int warningSpeed = 60;
        int speed = 65;
        if (warningSpeed > speed) {
            System.out.println("Можно ехать спокойно");
        } else {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача #4");

        int age = 26;
        if (age > 2 && age < 6) {
            System.out.println("Еему нужно ходить в детский сад.");
        }
        if (age > 7 && age < 18) {
            System.out.println("Ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24) {
            System.out.println("Ему нужно ходить в Университет.");
        } else {
            System.out.println("Ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача #5");

        int children = 7;

        if (children < 5) {
            System.out.println("Ему нельзя кататься на аттракционе!");
        }
        if (children > 5 && children < 14) {
            System.out.println("Если возраст ребенка равен " + children + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + children + ", то ему можно кататься на аттракционе без сопровождении взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача #6");

        int capacity = 102;
        int sedentaryCapacity = 60;
        int standingCapacity = capacity - sedentaryCapacity;

        int occupiedSeats = 30;

        if (occupiedSeats < capacity && occupiedSeats > standingCapacity) {
            int byseSedentary = sedentaryCapacity - occupiedSeats;
            int byseStanding = standingCapacity + byseSedentary;

            System.out.println("Место в вагоне есть. Седячие все заняты, свободны стоячих " + byseStanding + " места");
        }

        if (occupiedSeats < capacity && occupiedSeats < standingCapacity) {
            int byseSedentary = sedentaryCapacity - occupiedSeats;

            System.out.println("Место в вагоне есть. Все стоячии свободны, сидячих свободно " + byseSedentary + " мест");

        } else {
            System.out.println("Свободных мест нет");
        }
    }

    public static void task7(){
        System.out.println("Задача #7");

        int one;
        int two;
        int three;

        one = 1;
        two = 2;
        three = 3;

        if (one > two && one > three){
            System.out.println(one +" больше");
        }
        if (two > three){
            System.out.println(two +" больше");
        }
        else{
            System.out.println(three +" больше");
        }
    }

}