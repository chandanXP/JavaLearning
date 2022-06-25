package com.company.Practice;

import java.net.*;
import java.net.DatagramSocket;
public class Receiver
{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte  buf[] = {12,13};
        //DatagramSocket dp = new DatagramSocket(buf, 2);

        //ds.receiver(dp);
        //String str = new String(dp.getData(), 0, dp.getLength());
        //System.out.println(str);
        ds.close();
    }
}
