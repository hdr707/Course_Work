package classPackage;

import java.awt.*;

import javax.swing.*;

public class classModeFrame extends JFrame {
	
	protected JButton[] button = new JButton[2];
	protected String[] textBtn = {"Турагент", "Турист"};
	protected Integer[] btncoordxy = {80, 80, 60, 120};
	protected Integer[] btnscale = {200, 200, 30, 30};	
	protected int btnsizefont = 14;
	public JPanel setPanel (JPanel panel, int x, int y, int width, int height) {	
		panel.setBounds(x, y, width, height);	
		panel.setLayout(null);
		return panel;
	}
	
	public JLabel setLabel(String namelabel, String labeltext, int x, int y, int width, int height, int size, JPanel panel) {	
		JLabel label = new JLabel();	
		label.setName(namelabel);	
		label.setText(labeltext);	
		label.setBounds(x, y, width, height);
		label.setFont(new Font("Segoe UI Light", Font.PLAIN, size));	
		panel.add(label);	
		return label;
	}
	
	protected void setJButton(String textBtn[], Integer btncoordxy[], Integer btnscale[], int btnsizefont, JPanel panel) {	
		for (int i = 0; i < 2; i++) {		
			button[i] = new JButton();		
			button[i].setText(textBtn[i]);	
			button[i].setBounds(btncoordxy[i], btncoordxy[i + 2], btnscale[i], btnscale[i + 2]);	
			button[i].setFont(new Font("Segoe UI Light", Font.PLAIN, btnsizefont));		
			panel.add(button[i]);
		}
	}
}
