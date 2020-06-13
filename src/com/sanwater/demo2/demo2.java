package com.sanwater.demo2;

import java.io.*;

public class demo2 {
    public static void main(String[] args) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(new File("D:\\a.txt")));
            System.out.println(r.readLine());
            r.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
