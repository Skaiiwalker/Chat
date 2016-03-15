package chat.model;

import chat.controller.ChatController;
import twitter4j.*;
import java.util.ArrayList;
import java.util.List;


public class CTECTwitter 
{
	private ArrayList<String> tweetTexts;
	private ArrayList<Status> statuses;
	private Twitter chatbotTwitter;
	private ChatController baseController;
	
	public CTECTwitter(ChatController baseController)
	{
		this.baseController = baseController;
		this.statuses = new ArrayList<Status>();
		this.tweetTexts = new ArrayList<String>();
		this.chatbotTwitter = TwitterFactory.getSingleton();
		
	}
	
	public void sendTweet(String tweet)
	{
		try
		{
			chatbotTwitter.updateStatus("Luke jsut tweeted from my Java Chatbot " +
		"program!  #APCSRocks @CTECNow thanks @cscheerleader & @codyhenrichsen !");
		}
		catch(TwitterException error)
		{
			baseController.handleErrors(error.getErrorMessage());
		}
	}
	
	public String TopResults(List<String> wordList)
	{
		String results = "";
		return results;
	}
	
	public void loadTweets(String twitterHandle) throws TwitterException
	{
		Paging statusPage = new Paging(1, 200);
		int page = 1;
		while (page <= 10)
		{
			statusPage.setPage(page);
			statuses.addAll(chatbotTwitter.getUserTimeline(twitterHandle, statusPage));
			page++;
			
		}
		for(Status currentStatus : statuses)
		{
			String[] tweetText = currentStatus.getText().split(" ");
			for (String word : tweetText)
			{
				tweetTexts.add(removePunctuation(word).toLowerCase());
			}
		}
		removeCommonEnglishWords(tweetTexts);
		removeEmptyText();
		
		
	}

	private void removeEmptyText()
	{
		for (int spot = 0; spot < wordsList.size(); spot++)
		{
			if (wordsList.get(spot).equalts(""))
			{
				wordsList.remove(spot);
				spot--;
			}
		}
	}
	
	private List removeCommonEnglishWords(List<String> wordList)
	{
		String[] boringWords = importWordsToArray();
		
		for (int count = 0; count < wordList.size(); count++)
		{
			for (int removeSpot = 0; removeSpot < boringWords.length; removeSpot++)
			{
				if (wordsList.get(count).equalsIgnoreCase(boringWords[removeSpot]))
				{
					wordsList.remove(count);
					count--;
					removeSpot = boringWords.length;
				}
			}
		}
	}
	
	private String[] importWordsToArray()
	{
		return null;
	}
	
	private void removeTwitterUsernamesFromList(List<String> wordList)
	{
		
	}
	
	private String removePunctuation(String currentString)
	{
		return null;
	}
	
	public String sampleInvestigation()
	{
		return null;
	}
}
