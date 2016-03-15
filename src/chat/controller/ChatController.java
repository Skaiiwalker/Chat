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
	private CTECTwitter myTwitter;
	
	public ChatController()
	{
		myTwitter = new CTECTwitter(this);
		myDisplay = new ChatView();
		String user = myDisplay.collectUserText("What is your name?");
		dumbBot = new Chatbot(user);
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
		myTwitter.sendTweet(tweetText);
	}
	
	public String analyze(String userName)
	{
		String userAnalysis = "The Twitter user " + userName + "has many tweets. " + myTwitter.topResults();
		
		return userAnalysis;
	}
	
	public void handleErrors(String error)
	{
		myDisplay.displayText(error);
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

