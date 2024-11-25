package org.example;

import java.util.Arrays;

public class While {
    public static void main(String[] args) {

        //string ტიპის ცვლადი
        String string1 = "This is what you get when you mess with us";

        //ვიწყებთ მესამე სიმბოლოდან
        int i = 2;
        while (i<string1.length()){
            char currentChar = string1.charAt(i);

            //ბეჭდვა ერთ ხაზზე, დაიწბეჭდება ყოველი მესამე სიმბოლო
            System.out.print(currentChar);

            // პირობა, თუ z სიმბოლო შეხვდება, ციკლი შეწყდება, თუმცა z სიმბოლოს ვბეჭდავთ რამდგან პირობაში წერია რომ მესამე სიმბოლოები უნდა დაიბეჭდოს

            if (currentChar == 'z' ){
                break;
            }
            i+=3;
        }



        }

    }
