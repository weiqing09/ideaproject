package com.sanwater.demo2;

import java.io.*;

public class demo2 {
    public static void main(String[] args) {
        File f = new File("D:\\a.txt");
        try {
            FileReader in = new FileReader(f);
            BufferedReader r = new BufferedReader(in);
            System.out.println(r.readLine());
            r.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
