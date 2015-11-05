package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Popup display class for GUI interaction in the Chatbot project.
 * @author Luke Barrowes
 * @version 1.3 11/5/15 Added Icons to popup windows!
 * 
 */
public class ChatView
	{
		private String windowMessage;
		private ImageIcon chatIcon;
	
		public ChatView()
		{
			windowMessage = "Hello from your friendly stalker, Tony.  ;)";
			chatIcon = new ImageIcon(getClass().getResource("images/undertale.jpg"));
		}
		
		/**
		 * Displays a GUI popup for collecting user text  with the supplied String.
		 * Usually in the form of a question to collect for further use in the program.
		 * @param displayText The text to show in the popup window.  Should be a question.
		 * @return the text supplied by the user.
		 */
		public String grabInput(String displayText)
		{
			String userInput = "";
			
			userInput = JOptionPane.showInputDialog(null, displayText, windowMessage, JOptionPane.PLAIN_MESSAGE, chatIcon, null, "Answer here ;)").toString();
			
			return userInput;
		}
		
		public void displayText(String displayText)
		{
			JOptionPane.showMessageDialog(null, displayText, windowMessage, JOptionPane.INFORMATION_MESSAGE, chatIcon);
		}
	}
