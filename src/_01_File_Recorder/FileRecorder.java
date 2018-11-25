package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("give me a message");
		try {
			FileWriter f = new FileWriter("src/lol.txt");
			f.write(message);
			f.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
