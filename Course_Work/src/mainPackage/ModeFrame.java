package mainPackage;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import classPackage.*;

public class ModeFrame extends classModeFrame {

	private JPanel panel = new JPanel();	
	private ClientFrame CF = new ClientFrame();
	private AdminFrame AF = new AdminFrame();

	public ModeFrame() {
		getContentPane().setLayout(null);
		setPanel(panel, 10, 11, 415, 240);	
		getContentPane().add(panel);	
		setLabel("lblselectmode", "Выберите режим", 135, 0, 120, 30, 14, panel);		
		setJButton(textBtn, btncoordxy, btnscale, btnsizefont, panel);
		gotoClientFrame(button[1], CF);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModeFrame frame = new ModeFrame();			
					frame.setVisible(true);			
					frame.setSize(400, 310);				
					frame.setLocationRelativeTo(null);				
				} catch (Exception e) {				
					e.printStackTrace();
				}
			}
		});		
	}
	public void gotoClientFrame (JButton button, ClientFrame frame){ 
		button.addActionListener(new ActionListener() { 
		public void actionPerformed(ActionEvent e) { 
		dispose(); 
		frame.setVisible(true); 
		frame.setSize(420, 380); 
		frame.setLocationRelativeTo(null); 
		} 
		}); 
		}
}
