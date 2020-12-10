package gammaltSkrap;

import gammaltSkrap.Game;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {

    public static void main(String[] args) throws IOException {

        while(true){

            ServerSocket sls = new ServerSocket(55555);
            Socket s1 = sls.accept();
            Socket s2 = sls.accept();

            Game game = new Game(s1, s2);
            game.start();

        }
    }




}
