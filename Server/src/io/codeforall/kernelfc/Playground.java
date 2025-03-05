package io.codeforall.kernelfc;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Playground {
    public static void main(String[] args) throws IOException {

        String hostName = "localhost";
        int foreignPort;
        int localPort = 8080;

        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];

        DatagramSocket socket = new DatagramSocket(localPort);

        while (true) {

            DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            socket.receive(receivePacket);

            String translate = new String(receivePacket.getData(), 0, receivePacket.getLength());

            String msgSend = translate.toUpperCase();

            sendBuffer = msgSend.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, receivePacket.getAddress(), receivePacket.getPort());
            socket.send(sendPacket);
        }
    }
}
