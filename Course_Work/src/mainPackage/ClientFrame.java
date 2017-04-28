package mainPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import classPackage.*;

public class ClientFrame extends classClientFrame {
	
	private JPanel panel = new JPanel();
	
	public ClientFrame() {
		getContentPane().setLayout(null);
		setPanel(panel, 10, 11, 415, 320);
		getContentPane().add(panel);
		
		newDesign(panel);
		
		selectRadioBtn(rdbtn[0], rdbtn[1], rdbtn[2]);
		
		sendForm(btn[0], txtfield[0], txtfield[1], chckbx[0], chckbx[1], rdbtn[0], rdbtn[1], rdbtn[2]);
		
		getTourCost(btn[2], txtfield[2]);
		
		}
	
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {			
			public void run() {				
				try {					
					ClientFrame frame = new ClientFrame();					
					frame.setVisible(true);					
					frame.setSize(420, 380);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
