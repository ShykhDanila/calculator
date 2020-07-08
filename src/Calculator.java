import java.util.Scanner;

public class Calculator extends Operation{

    public Calculator() {
    }

    public void menu(){
        System.out.println("------     Калькулятор     -----");
        System.out.println("1. Додавання");
        System.out.println("2. Віднімання");
        System.out.println("3. Множення");
        System.out.println("4. Ділення");
        System.out.println("0. Вийти з програми");
        System.out.println();
    }

    public void calculator(){
        while (true){
            menu();
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            switch (number){
                case 1: {
                    System.out.println("Введіть числа");
                    Scanner scanner = new Scanner(System.in);
                    int figure = scanner.nextInt();
                    Scanner scanner1 = new Scanner(System.in);
                    int figure1 = scanner1.nextInt();
                    System.out.println(figure + "+" + figure1 + "=" + plus.apply(figure,figure1));
                }
                break;
                case 2: {
                    System.out.println("Введіть числа");
                    Scanner scann = new Scanner(System.in);
                    int figure2 = scann.nextInt();
                    Scanner scann1 = new Scanner(System.in);
                    int figure3 = scann1.nextInt();
                    System.out.println(figure2 + "-" + figure3 + "=" + minus.apply(figure2,figure3));
                }
                break;
                 case 3: {
                     System.out.println("Введіть числа");
                    Scanner scan = new Scanner(System.in);
                    int figure4 = scan.nextInt();
                    Scanner scan1 = new Scanner(System.in);
                    int figure5 = scan1.nextInt();
                    System.out.println(figure4 + "*" + figure5 + "=" + multiplication.apply(figure4,figure5));
                }
                break;
                 case 4: {
                     System.out.println("Введіть числа");
                    Scanner scan = new Scanner(System.in);
                    int figure6 = scan.nextInt();
                    Scanner scan1 = new Scanner(System.in);
                    int figure7 = scan1.nextInt();
                    System.out.println(figure6 + ":" + figure7 + "=" + division.apply(figure6,figure7));
                }
                break;
                case 0: System.exit(0);
            }
        }
    }
}
