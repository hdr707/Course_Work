package classPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import mainPackage.Calculator;

public class classAdminFrame extends JFrame {
	
	protected String answer2 = "Нет!";
	private String answer1 = "Да!";
	protected JButton[] button = new JButton [2];
	protected JLabel[] label = new JLabel[7];
	protected JTextField[] textField = new JTextField[4];
	protected String[] text = {"Расcчитать и отправить стоимость тура", "Выйти из режима",
			"Расчёт стоимости тура", "Заявка есть? -", answer2, "Стоимость проживания одного туриста за одну ночь -", 
			"Стоимость перевозки туда и обратно -", "Стоимость питания -", "Маржинальный доход (в процентах) -",};
	protected Integer[] coordxy = {0, 270, 110, 0, 90, 0, 0, 0, 0, 340, 250, 135, 240,
			 200, 200, 0, 30, 30, 60, 90, 120, 150, 60, 90, 120, 150};
	protected Integer[] scale = {255, 140, 285, 120, 50, 340, 240, 130, 235, 50,
			30};
	protected Integer[] size = {13, 13, 20, 14, 16, 14, 14, 14, 14, 14};
	
	public void setJButton(int i, JPanel panel) {
			button[i] = new JButton();
			button[i].setText(text[i]);
			button[i].setBounds(coordxy[i], coordxy[i + 13], scale[i], scale[10]);
			button[i].setFont(new Font("Segoe UI Light", Font.PLAIN, size[i]));
			panel.add(button[i]);
	}
	
	protected void setJLabel(int i, JPanel panel) {
			label[i] = new JLabel();
			label[i].setText(text[i + 2]);
			label[i].setBounds(coordxy[i + 2], coordxy[i + 15], scale[i + 2], scale[10]);	
			label[i].setFont(new Font("Segoe UI Light", Font.PLAIN, size[i + 2]));
			panel.add(label[i]);
	}
	
	protected void setJTextField(int i, JPanel panel) {
			textField[i] = new JTextField();
			textField[i].setBounds(coordxy[i + 9], coordxy[i + 22], scale[9], scale[10]);
			textField[i].setFont(new Font("Segoe UI Light", Font.PLAIN, size[9]));
			panel.add(textField[i]);
	}
	
	public JPanel setPanel (JPanel panel, int x, int y, int width, int height) {
		panel.setBounds(x, y, width, height);
		panel.setLayout(null);
		return panel;
	}
	
	public void Design(JPanel panel) {
		for (int i = 0; i < 7; i++){
			if (i < 2) {
				setJButton(i, panel);
				setJLabel(i, panel);
				setJTextField(i, panel);
			}
			else if (i >= 2 && i < 4) {
				setJLabel(i, panel);
				setJTextField(i, panel); 
			}
			else if (i >= 4) {
				setJLabel(i, panel);
			}
		}
	}
	
	public String getAnswer1() {
		return answer1;
	}
	
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
		if (Calculator.getcountnight() > 0) {
			this.label[2].setText(this.answer1);
		}
		else {
			this.label[2].setText("Нет!");
		}
	}
	
	public void sendTourCost(JButton button, JLabel label, String answer2, JTextField textFieldFoodPrice, JTextField textFieldProcent, 
			JTextField textFieldTourPrice, JTextField textFieldTransportPrice) {
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (label.getText() != answer2) {
					
					if (!textFieldFoodPrice.getText().equals("0") && !textFieldProcent.getText().equals("0")
							&& !textFieldTourPrice.getText().equals("0") && !textFieldTransportPrice.getText().equals("0")) {
						
						if (!textFieldFoodPrice.getText().equals(null) && !textFieldFoodPrice.getText().isEmpty() 
								&& !textFieldProcent.getText().equals(null) && !textFieldProcent.getText().isEmpty()
								&& !textFieldTourPrice.getText().equals(null) && !textFieldTourPrice.getText().isEmpty()
								&& !textFieldTransportPrice.getText().equals(null) && !textFieldTransportPrice.getText().isEmpty() ) {
							
							if (textFieldTourPrice.getText().matches("^\\d*$") && textFieldTransportPrice.getText().matches("^\\d*$")
									&& textFieldFoodPrice.getText().matches("^\\d*$") && textFieldProcent.getText().matches("^\\d*$")) {
								Calculator.setpriceonetourist(textFieldTourPrice);
								Calculator.setpricetransport(textFieldTransportPrice);
								Calculator.setpricefood(textFieldFoodPrice);
								Calculator.setprocent(textFieldProcent);
								Calculator.setTourcost();
								JOptionPane.showMessageDialog(null, "Стоимость тура отправлена!", "Информация о заявке", JOptionPane.PLAIN_MESSAGE);
							}
							else {
								JOptionPane.showMessageDialog(null, "Обработайте правильно заявку!", "Ошибка", JOptionPane.PLAIN_MESSAGE);
							}	
						}
						else {
							JOptionPane.showMessageDialog(null, "Обработайте правильно заявку!", "Ошибка", JOptionPane.PLAIN_MESSAGE);
						}
					}
					
					else {
						JOptionPane.showMessageDialog(null, "Обработайте правильно заявку!", "Ошибка", JOptionPane.PLAIN_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Заявки нет!", "Информация", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		
	}
	
	
}
