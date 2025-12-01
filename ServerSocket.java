package JAVARuntime;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerSocket extends java.net.ServerSocket {

    public ServerSocket() throws IOException {
        validateThread();
    }

    public ServerSocket(int port) throws IOException {
        super(port);
    }

    public ServerSocket(int port, int backlog) throws IOException {
        super(port, backlog);
    }

    public ServerSocket(int port, int backlog, InetAddress bindAddr) throws IOException {
        super(port, backlog, bindAddr);
    }

    @Override
    public void bind(SocketAddress endpoint) throws IOException {
        validateThread();
        super.bind(endpoint);
    }

    @Override
    public void bind(SocketAddress endpoint, int backlog) throws IOException {
        validateThread();
        super.bind(endpoint, backlog);
    }

    @Override
    public Socket accept() throws IOException {
        return new JAVARuntime.Socket(super.accept());
    }

    private static void validateThread() {
        //
    }
}
