package Quiz_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



public class Quiz_Input_Output {

        public static void main(String[] args) throws IOException {
            String word = "POWER";
            char[] array_word =  new char[word.length()];

            System.out.println(array_word);

            for(int i=0; i<array_word.length; i++){
                array_word[i]=(word.charAt(i));
                System.out.println(array_word[i]);
            }


    }

}
