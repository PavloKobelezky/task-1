package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть перше прізвище");
        String fr1 = s.nextLine();

        System.out.println("Введіть друге прізвище");
        String fr2 = s.nextLine();

        System.out.println("Введіть третє прізвище");
        String fr3 = s.nextLine();

        if (fr1 == fr2 && fr1 == fr3 && fr2 == fr1 && fr2 == fr3){
            System.out.println("Прізвища однакові");
        }
        else {
            System.out.println("Прізвища не однакові");
        }
    }
}
