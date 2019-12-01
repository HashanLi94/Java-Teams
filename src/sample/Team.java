package sample;

public class Team {
    String sport;
    String fName;
    String lName;
    int number;
    String possition;


    void setDetails(String s, String f, String l, int r, String p){
        sport = s;
        fName = f;
        lName = l;
        number = r;
        possition = p;
    }

    void speak(){
        System.out.println(sport + fName + lName + number+ possition);
    }

    void training(){
        System.out.println("You should come at 4.00 p.m sharp to the ground");
    }

}
