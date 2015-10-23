package chat.view;

import javax.swing.JOptionPane;

public class ChatView
	{
		public String grabInput(String displayText)
		{
			String returnedText = "";
			
			returnedText = JOptionPane.showInputDialog(null, displayText);
			
			return returnedText;
		}
		
		public void displayText(String grabInput)
		{
			JOptionPane.showMessageDialog(null, grabInput);
		}
	}
