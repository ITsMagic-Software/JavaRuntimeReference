package JAVARuntime;

import java.io.IOException;
import java.net.DatagramSocketImpl;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

public class DatagramSocket extends java.net.DatagramSocket {

    public DatagramSocket() throws SocketException {
        validateThread();
    }

    public DatagramSocket(DatagramSocketImpl impl) {
        super(impl);
    }

    public DatagramSocket(SocketAddress bindaddr) throws SocketException {
        super(bindaddr);
    }

    public DatagramSocket(int port) throws SocketException {
        super(port);
    }

    public DatagramSocket(int port, InetAddress laddr) throws SocketException {
        super(port, laddr);
    }

    @Override
    public synchronized void bind(SocketAddress addr) throws SocketException {
        validateThread();
        super.bind(addr);
    }

    @Override
    public void connect(InetAddress address, int port) {
        validateThread();
        super.connect(address, port);
    }

    @Override
    public void connect(SocketAddress addr) throws SocketException {
        validateThread();
        super.connect(addr);
    }

    private static void validateThread() {
        //
    }
}
