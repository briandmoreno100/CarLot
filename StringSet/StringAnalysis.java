/*
 * 
 * author Brian Moreno
 */
import javax.swing.*;
import java.awt.event.ActionEvent;


public class StringAnalysis {

	private StringSet sSet;
	private JTextField inputStr;
	private JLabel numStr;
	private JLabel numChar;
	
	public StringAnalysis() {
		WidgetViewer one = new WidgetViewer();
		sSet = new StringSet();
		JLabel prompt = new JLabel("Enter a String");
		inputStr = new JTextField(10);
		JButton pushMe = new JButton("Push to include String");
		
		numStr = new JLabel("Number of Strings: 0");
		numChar = new JLabel("Number of Characters: 0");
		ButtonEventHandler action = new ButtonEventHandler();
		pushMe.addActionListener(action);
		inputStr.addActionListener(action);
		one.add(prompt, 10, 10, 200, 30);
		one.add(pushMe, 250, 10, 200, 30);
		one.add(inputStr, 100, 10, 150, 30);
		one.add(numChar, 200, 40, 200, 30);
		one.add(numStr, 450, 10, 200, 30);
		
	}
		class ButtonEventHandler extends WidgetViewerActionEvent{
			@Override
			public void actionPerformed(ActionEvent e) {
				sSet.add(inputStr.getText());
				inputStr.setText("");
				numStr.setText("Number of Strings: " + sSet.size());
				//numStr = new JLabel("Number of Strings: " + sSet.size());
				numChar.setText("Number of Strings: " + sSet.numChars());
				
			}

		}
		
}
