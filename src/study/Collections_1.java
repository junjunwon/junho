package study;


import java.util.Arrays;

public class Collections_1 {
    public static void main(String[] args){

        String[] sports = new String[]{"coccer", "baseball","aennis"};
        String[] actors = new String[]{"마정우","김또깡","나준호"};

        Arrays.sort(sports);
        Arrays.sort(actors);
        //String의 comparable 구현에 의해 정렬

        //comparable : 기본 정렬기준을 구현하는데 사용
        //comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할때 사용.


        for(int i=0; i<sports.length; i++) System.out.println(sports[i]+" ");
        System.out.println("");

        for(int i=0; i<actors.length; i++) System.out.println(actors[i]+" ");

    }
}
