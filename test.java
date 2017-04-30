package com.example.bharadwaj.sclient;

import org.junit.Test;

import java.net.InetAddress;

import static org.junit.Assert.*;

/**
 * Created by Group 22 on 25/3/2017.
 */
public class clientConnectTest {
    @Test
    public boolean run1() throws Exception {

            InetAddress address= InetAddress.getByName("127.0.0.1");
        boolean rch=address.isReachable(50);
        return rch;
    }

}