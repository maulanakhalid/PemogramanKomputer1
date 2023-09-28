package pratice.oop;

import java.util.Scanner;

public class DuckSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih jenis bebek yang ingin Anda lihat (1: Mallard Duck, 2: Rubber Duck, 3: Decoy Duck, 4: Model Duck):");
            int choice = scanner.nextInt();

            Duck duck = null;

            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    FlyBehavior cantFly = () -> System.out.println("I can't fly");
                    QuackBehavior squeak = () -> System.out.println(("Squeak"));
                    duck = new RubberDuck(cantFly, squeak);
                    break;
                case 3:
                    duck = new DecoyDuck();
                    break;
                case 4:
                    duck = new ModelDuck();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            if (duck != null) {
                System.out.println("Anda memilih " + duck.getClass().getSimpleName());
                System.out.println("Sifat atau behavior bebek:");
                duck.performQuack();
                duck.performFly();
            }

            // Pindahkan penutupan scanner ke luar loop
            System.out.println("Apakah Anda ingin melihat bebek lain? (y/n):");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("y")) {
                scanner.close();
                break;
            }
        }
    }
}
