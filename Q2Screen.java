


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

import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q2Screen extends JPanel implements QInterface {

	private JPanel q2screen;
	
	private AppletMain applet;
	
	String[][] question = new String[][]{{"What percentage of climate experts believe humans are causing climate change?", "C", "A. 25%", "B. 50%", "C. 97%"}};
	
	String funFact = "In the field of climate studies, a survey of all peer-reviewed papers on the subject 'global climate change' published between 1993 and 2003 shows that not a single paper rejected the consensus position that global warming is man-made. The major scientific agencies of the United States — including the National Aeronautics and Space Administration (NASA) and the National Oceanic and Atmospheric Administration (NOAA) — agree that climate change is occurring and that humans are contributing to it. In 2010, the National Research Council concluded that 'Climate change is occurring, is very likely caused by human activities, and poses significant risks for a broad range of human and natural systems'";
	
	private int points;
	
	
	class openQuizButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			applet.q2toq3();
		}
	}
	
	
	public Q2Screen(AppletMain appletParameter, int setAsPoints)
	{
		points = setAsPoints;
		
		applet = appletParameter;
		
		q2screen = new JPanel();
		q2screen.setBackground(Color.WHITE);
		q2screen.setLayout(new BorderLayout());
		
		
		
		
		
		JLabel titleSummary = new JLabel("<html>Let's See What You Know!</html>");
		titleSummary.setFont(new Font("Helvetica", Font.BOLD, 32));
		titleSummary.setForeground(Color.BLACK);
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		
		
		
		
		//  button to progress to next question
		JPanel q3ButtonPanel = new JPanel();
		q3ButtonPanel.setBackground(Color.WHITE);
		JButton q3Button = new JButton("Next!");
		q3Button.setFont(new Font("Helvetica", Font.BOLD, 16));
		q3Button.addActionListener(new openQuizButtonListener());
		q3ButtonPanel.add(q3Button);
		
		
		JTextArea q = new JTextArea();
		q.setText(question[0][0] + "\n" + question[0][2] + "\n" +  question[0][3] + "\n" + question[0][4]);
		q.setWrapStyleWord(true);
		q.setFont(new Font("Helvetica", Font.BOLD, 20));
		titleSummary.setHorizontalAlignment(JLabel.CENTER);
		titleSummary.setVerticalAlignment(JLabel.CENTER);
		
		
		
		q2screen.add(titleSummary, BorderLayout.PAGE_START);
		q2screen.add(q, BorderLayout.CENTER);
		q2screen.add(q3ButtonPanel, BorderLayout.PAGE_END);
		
		add(q2screen);
		
		validate();
		repaint();

		
	}
	
	
	// need a function(s) to display the question, display the answer choices, and update points based on the
	// user's answer
	
	
	
	
	
	
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
	public boolean isAnswerCorrect(int x, char UserAnswer) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void displayFunFact() {
		// TODO Auto-generated method stub
		
	};
	
}
