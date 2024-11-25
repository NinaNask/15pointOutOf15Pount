package org.example;

public class Length {
    public static void main(String[] args) {
        // სტრინგის ტიპის სტრიქონი
        String s = "მარად და ყველგან საქართველო მე ვარ შენთანა";

        // დასაბეჭდი ტექსტი სტრიქონის სიგრძის მიხედვით 
        if  (s.length()%2==0){
            System.out.println("სტრიქონის სიგრძე ლუწია");
        }
        else {
            System.out.println("სტრიქონის სიგრძე კენტია");
        }



    }


}
