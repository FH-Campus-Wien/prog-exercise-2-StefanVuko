package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        int count = 1;
        double biggestNumber = 0;
        double number;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Number " + count + ": ");
            number = scanner.nextDouble();
            if (count == 1 && number <= 0)
            {
                System.out.println("No number entered.");
                break;
            }
            if (number <= 0)
            {
                System.out.printf("The largest number is " + String.format("%.2f", biggestNumber));
                System.out.println();
                break;
            }
            if (biggestNumber < number)
            {
                biggestNumber = number;
            }
            count++;
        }
    }

    //todo Task 2
    public void stairs(){
        int numberOfLines;
        int number = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        numberOfLines = scanner.nextInt();

        if (numberOfLines <= 0)
        {
            System.out.println("Invalid number!");
        }
        else
        {
            for (int i = 0; i < numberOfLines; i++)
            {
                for (int f = 0; f <= i; f++)
                {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        }

    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;

        for (int i = 1; i <= ROWS; i++)
        {
            for (int e = i; e < ROWS; e++)
            {
                System.out.print(" ");
            }
            for (int f = 0; f < (i*2) - 1; f++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        int height;
        char character;
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        height = scanner.nextInt();

        System.out.print("c: ");
        character = scanner.next().charAt(0);
        int valueOfChar = character;

        if (height % 2 == 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        //Upper part
        for (int i = 1; i <= (height / 2) + 1; i++)
        {
            double numberOfStars = (i*2) - 1;
            double halfStars = numberOfStars / 2;
            double counter = halfStars - 0.5;

            for (int e = i; e < (height / 2) + 1; e++)
            {
                System.out.print(" ");
            }
            for (int f = 0; f < (i*2) - 1; f++)
            {
                if (halfStars - 0.5 == f)
                {
                    System.out.print(character);
                    counter = 1;
                }
                else if (halfStars - 0.5 < f)
                {
                    System.out.print((char)(valueOfChar - counter));
                    counter++;
                }
                else if (halfStars - 0.5 > f)
                {
                    System.out.print((char)(valueOfChar - counter));
                    counter--;
                }
            }
            System.out.println();
        }

        //Lower part
        for (int i = (height / 2); i >= 1; i--)
        {
            double numberOfStars = (i*2) - 1;
            double halfStars = numberOfStars / 2;
            double counter = halfStars - 0.5;

            for (int e = i; e < (height / 2) + 1; e++)
            {
                System.out.print(" ");
            }
            for (int f = 0; f < (i*2) - 1; f++)
            {
                if (halfStars - 0.5 == f)
                {
                    System.out.print(character);
                    counter = 1;
                }
                else if (halfStars - 0.5 < f)
                {
                    System.out.print((char)(valueOfChar - counter));
                    counter++;
                }
                else if (halfStars - 0.5 > f)
                {
                    System.out.print((char)(valueOfChar - counter));
                    counter--;
                }
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        int count = 1;
        int amountOfMarks = 0;
        int sumOfMarks = 0;
        int negativeMarks = 0;
        double averageMark = 0;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Mark " + count + ": ");
            int number = scanner.nextInt();
            if (number == 0)
            {
                if (amountOfMarks != 0)
                    averageMark = (double)sumOfMarks / (double)amountOfMarks;

                System.out.println("Average: " + String.format("%.2f", averageMark));
                System.out.println("Negative marks: " + negativeMarks);
                break;
            }
            if (number > 0 && number <= 5)
            {
                if (number == 5)
                    negativeMarks++;

                sumOfMarks += number;
                count++;
                amountOfMarks++;
            }
            else
            {
                System.out.println("Invalid mark!");
            }
        }
    }

    //todo Task 6
    public void happyNumbers(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");

        int number = scanner.nextInt();
        int sum = 0;
        int finalResult = 0;

        while(true)
        {
            int digit = number % 10;
            sum += Math.pow(digit, 2);

            number = number / 10;

            if(number == 0)
            {
                number = sum;
                finalResult = sum;
                sum = 0;
            }

            if (finalResult == 1)
            {
                System.out.println("Happy number!");
                break;
            }
            if (finalResult == 4)
            {
                System.out.println("Sad number!");
                break;
            }
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}