package org.example;

public class Main {
    public static void main(String[] args) {

        // მასივი რიცხვითი მნიშვნელობებით
        int[] numbers = {6, 4, 7, -3, 3, 7, 84, 14, 37};

        //ლუწი რიცხვების რაოდენობის დასათვლელად
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        // ტექსტის ბეჭდვა მასივში არსებული ლუწი რიცხვის რაოდენობის მიხედვით
        if (count == 0) {
            System.out.println("ამ მასივში არ არის ლუწი რიცხვები");
        } else {
            System.out.println("ამ მასივში არის  " + count + " ლუწი რიცხვი.");
        }

        // checkNumber მეთოდის გამოძახება და რიცხვის გადაცემა
        checkNumber(0);

        // hasTeen მეთოდის გამოძახება და რიცხვითი მნიშვნელობების გადაცემა
        //hasTeen(3,12,17);

    }

    //checkNumber მეთოდი
    public static void checkNumber(int number) {

        if (number < 0) {
            System.out.println("უარყოფითი");
        } else if (number > 0) {

            System.out.println("დადებითი");
        } else if (number ==0) {
            System.out.println("ნოლი");

        }


    }

    //hasteen მეთოდი
    public static void hasTeen ( int age1, int age2, int age3 ) {
        if (age1 >=13 & age1<=19 || age2 >=13 & age2<=19 || age3 >=13 & age3<=19){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}

