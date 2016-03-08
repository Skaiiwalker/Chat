package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatView;
import chat.view.ChatFrame;
import chat.model.CTECTwitter;

/**
 * Application controller for the Chatbot project.
 * @author Luke Barrowes
 *@version 1.1.1 10/21/15 fixed error :D
 */
public class ChatController
{
	private Chatbot dumbBot;
	private ChatView myDisplay;
	private ChatFrame baseFrame;
	private CTECTwitter chatTwitter;
	
	public ChatController()
	{
		myDisplay = new ChatView();
		String userName = myDisplay.grabInput("What is your name?");
		dumbBot = new Chatbot(userName);
		chatTwitter = new CTECTwitter(this);
		baseFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		myDisplay.displayText("Hello " + dumbBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String conversation = myDisplay.grabInput("What would you like to talk about today");
		while(dumbBot.lengthChecker(conversation))
		{
			conversation = myDisplay.grabInput(dumbBot.processConversation(conversation));
		}
	}
	
	private void shutDown()
	{
		myDisplay.displayText("Goodbye, " + dumbBot.getUserName() + ", it has been my pleasure to talk with you.");
		System.exit(0);
	}
	
	public void sendTweet(String tweetText)
	{
		chatTwitter.sendTweet(tweetText);
	}
	
	public void handleErrors(String errorMessage)
	{
		myDisplay.displayText(errorMessage);
	}

	public Chatbot getChatbot()
	{
		return dumbBot;
	}
	
	public ChatView getChatView()
	{
		return myDisplay;
	}
	
	public ChatFrame getBaseFrame()
	{
		return baseFrame;
	}
	
	public String userToChatbot(String content)
	{
		return content;
	}
}

