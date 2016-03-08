package chat.model;

import chat.controller.ChatController;
import twitter4j.*;
import java.awt.List;


public class CTECTwitter 
{
	private Twitter chatbotTwitter;
	private List<Status> status;
	private List<String> tweetTexts;
	private ChatController baseController;
	
	public CTECTwitter(ChatController baseController)
	{
		this.baseController = baseController;
		chatbotTwitter = TwitterFactory.getSingleton();
		statuses = newArrayList<Status>();
		tweetTexts = new ArrayList<String>();
		
	}
	
	public void sendTweet(String tweet)
	{
		try
		{
			chatbotTwitter.updateStatus("");
		}
		catch(TwitterException error)
		{
			baseController.handleErrors(error.getErrorMessage());
		}
	}
	
	public String topResults(List<String> List)//not quite right.  Check Cody's code
	{
		
	}
	
}
