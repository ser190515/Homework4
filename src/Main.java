public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int men = 18;
        if (men >= 18) {
            System.out.println("он совершеннолетний");
        }
        if (men < 18) {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
                System.out.println(" Задание 2 ");

        int temperature = 5;
        if (temperature < 5) {
        System.out.println(" на улице " + temperature + " градусов, нужно надеть шапку ");
        }
        if (temperature >= 5) {
        System.out.println(" на улице " + temperature + " градусов, можно идти без шапки ");
        }
                   System.out.println(" Задание 3 ");
        int speedMachine = 50;
        if (speedMachine > 60) {
            System.out.println(" скорость машины " + speedMachine + " Км/ч придется заплатить штраф ");
        }
        if (speedMachine <= 60) {
            System.out.println(" скорость машины " + speedMachine + " Км/ч можно ездить спокойно ");
        }
                    System.out.println(" Задание 4 ");
        int age = 24;
        if (age >= 2)
        if (age <=6) {
            System.out.println(" если возраст человека " + age + " ему нужно ходить в садик ");
        }
        if (age >=7)
        if (age <=18) {
            System.out.println(" если возраст человека " + age + " ему нужно ходить в школу ");
        }
        if (age >18)
        if (age <=24) {
            System.out.println(" если возраст человека " + age + " ему нужно ходить в универ ");
        }
        if (age >24) {
            System.out.println(" если возраст человека " + age + " ему нужно ходить на работу ");
        }
        System.out.println(" Задание 5 ");
        int child = 14;
        if (child<=5) {
            System.out.println(" если возраст ребенка " + child + " ему нельзя кататься на атракционе ");
        }
        else if (child<14){
            System.out.println(" если возраст ребенка " + child + " ему можно кататься на атракционе только с родителями ");
        }
        else if (child>=14){
            System.out.println(" если возраст ребенка " + child + " ему можно кататься на атракционе без родителями ");
        }
        System.out.println(" Задание 6 ");
        int passengers = 102;
        if (passengers<102){
            System.out.println("есть места в вагоне");}
        else {
            System.out.println("нет мест в вагоне");}
        if (passengers<60){
            System.out.println("есть сидячие места в вагоне");}
        else if (passengers<102){
            System.out.println("есть стоячие места в вагоне");
        }
        System.out.println(" Задание 7 ");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two&&one>three){
            System.out.println(" one наиболшее число ");
        } else if (two>one&&one>three){
            System.out.println(" two наиболшее число ");
        } else {
            System.out.println(" three наиболшее число ");
        }

    }
}