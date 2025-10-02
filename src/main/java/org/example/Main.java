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

            LucasNumbers[] arr = generationOfLucasNumbers(numFromUser);

            /*long[] LucasNumbers = new long[numFromUser];*/

            /*LucasNumbers[0] = num1;
            LucasNumbers[1] = num2;

            for (int i = 2; i < numFromUser; i++) {
                LucasNumbers[i] = LucasNumbers[i - 1] + LucasNumbers[i - 2];
            }*/

            System.out.println("\nFirst " + numFromUser + " Lucas Numbers:");

            /*for (int i = 0; i < numFromUser; i++) {
                System.out.print(LucasNumbers[i] + " ");
            }*/

            for (LucasNumbers el: arr){
               System.out.print(el.getValue() + " ");
            }

            /*for (int i = 0; i < numFromUser; i++) {
                if (LucasNumbers[i] % 10 == digitFromUser) {
                    System.out.println(LucasNumbers[i] + " (" + (i + 1) + ")");
                }
            }*/

            System.out.println("\nNumbers that end with " + digitFromUser + ":");
            for (LucasNumbers el: arr){
                if (el.getValue() % 10 == digitFromUser){
                    System.out.println(el.getValue() + "(" + (el.getIndex() + 1) + ")");
                }
            }
    }

        public static LucasNumbers[] generationOfLucasNumbers(int userNum){
            LucasNumbers[] arr = new LucasNumbers[userNum];

            long num1 = 1;
            long num2 = 3;
            long sum = 0;

            arr[0] = new LucasNumbers(0, num1);
            arr[1] = new LucasNumbers(1, num2);

            for (int i = 2; i < userNum; i++){
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                arr[i] = new LucasNumbers(i, sum);
            }

            return arr;
        }
    }