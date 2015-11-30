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
