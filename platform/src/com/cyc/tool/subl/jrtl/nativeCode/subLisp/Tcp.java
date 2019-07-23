/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;
import static org.armedbear.lisp.Lisp.*;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSocketStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Tcp extends SubLTrampolineFile {
    private static class ServerSocketHandlerProcess extends SafeRunnable {
        ServerSocketHandlerProcess(SubLFunction func, Socket connectionSocket) {
            InetAddress inetAddress = connectionSocket.getInetAddress();
            this.func = func;
            this.connectionSocket = connectionSocket;
            ipAddress = SubLObjectFactory.makeInteger(computeIPAddress(inetAddress.getAddress()));
            host = SubLObjectFactory.makeString(inetAddress.getCanonicalHostName());
        }

        private Socket connectionSocket;
        private SubLFunction func;
        private SubLSocketStream socketStream;
        private SubLString host;
        private SubLInteger ipAddress;

        @Override
        public synchronized void safeRun() {
            SubLObject oldRemoteHostname = Dynamic.currentBinding(Tcp.$remote_hostname$);
            SubLObject oldRemoteAddress = Dynamic.currentBinding(Tcp.$remote_address$);
            SubLObject oldRetainClientSocket = Dynamic.currentBinding(Tcp.$retain_client_socketP$);
            try {
                Dynamic.bind(Tcp.$remote_hostname$, host);
                Dynamic.bind(Tcp.$remote_address$, ipAddress);
                Dynamic.bind(Tcp.$retain_client_socketP$, SubLNil.NIL);
                socketStream = SubLObjectFactory.makeSocketStream(connectionSocket);
                final int port100 = connectionSocket.getLocalPort() % 20;
                if (port100 == 1) {
                    connectionSocket.setSoTimeout(0);
                    SystemCurrent.setIn(connectionSocket.getInputStream());
                    SystemCurrent.setOut(new PrintStream(connectionSocket.getOutputStream()));
                    SystemCurrent.setErr(new PrintStream(connectionSocket.getOutputStream()));
                } else {
                    connectionSocket.setSoTimeout(30000);
                }
                Functions.funcall(func, socketStream, socketStream);
            } catch (Throwable e) {
                Errors.error("Error detected on socket connection: " + socketStream, e);
                try {
                    if (socketStream != null && Tcp.$retain_client_socketP$.getValue() == SubLNil.NIL)
                        try {
                            socketStream.close();
                        } finally {
                            socketStream = null;
                        }
                } finally {
                    Dynamic.rebind(Tcp.$remote_hostname$, oldRemoteHostname);
                    Dynamic.rebind(Tcp.$remote_address$, oldRemoteAddress);
                    Dynamic.rebind(Tcp.$retain_client_socketP$, oldRetainClientSocket);
                }
            } finally {
                try {
                    if (socketStream != null && Tcp.$retain_client_socketP$.getValue() == SubLNil.NIL)
                        try {
                            socketStream.close();
                        } finally {
                            socketStream = null;
                        }
                } finally {
                    Dynamic.rebind(Tcp.$remote_hostname$, oldRemoteHostname);
                    Dynamic.rebind(Tcp.$remote_address$, oldRemoteAddress);
                    Dynamic.rebind(Tcp.$retain_client_socketP$, oldRetainClientSocket);
                }
            }
        }
    }

    private static class ServerSocketProcess extends SafeRunnable {
        ServerSocketProcess(int port, SubLObject funcSpec) {
            this.funcSpec = funcSpec;
            this.port = port;
            try {
                (serverSocket = new ServerSocket(port)).setSoTimeout(500);
            } catch (IOException e) {
                Errors.error("Unable to create server socket on port: " + port, e);
            }
        }

        private SubLObject funcSpec;
        private ServerSocket serverSocket;
        private int port;
        private static int SOCKET_ACCEPT_TIMEOUT_MSECS = 500;

        private void cleanup(Socket newSock) {
            if (newSock != null)
                try {
                    newSock.close();
                } catch (Exception ex) {
                }
            try {
                serverSocket.close();
            } catch (Exception ex2) {
            }
            funcSpec = null;
        }

        @Override
        public void safeRun() {
            SystemCurrent.attachConsole();
            Socket socket = null;
            try {
                while (true) {
                    socket = null;
                    try {
                        try {
                            socket = serverSocket.accept();
                        } catch (SocketTimeoutException ste) {
                            Threads.possiblyHandleInterrupts(false);
                        }
                        if (socket == null)
                            continue;
                        SubLObject rawAcceptAll = Tcp.$tcp_localhost_onlyP$.getGlobalValue();
                        boolean acceptAll = rawAcceptAll == null || rawAcceptAll.isNil();
                        boolean isLocalHost = false;
                        if (!acceptAll)
                            isLocalHost = socket.getInetAddress().isLoopbackAddress();
                        if (acceptAll || isLocalHost)
                            SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Socket Connection Handler: "
                                    + socket), new ServerSocketHandlerProcess(funcSpec.getFunc(), socket));
                        else {
                            socket.close();
                            socket = null;
                        }
                    } catch (IOException ioe) {
                        Errors.handleError("Error accepting socket connection.", ioe);
                    }
                }
            } finally {
                cleanup(socket);
            }
        }
    }

    private static long computeIPAddress(byte[] rawAddress) {
        long result = 0L;
        for (byte nextByte : rawAddress) {
            result <<= 8;
            result += nextByte;
        }
        return result;
    }

    /**
     * @param var20
     * @param var21
     * @return
     */
    public static SubLObject open_tcp_stream(SubLObject host, SubLObject port) {
        return open_tcp_stream(host, port, NIL);
    }

    public static SubLObject open_tcp_stream(SubLObject host, SubLObject port, SubLObject timeoutSeconds) {
        int timeoutMs = 60000;
        if (timeoutSeconds == SubLNil.NIL)
            timeoutMs = 65536000;
        else if (timeoutSeconds != CommonSymbols.UNPROVIDED)
            timeoutMs = timeoutSeconds.intValue() * 1000;
        return SubLObjectFactory.makeSocketStream(host.getStringValue(), port.intValue(), timeoutMs);
    }

    public static SubLObject start_tcp_server(SubLObject port, SubLObject handler) {
        SubLFunction handlerTyped = handler.getFunc();
        int portTyped = port.intValue();
        SubLProcess result = SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Socket Server (port: "
                + portTyped + " handler: " + handler + ")"), new ServerSocketProcess(portTyped, handler));
        synchronized (Tcp.portToServerSocketProcessMap) {
            Tcp.portToServerSocketProcessMap.put(port, result);
        }
        return result;
    }

    public static SubLObject stop_tcp_server(SubLObject port) {
        SubLProcess process = null;
        synchronized (Tcp.portToServerSocketProcessMap) {
            process = (SubLProcess) Tcp.portToServerSocketProcessMap.remove(port);
        }
        if (process == null)
            Errors.error(port + " is not a tcp server port designator.");
        else
            process.killProcess();
        return SubLNil.NIL;
    }

    public static SubLFile me;
    public static SubLSymbol $retain_client_socketP$;
    public static SubLSymbol $tcp_localhost_onlyP$;
    public static SubLSymbol $remote_hostname$;
    public static SubLSymbol $remote_address$;
    private static Map portToServerSocketProcessMap;
    static {
        me = new Tcp();
        portToServerSocketProcessMap = new HashMap();
    }

    @Override
    public void declareFunctions() {
        SubLFiles.declareFunction(Tcp.me, "open_tcp_stream", "OPEN-TCP-STREAM", 2, 1, false);
        SubLFiles.declareFunction(Tcp.me, "start_tcp_server", "START-TCP-SERVER", 2, 0, false);
        SubLFiles.declareFunction(Tcp.me, "stop_tcp_server", "STOP-TCP-SERVER", 1, 0, false);
    }

    @Override
    public void initializeVariables() {
        Tcp.$retain_client_socketP$ = SubLFiles.defvar(Tcp.me, "*RETAIN-CLIENT-SOCKET?*", SubLNil.NIL);
        Tcp.$tcp_localhost_onlyP$ = SubLFiles.defvar(Tcp.me, "*TCP-LOCALHOST-ONLY?*", SubLNil.NIL);
        Tcp.$remote_hostname$ = SubLFiles.defvar(Tcp.me, "*REMOTE-HOSTNAME*", SubLNil.NIL);
        Tcp.$remote_address$ = SubLFiles.defvar(Tcp.me, "*REMOTE-ADDRESS*", SubLNil.NIL);
    }

    @Override
    public void runTopLevelForms() {
    }
    //
    //	public static SubLObject open_tcp_stream(SubLObject globalValue, SubLObject globalValue2) {
    //		// TODO Auto-generated method stub
    //		if(true) Errors.unimplementedMethod("Auto-generated method stub:  Tcp.open_tcp_stream");
    //		return null;
    //	}

}
