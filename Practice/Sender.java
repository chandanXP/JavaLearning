package com.company.Practice;

import java.net.*;
public class Sender
{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome to NPTEL";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        //DatagramSocket dp = new DatagramSocket(str.getBytes(), str.length(), ip, 3000);
        //ds.send(dp);
        ds.close();
    }
}

