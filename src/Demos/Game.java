package Demos;

import java.net.Socket;

public class Game extends Thread{
    Socket spelare1;
    Socket spelare2;
    //ObjectWriter  owPlayer1...
    //ObjectReader  orPlayer1...
    //ObjectWriter owPlayer2.....
    //ObjectReader orPlayer2.....

    public Game(Socket spelare1, Socket spelare2){
        this.spelare1 = spelare1;
        this.spelare2 = spelare2;
        //ev kan man wrappa sockeetarna här
    }

    public void run(){
        //SKicka kategorier till spelare 1
        //Skicka "Vänta" till spelare 2

        //Ta emot kategorier från spelare 1

        //SKicka frågor till spelare 1
        //Skicka "Vänta" till spelare 2

        //Ta emot svar från spelare 1

        //SKicka frågor till spelare 2
        //Skicka "Vänta" till spelare 1

        //Ta emot svar från spelare 2

        //Repetera ett visst antal gånger

        //SKicka resultat till spelare 1
        //SKicka resultat till spelare 2
    }


}
