import java.util.Scanner;

    class Math {
        private int a, b;
        Scanner sc = new Scanner(System.in);

        void add() {
            System.out.println("Enter your first number:- ");
            a = sc.nextInt();
            System.out.println("Enter your second number:-");
            b = sc.nextInt();
            int r = a + b;
            System.out.println("Addition of the numbers is = " + r);
        }

        void Sub() {
            System.out.println("Enter your first number:- ");
            a = sc.nextInt();
            System.out.println("Enter your second number:- ");
            b = sc.nextInt();
            int r = a - b;
            System.out.println("sub of the number is = " + r);

        }

        void mul() {
            System.out.println("Enter your first number:- ");
            a = sc.nextInt();
            System.out.println("Enter your second number:-");
            b = sc.nextInt();
            int r = a * b;
            System.out.println("multiply of the numbers is = " + r);
        }

        void div() {
            System.out.println("Enter your first number:- ");
            a = sc.nextInt();
            System.out.println("Enter your second number:-");
            b = sc.nextInt();
            int r = a / b;
            System.out.println("divide of the numbers is = " + r);
        }

        void SI() {
            System.out.println("Principal");
            float P = sc.nextInt();

            System.out.println("Rate");
            float R = sc.nextInt();

            System.out.println("Time");
            float T = sc.nextInt();

            System.out.println("Principal: " + P);
            System.out.println("RATE: " + R);
            System.out.println("TIME: " + T);

            System.out.print("Simple interest = P *R * T / 100 = ");

            float SimpleInterest = P * R * T / 100;
        }

        void AreaOfTriangle() {
            System.out.println("enter value of base:-");
            float base = sc.nextInt();

            System.out.println("enter value of height:-");
            float height = sc.nextInt();

            System.out.println("base:-");
            System.out.println("Height:-");

            float AreaOfTriangle = (base * height) / 2;

            System.out.println("result :-" + AreaOfTriangle);
        }


        void ave() {
            System.out.println("Enter your first number:- ");
            a = sc.nextInt();
            System.out.println("Enter your second number:-");
            b = sc.nextInt();
            int r = (a + b) / 2;
            System.out.println("Average of the numbers is = " + r);
        }
    }


public class Calculator_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Math obj1 = new Math();
        int ch;
        do {
            System.out.println(" press 1 for Addition");
            System.out.println(" press 2 for Subtrection");
            System.out.println(" press 3 for multiply");
            System.out.println(" press 4 for divide ");
            System.out.println(" press 5 for Simple Intrest ");
            System.out.println(" press 6 for Area Of Triangle ");
            System.out.println(" press 7 for Average ");
            System.out.println(" press 8 for EXIT");

            System.out.println("/n enter your choice ");

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj1.add();
                    break;
                case 2:
                    obj1.Sub();
                    break;
                case 3:
                    obj1.mul();
                    break;
                case 4:
                    obj1.div();
                    break;
                case 5:
                    obj1.SI();
                    break;
                case 6:
                    obj1.AreaOfTriangle();
                    break;
                case 7:
                    obj1.ave();
                    break;
                default:
                    System.out.println("/n wrong choice ");

            }
        } while (ch != 8);
    }
}
