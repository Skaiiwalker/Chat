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
	}
}
