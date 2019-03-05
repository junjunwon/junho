package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Using_Comparator {

    //comparable을 implements하지 않고도 오브젝트의 특정 변수를 기준으로 정렬하는 방법이 있다.
    //Comparator!!

    public static void main(String[] args){

        ArrayList<SoccerPlayer> playerList = new ArrayList<SoccerPlayer>();

        SoccerPlayer player1 = new SoccerPlayer("메시","공격수",23);
        SoccerPlayer player2 = new SoccerPlayer("호날두","미드필더",21);
        SoccerPlayer player3 = new SoccerPlayer("오스카","수비수",27);
        SoccerPlayer player4 = new SoccerPlayer("기안","공격수",25);

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);

        Collections.sort(playerList, new Comparator<SoccerPlayer>() {
            @Override
            public int compare(SoccerPlayer p1, SoccerPlayer p2) {

                if(p1.getAge()>p2.getAge()){
                    return 1;
                }else if(p1.getAge()<p2.getAge()){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        for(int i=0; i<playerList.size(); i++){
            System.out.println(playerList.get(i).getName()+" "+playerList.get(i).getAge());
        }
    }
}
