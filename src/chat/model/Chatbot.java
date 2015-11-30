package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Luke Barrowes
 * @version 1.2 10/23/15 Completed the lengthChecker method.  Fixed the Constructor and getter for the userName.
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.content = "fudge";
		
		buildMemesList();
		buildPoliticalTopicsList();
	}
	
	private void buildMemesList()
	{
		this.memesList.add("cute animals");
		this.memesList.add("doge");
		this.memesList.add("aliens");
		this.memesList.add("What if I told you");
		this.memesList.add("fire nation");
		this.memesList.add("John Cena");
	}
	
	private void buildPoliticalTopicsList()
	{
		
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null)
		{
			if(currentInput.length() >= 1)
			{
				hasLength = true;
			}
		}
		
		if(currentInput != null && currentInput.length() > 0)
		{
			
		}
		
		return hasLength;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.contains(content))
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		return false;
	}
	
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		//for(memesList.size())
		{
			
		}
		
		
		
		return hasMeme;
	}
	
	public String processConversation(String currentInput)
	{
		String nextConversation = "";
		int randomTopic = (int) (Math.random() * 6); 
		//generates a random number between zero and four.
		//It makes the conversation topic random, though the conversation should be controlled by the user.
		
		switch (randomTopic)
		{
			case 0:
				if(memeChecker(currentInput))
				{
					nextConversation = "That is a very popular meme this year.  What else do you want to talk about?";
				}
				else
				{
					nextConversation = "Uh huh, and I'm a little teapot, bub.  (memes)";
				}
				break;
			case 1:
				if(politicalTopicChecker(currentInput))
				{
					nextConversation = "I hate politics.  Can we talk about something else?";
				}
				else
				{
					nextConversation = "Uh huh, and I'm a little teapot, buddy.  (politics)";
				}
				break;
			case 2:
				if(contentChecker(currentInput))
				{
					nextConversation = "uh huh.  So what things do you like to do in your free time?";
				}
				else
				{
					nextConversation = "Uh huh, and I'm a little teapot, buster.  (content, free time)";
				}
				break;
			case 3:
				if(currentInput.length() > 20)
				{
					nextConversation = "Holy cow, what just happened?  Are you ok?  Who are you?  I don't remember anything!";
				}
				else
				{
					nextConversation = "Uh huh, and I'm a little teapot, butter buns.  (length, amnesia)";
				}
				break;
			case 4:
				nextConversation = "All I hear is yak, yak, yak.  Talk about something else.  ;)";
				break;
			case 5:
				nextConversation = "There's a sale happening in my bedroom.  All clothes are 100% off.  ;)";
				break;
			default:
				nextConversation = "I'm a little teapot, short and stout.  Here is my handle, here is my... Wait.  Why don't I have arms?";
				break;
			
		}
		
		return nextConversation;
	}
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return null;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		
	}
	
	
}