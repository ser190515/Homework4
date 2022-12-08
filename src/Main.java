public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int men = 18;
        if (men >= 18)
            System.out.println("он совершеннолетний");
        if (men < 18)
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");

        int temperature = 5;
        if (temperature < 5)
        System.out.println(" на улице " + temperature + " градусов, нужно надеть шапку ");
        if (temperature >= 5)
        System.out.println(" на улице " + temperature + " градусов, можно идти без шапки ");

        int speedMachine = 50;
        if (speedMachine > 60)
            System.out.println(" скорость машины " + speedMachine + " Км/ч придется заплатить штраф ");
        if (speedMachine <= 60)
            System.out.println(" скорость машины " + speedMachine + " Км/ч можно ездить спокойно ");


    }
}