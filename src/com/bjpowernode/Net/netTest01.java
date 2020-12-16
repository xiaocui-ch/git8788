package com.bjpowernode.Net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class netTest01 {
    @Test
    public void test01() throws UnknownHostException {
        InetAddress  inetAddress= InetAddress.getByName("www.sina.com");
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
    }
}
