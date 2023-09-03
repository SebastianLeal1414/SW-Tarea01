package com.example.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private final Integer PORT = 13;
	
	public Server() {
		Socket clientSocket;
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			while (true) {
				//1
				System.out.println("------1 Iniciando Server Socket------");
				System.out.println("------2 A la espera del ClientSocket------");
				//2
				clientSocket = serverSocket.accept();//Línea de espera a un cliente
				System.out.println("------3 Llegó el ClientSocket----------");
				
				Thread.sleep(3000);
				//3	
				System.out.println("------4 Finaliza la atención del cliente------");
				clientSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Server(); 
	}
	
}
