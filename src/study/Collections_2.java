package study;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_2 {

    public static void main(String[] args){

        ArrayList<String> sportslist = new ArrayList<String>();

        sportslist.add("soccer");
        sportslist.add("basketball");
        sportslist.add("abc");

        Collections.sort(sportslist);

        for(int i=0; i<sportslist.size(); i++){
            System.out.println(sportslist.get(i)+" ");
        }


    }
}
