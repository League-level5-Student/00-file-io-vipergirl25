package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("enter a message");
		int lol;
		for (int i = 0; i < message.length(); i++) {
			lol = message.charAt(i)*2;
			message = message.substring(0,i)+lol+message.substring(i+1);
			System.out.println(message);
			try {
				FileWriter f = new FileWriter("src/lolol.txt");
				f.write(message);
				f.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
