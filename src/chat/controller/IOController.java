package chat.controller;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class IOController 
{
	public static String saveFile(String textToSave)
	{
		String fileName = "";
		fileName += ".txt";
		FileWriter chatWriter;
		try
		{
			chatWriter = new FileWriter(fileName);
			chatWriter.write("this is the " + fileName + "\n");
			chatWriter.write(textToSave);
			chatWriter.close();
			JOptionPane.showMessageDialog(null, "File saved as: " + fileName);
		}
		catch(IOException ioError)
		{
			JOptionPane.showMessageDialog(null, ioError.getMessage());
		}
		
		return fileName;
	}
	
	public static String reaTextFromFile(String fileName)
	{
		String text = "";
		File chatTextFile = new File(fileName);
		Scanner chatScanner;
		try
		{
			chatScanner = new Scanner (chatTextFile);
			while(chatScanner.hasNext())
			{
				text += chatScanner.nextLine();
			}
			chatScanner.close();
			JOptionPane.showMessageDialog(null, fileName + " was loaded to the chatArea");
		}
		catch (IOException ioError)
		{
			JOptionPane.showMessageDialog(null,  ioError.getMessage());
		}
		return text;
	}
}
