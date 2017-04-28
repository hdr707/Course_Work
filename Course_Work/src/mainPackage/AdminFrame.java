package mainPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import classPackage.*;

public class AdminFrame extends classAdminFrame {

	private JPanel panel = new JPanel();

	public AdminFrame() {
		
		getContentPane().setLayout(null);
		setPanel(panel, 10, 11, 415, 320);
		getContentPane().add(panel);
		
		Design(panel);
		
		sendTourCost(button[0], label[2], answer2, textField[2], textField[3], textField[0], textField[1]);
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
					frame.setVisible(true);
					frame.setSize(445, 310);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



}
