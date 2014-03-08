/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.*;
import java.net.*;

/**
 *
 * @author Luca
 */
public class Client {

   
    public static void main(String[] args) throws IOException {
       Socket s = new Socket("127.0.0.1", 6666);
        BufferedReader sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
        
        while (true) {
            sock_out.println(std_in.readLine());
            System.out.println(sock_in.readLine());
        }
    }
}
    

