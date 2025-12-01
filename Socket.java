package JAVARuntime;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.nio.channels.SocketChannel;

public class Socket extends java.net.Socket {

    private java.net.Socket imposter;

    public Socket() {
        validateThread();
    }

    public Socket(java.net.Socket imposter) {
        this.imposter = imposter;
    }

    public Socket(Proxy proxy) {
        super(proxy);
    }

    public Socket(SocketImpl impl) throws SocketException {
        super(impl);
    }

    public Socket(String host, int port) throws IOException {
        super(host, port);
    }

    public Socket(InetAddress address, int port) throws IOException {
        super(address, port);
    }

    public Socket(String host, int port, InetAddress localAddr, int localPort) throws IOException {
        super(host, port, localAddr, localPort);
    }

    public Socket(InetAddress address, int port, InetAddress localAddr, int localPort) throws IOException {
        super(address, port, localAddr, localPort);
    }

    public Socket(String host, int port, boolean stream) throws IOException {
        super(host, port, stream);
    }

    public Socket(InetAddress host, int port, boolean stream) throws IOException {
        super(host, port, stream);
    }

    @Override
    public void connect(SocketAddress endpoint) throws IOException {
        if(imposter != null) {
            imposter.connect(endpoint);
            return;
        }
        validateThread();
        super.connect(endpoint);
    }

    @Override
    public void connect(SocketAddress endpoint, int timeout) throws IOException {
        if(imposter != null) {
            imposter.connect(endpoint, timeout);
            return;
        }
        validateThread();
        super.connect(endpoint, timeout);
    }

    @Override
    public void bind(SocketAddress bindpoint) throws IOException {
        if(imposter != null) {
            imposter.bind(bindpoint);
            return;
        }
        validateThread();
        super.bind(bindpoint);
    }

    @Override
    public InetAddress getInetAddress() {
        if(imposter != null) return imposter.getInetAddress();
        return super.getInetAddress();
    }

    @Override
    public InetAddress getLocalAddress() {
        if(imposter != null) return imposter.getLocalAddress();
        return super.getLocalAddress();
    }

    @Override
    public int getPort() {
        if(imposter != null) return imposter.getPort();
        return super.getPort();
    }

    @Override
    public int getLocalPort() {
        if(imposter != null) return imposter.getLocalPort();
        return super.getLocalPort();
    }

    @Override
    public SocketAddress getRemoteSocketAddress() {
        if(imposter != null) return imposter.getRemoteSocketAddress();
        return super.getRemoteSocketAddress();
    }

    @Override
    public SocketAddress getLocalSocketAddress() {
        if(imposter != null) return imposter.getLocalSocketAddress();
        return super.getLocalSocketAddress();
    }

    @Override
    public SocketChannel getChannel() {
        if(imposter != null) return imposter.getChannel();
        return super.getChannel();
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if(imposter != null) return imposter.getInputStream();
        return super.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        if(imposter != null) return imposter.getOutputStream();
        return super.getOutputStream();
    }

    @Override
    public void setTcpNoDelay(boolean on) throws SocketException {
        if(imposter != null) {
            imposter.setTcpNoDelay(on);
            return;
        }
        super.setTcpNoDelay(on);
    }

    @Override
    public boolean getTcpNoDelay() throws SocketException {
        if(imposter != null) return imposter.getTcpNoDelay();
        return super.getTcpNoDelay();
    }

    @Override
    public void setSoLinger(boolean on, int linger) throws SocketException {
        if(imposter != null) {
            imposter.setSoLinger(on, linger);
            return;
        }
        super.setSoLinger(on, linger);
    }

    @Override
    public int getSoLinger() throws SocketException {
        if(imposter != null) return imposter.getSoLinger();
        return super.getSoLinger();
    }

    @Override
    public void sendUrgentData(int data) throws IOException {
        if(imposter != null) {
            imposter.sendUrgentData(data);
            return;
        }
        super.sendUrgentData(data);
    }

    @Override
    public void setOOBInline(boolean on) throws SocketException {
        if(imposter != null) {
            imposter.setOOBInline(on);
            return;
        }
        super.setOOBInline(on);
    }

    @Override
    public boolean getOOBInline() throws SocketException {
        if(imposter != null) return imposter.getOOBInline();
        return super.getOOBInline();
    }

    @Override
    public synchronized void setSoTimeout(int timeout) throws SocketException {
        if(imposter != null) {
            imposter.setSoTimeout(timeout);
            return;
        }
        super.setSoTimeout(timeout);
    }

    @Override
    public synchronized int getSoTimeout() throws SocketException {
        if(imposter != null) return imposter.getSoTimeout();
        return super.getSoTimeout();
    }

    @Override
    public synchronized void setSendBufferSize(int size) throws SocketException {
        if(imposter != null) {
            imposter.setSendBufferSize(size);
            return;
        }
        super.setSendBufferSize(size);
    }

    @Override
    public synchronized int getSendBufferSize() throws SocketException {
        if(imposter != null) return imposter.getSendBufferSize();
        return super.getSendBufferSize();
    }

    @Override
    public synchronized void setReceiveBufferSize(int size) throws SocketException {
        if(imposter != null) {
            imposter.setReceiveBufferSize(size);
            return;
        }
        super.setReceiveBufferSize(size);
    }

    @Override
    public synchronized int getReceiveBufferSize() throws SocketException {
        if(imposter != null) return imposter.getReceiveBufferSize();
        return super.getReceiveBufferSize();
    }

    @Override
    public void setKeepAlive(boolean on) throws SocketException {
        if(imposter != null) {
            imposter.setKeepAlive(on);
            return;
        }
        super.setKeepAlive(on);
    }

    @Override
    public boolean getKeepAlive() throws SocketException {
        if(imposter != null) return imposter.getKeepAlive();
        return super.getKeepAlive();
    }

    @Override
    public void setTrafficClass(int tc) throws SocketException {
        if(imposter != null) {
            imposter.setTrafficClass(tc);
            return;
        }
        super.setTrafficClass(tc);
    }

    @Override
    public int getTrafficClass() throws SocketException {
        if(imposter != null) return imposter.getTrafficClass();
        return super.getTrafficClass();
    }

    @Override
    public void setReuseAddress(boolean on) throws SocketException {
        if(imposter != null) {
            imposter.setReuseAddress(on);
            return;
        }
        super.setReuseAddress(on);
    }

    @Override
    public boolean getReuseAddress() throws SocketException {
        if(imposter != null) return imposter.getReuseAddress();
        return super.getReuseAddress();
    }

    @Override
    public synchronized void close() throws IOException {
        if(imposter != null) {
            imposter.close();
            return;
        }
        super.close();
    }

    @Override
    public void shutdownInput() throws IOException {
        if(imposter != null) {
            imposter.shutdownInput();
            return;
        }
        super.shutdownInput();
    }

    @Override
    public void shutdownOutput() throws IOException {
        if(imposter != null) {
            imposter.shutdownOutput();
            return;
        }
        super.shutdownOutput();
    }

    @Override
    public String toString() {
        if(imposter != null) return imposter.toString();
        return super.toString();
    }

    @Override
    public boolean isConnected() {
        if(imposter != null) return imposter.isConnected();
        return super.isConnected();
    }

    @Override
    public boolean isBound() {
        if(imposter != null) return imposter.isBound();
        return super.isBound();
    }

    @Override
    public boolean isClosed() {
        if(imposter != null) return imposter.isClosed();
        return super.isClosed();
    }

    @Override
    public boolean isInputShutdown() {
        if(imposter != null) return imposter.isInputShutdown();
        return super.isInputShutdown();
    }

    @Override
    public boolean isOutputShutdown() {
        if(imposter != null) return imposter.isOutputShutdown();
        return super.isOutputShutdown();
    }

    @Override
    public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) {
        if(imposter != null) {
            imposter.setPerformancePreferences(connectionTime, latency, bandwidth);
            return;
        }
        super.setPerformancePreferences(connectionTime, latency, bandwidth);
    }

    @Override
    public int hashCode() {
        if(imposter != null) return imposter.hashCode();
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(imposter != null) return imposter.equals(obj);
        return super.equals(obj);
    }

    private static void validateThread() {
        //
    }
}
