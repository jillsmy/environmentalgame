


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

//import QuizScreen.openQuizButtonListener;


//import SummaryScreen.openQuizButtonListener;


import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OceanQ3Screen extends JPanel implements QInterface{

	private JPanel oq3screen;
	
	private AppletMain applet;

	JTextField userInput;
	
	String[][] question = new String[][]{{"What is a major cause of rising sea levels?", "B", "A. People aren't drinking as much water as they used to", "B. Glaciers are melting", "C. Increased volcanic activity is resulting in many new islands"}};
	
	String funFact = "When temperatures rise and ice melts, more water flows to the seas from glaciers and ice caps, and ocean water warms and expands in volume. This combination of effects has played the major role in raising average global sea level between four and eight inches (10 and 20 centimeters) in the past hundred years, according to the Intergovernmental Panel on Climate Change (IPCC).";
	
	private int points; 
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.oq3tooq4();
		}
	}
	
	
	public OceanQ3Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		oq3screen = new JPanel();
		oq3screen.setBackground(Color.WHITE);
		oq3screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Global climate change is affecting sea life as well!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel oq4ButtonPanel = new JPanel();
		oq4ButtonPanel.setBackground(Color.WHITE);
		JButton oq4Button = new JButton("Next!");
		oq4Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		oq4Button.addActionListener(new openQuizButtonListener());
		oq4ButtonPanel.add(oq4Button);
		
		
		
		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		userInput = new JTextField(1);
		
		String input = new String();
		
		input = userInput.getText();
		
		TextHandler handler = new TextHandler();
		userInput.addActionListener(handler);
		
		
		
		
		oq3screen.add(titleSummary, BorderLayout.PAGE_START);
		oq3screen.add(q, BorderLayout.CENTER);
		oq3screen.add(oq4ButtonPanel, BorderLayout.PAGE_END);
		
		add(oq3screen);
		
		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	private class TextHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == userInput){
				String display = e.getActionCommand();
			}
			//JOptionPane.showMessageDialog(null, display); // this is not working :/
		}
		
	}
	
	
	
	@Override
	public int getPoints() { return points; }


	@Override
	public void displayQuestion() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void printQ() {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public boolean isAnswerCorrect(int x, char userAnswer) {
		// TODO Auto-generated method stub
		
		String correct = "Correct!";
		String incorrect = "Incorrect!";
		
		boolean correctAnswer = (userAnswer + "").equalsIgnoreCase(question[x][1]);
		if (correctAnswer){
			JOptionPane.showMessageDialog(this, correct, "Correct!", JOptionPane.YES_NO_OPTION);
			}else{
			JOptionPane.showMessageDialog(this, incorrect, "Incorrect!", JOptionPane.YES_NO_OPTION);
		}
		
		return correctAnswer;
	}


	@Override
	public void displayFunFact() {
		// TODO Auto-generated method stub
		
	};
	
}