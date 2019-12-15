package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        stage3();
    }
    static void stage23() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(200*cups+" ml of water");
        System.out.println(50*cups+" ml of milk");
        System.out.println(15*cups+" g of coffee beans");
    }

    static void stage3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffee = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        if (200*cups <= water && 50*cups <= milk && 15*cups <= coffee) {
            System.out.print("Yes, I can make that amount of coffee");
            int rest = minCups((water-200*cups)/200, (milk-50*cups)/50, (coffee-15*cups)/15);
            if (rest > 0) {
                System.out.print(" (and even "+rest+" more than that)");
            }
            System.out.println("");
        } else {
            System.out.println("No, I can make only "+minCups(water/200, milk/50, coffee/15)+" cup(s) of coffee");
        }
    }

    static int minCups(int waterCups, int milkCups, int coffeeCups) {
        if (waterCups <= milkCups && waterCups <= coffeeCups) {
            return waterCups;
        } else if (milkCups <= waterCups && milkCups <= coffeeCups) {
            return milkCups;
        } else {
            return coffeeCups;
        }

    }

}
