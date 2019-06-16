package _03_To_Do_List;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements MouseListener {
	JLabel j = new JLabel();
	String text = "";
	public static void main(String[] args) {
		new ToDoList().UI();
	}
	JFrame frame = new JFrame();JPanel panel=new JPanel();JButton one = new JButton("add task");JButton two=new JButton("view tasks");JButton three=new JButton("remove task");JButton four=new JButton("save list");JButton five=new JButton("load list");
	ArrayList<String>tasks = new ArrayList<String>();
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	void UI() {
		one.addMouseListener(this);two.addMouseListener(this);three.addMouseListener(this);four.addMouseListener(this);five.addMouseListener(this);
		panel.add(one);panel.add(two);panel.add(three);panel.add(four);panel.add(five);frame.add(panel);frame.setVisible(true);frame.setSize(300, 800);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==one) {
			String task = JOptionPane.showInputDialog("enter task");
			tasks.add(task);
		}else if(e.getSource()==two) {
			text = "";
			for (int i = 0; i < tasks.size(); i++) {
				text = text + " " + tasks.get(i);
				j.setText(text);
				System.out.println(tasks.get(i));
				panel.add(j);
				frame.pack();
			}
		}else if(e.getSource()==three) {
			text = "";
			for (int i = 0; i < tasks.size(); i++) {
				text = text + " " + tasks.get(i);
				j.setText(text);
				System.out.println(tasks.get(i));
				panel.add(j);
				frame.pack();
			}
			String rem = JOptionPane.showInputDialog("starting with 0 for the first and counting updwards, which would you like to remove");
			int remove = Integer.parseInt(rem);
			tasks.remove(remove);
			
		}else if(e.getSource()==four) {
			try {
				FileWriter f = new FileWriter("src/thing.txt");
				for (int i = 0; i < tasks.size(); i++) {
					f.write(tasks.get(i) + "\n");
				}
				f.close();
			} catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==five) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/thing.txt"));
				
				String line = br.readLine();
				while(line != null){
					System.out.println(line);
					line = br.readLine();
					tasks.add(line);
				}
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
