package org.example;

import java.util.Scanner;

/** Головний клас програми для роботи з числами Люка (1, 3, 4, 7, 11, …).
 * Зчитує межу, а також цифру, якою мають закінчуватись вибрані числа Люка
 * Потім програма генерує їх, виводить усі числа в межі +  ті, які закінчуються на задану цифру
 * */
class Main {

    /** Основний метод програми
     *
     * @param args не використовується
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount of Lucas numbers: ");
        int numFromUser = scan.nextInt();

        System.out.print("Enter the last digit of the number: ");
        byte digitFromUser = scan.nextByte();

        LucasNumbers[] arr = new LucasNumbers[numFromUser];

        long num1 = 1;
        long num2 = 3;
        long sum = 0;

        arr[0] = new LucasNumbers(0, num1);
        arr[1] = new LucasNumbers(1, num2);

        for (int i = 2; i < numFromUser; i++){
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            arr[i] = new LucasNumbers(i, sum);
        }
        System.out.println("\nFirst " + numFromUser + " Lucas Numbers:");

        for (LucasNumbers el: arr){
            System.out.print(el.getValue() + " ");
        }

        System.out.println("\nNumbers that end with " + digitFromUser + ":");

        for (LucasNumbers el: arr){
            if (el.getValue() % 10 == digitFromUser){
                System.out.println(el.getValue() + "(" + (el.getIndex() + 1) + ")");
            }
        }
    }
}