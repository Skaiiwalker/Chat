package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextField typingField;
	private JButton submitButton;
	private JTextArea chatArea;
	private JLabel promptLabel;
	//need a text view you can't enter text into.
	
	public ChatPanel(ChatController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(10, 30);
		typingField = new JTextField(30);
		promptLabel = new JLabel("Chat with me");
		submitButton = new JButton("asda");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.WHITE);
		this.add(chatArea);
		this.add(typingField);
		this.add(submitButton);
		this.add(promptLabel);
		typingField.setToolTipText("Type here for the chatbot");
		chatArea.setEnabled(false);
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = typingField.getText();
				chatArea.append("\nUser " + userText);
				typingField.setText("");
				String response = baseController.userToChatbot(userText);
				chatArea.append("\nChatbot: " + response);
			}
		});
	}
	
	public JTextField getTextField()
	{
		return typingField;
	}
	
	public JButton getSubmitButton()
	{
		return submitButton;
	}
	
	public JTextArea getChatArea()
	{
		return chatArea;
	}
	
	public JLabel getPromptLabel()
	{
		return promptLabel;
	}
	
	
}
