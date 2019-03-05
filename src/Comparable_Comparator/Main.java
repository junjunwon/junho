package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

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

        Collections.sort(playerList);

        for(int i = 0; i<playerList.size(); i++){
            System.out.println(playerList.get(i).getName()+" "+playerList.get(i).getPosition());
        }

    }
}
