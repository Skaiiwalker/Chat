package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatView;

/**
 * Application controller for the Chatbot project.
 * @author Luke Barrowes
 *@version 1.1.1 10/21/15 fixed error :D
 */
public class ChatController
{
	public Chatbot dumbBot;
	private ChatView myDisplay;
	
	public ChatController()
	{
		myDisplay = new ChatView();
		String userName = myDisplay.grabInput("What is your name?");
		dumbBot = new Chatbot(userName);
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
			if(dumbBot.contentChecker(conversation))
			{
				myDisplay.displayText("wow, I had no idea you are interested in " + dumbBot.getContent());
			}
			conversation = myDisplay.grabInput(conversation);
		}
	}
	
	private void shutDown()
	{
		
	}
}
