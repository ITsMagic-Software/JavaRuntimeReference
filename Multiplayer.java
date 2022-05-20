package JAVARuntime;

//

import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @Author Lucas Leandro (ITsMagic Founder)
 */
public class Multiplayer {
    //
    public static final int DISCONNECTED = 0;
    public static final int CONNECTED = 1;

    private Multiplayer() { }

    /// Abstracts
    public static void connect(MPRoom room){
        //
    }
    public static void connect(MPRoom room, ConnectionListener connectionListener){
        //
    }
    public static void disconnect(){
        //
    }

    public static void tryConnect(MPRoom room) throws SocketException, UnknownHostException {
        //
    }
    public static void tryConnect(MPRoom room, ConnectionListener connectionListener) throws SocketException, UnknownHostException {
        //
    }
    public static void tryDisconnect() {
        //
    }

    public static String getConnectedRoomAddress(){
        //
        return null;
        //

        //
    }
    public static int getConnectedRoomPort(){
        //
        return 0;
        //

        //
    }
    public static int getPing(){
        //
        return 0;
        //

        //
    }
    public static MPRoom getRoom(String id) {
        //
        return null;
        //

        //
    }
    public static MPRoom getConnectedRoom() {
        //
        return null;
        //

        //
    }

    public static int getState(){
        //
        return 0;
        //

        //
    }
    public static String getClientID() {
        //
        return null;
        //

        //
    }
    public static int getSyncPerSecond(){
        //
        return 0;
        //

        //
    }

    //
}
