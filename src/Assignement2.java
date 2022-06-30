import java.util.Scanner;

public class Assignement2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("შემოიყვანეთ რიცხვი; ");
        int importNum = scanner.nextInt();
        if ((importNum > 0) && (importNum % 2 == 0)) {
            System.out.print("შემოყვანილი რიცხვი დადებითია და ლუწია");
        } else if ((importNum < 0) && (importNum % 2 == 0)) {
            System.out.print("შემოყვანილი რიცხვი დადებითი და ლუწია");
        } else if ((importNum > 0) && (importNum % 2 != 0)) {
            System.out.print("შემოყვანილი რიცხვი უარყოფითია და კენტიაა");
        } else if ((importNum > 0) && (importNum % 2 != 0)) {
            System.out.print("შემოყვანილი რიცხვი უარყოფითია და კენტია");
        } else {
            System.out.println("შემოყვანილი რიცხვი = 0");
        }
        main2();
        main3();
    }

    public static void main2() {
        System.out.print("Enter Any Year; ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.print("Entered Year is a leap Year");
        } else {
            System.out.print("Entered Year is not leap Year");
        }

    }
    public static void main3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" შემოიყვანეთ პირველი რიცხვი: ");
        int firstnum = scanner.nextInt();
        System.out.print("შემოიყვანეთ მეორე რიცხვი: ");
        int secondNum = scanner.nextInt();
        System.out.print("შემოიყვანეთ მესამე რიცხვი: ");
        int thirdNum = scanner.nextInt();
        double averageofTheseNumbers = (main3 (firstnum, secondNum, thirdNum));
        System.out.println("ამ რიცხვების საშუალოა:" + averageofTheseNumbers);
    }

        public static double main3( double a, double b, double c){
        return (a + b + c) / 3;
    }

    }