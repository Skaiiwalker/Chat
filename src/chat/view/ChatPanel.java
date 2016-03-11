package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class ChatPanel extends JPanel
{
	private SpringLayout baseLayout;
	private ChatController baseController;
	private JButton testButton;
	private JTextArea chatArea;
	private JTextField typingField;
	private JButton submitButton;
	private JLabel promptLabel;
	private JScrollPane textPane;
	private JButton tweetButton;
	private JButton analyzeTwitterButton;
	private JButton saveButton;
	private JButton loadButton;
	
	//need a text view you can't enter text into.
	
	public ChatPanel(ChatController baseController)
	{
		baseLayout = new SpringLayout();
		chatArea = new JTextArea(10, 30);
		typingField = new JTextField(30);
		submitButton = new JButton ("Submit");
		testButton = new JButton("Chat");
		tweetButton = new JButton("Tweet");
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		analyzeTwitterButton = new JButton("Analyze some tweets");
		
		setupChatPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupChatPane()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.WHITE);
		this.add(typingField);
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
		
		testButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.sendTweet("no text to send");
			}
		});
		
		analyzeTwitterButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String user = typingField.getText();
				String results = baseController.analyze(user);
				chatArea.setText(results);
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
