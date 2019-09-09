package Client;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TTTClient extends Application {


    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;

    private String localhost = "localhost";


    @Override
    public void start(Stage stage) throws Exception {

    }

    private void serverStart(){

        try {
            Socket socket = new Socket(localhost, 6000);

            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());





        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
