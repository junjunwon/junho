package Comparable_Comparator;

public class SoccerPlayer implements Comparable<SoccerPlayer>{

    private String name;
    private String position;
    private int age;

    public SoccerPlayer(String name, String position, int age){
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(SoccerPlayer player) {
        return name.compareTo(player.getName());
    }
}
