package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	public static void main(String[] args) {
		String lol;
		int lolol = 0;

		try {
			BufferedReader b = new BufferedReader(new FileReader("src/lolol.txt"));
			lol = b.readLine();
			System.out.println(lol);
			for (int i = 0; i < lol.length(); i++) {
				 lolol = (lol.charAt(i/2));
				 System.out.println(lolol);
				 char hi = (char)lolol;
				 System.out.println(hi);
				 lol = lol.substring(0, i)+hi+lol.substring(i+1);
				}
				 JOptionPane.showMessageDialog(null, lol);
			b.close();
			
			
			
			
		}catch(FileNotFoundException f) {
			f.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}

