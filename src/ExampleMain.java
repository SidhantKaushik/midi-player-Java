import java.util.*;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.io.*;
public class ExampleMain {
	private Scanner kb = new Scanner(System.in);
	private String playerChoice;
	private File musicFile;
	private Sheet sheet;
	
	
	public void Starter() throws FileNotFoundException, IOException, MidiUnavailableException, InvalidMidiDataException
	{
		getFile();
		getChoice();
		play();
	}
	
	public void getFile() throws IOException {
		System.out.println("Please enter the files name: ");
		String ab = kb.next();
		ab = ab + ".music";
		musicFile = new File(ab);
		if (musicFile.exists()==true)
		{
			
		}
		else {
			System.out.println("Invalid input");
			System.out.println("Would you like to make the file?");
			String choicez = kb.next();
			if (choicez.toLowerCase().equals("yes"))
			{
				makeFile(ab);
			}
			else {
				getFile();
			}
		}
		sheet = new Sheet(musicFile);
	}
	
	public void makeFile(String ab) throws IOException
	{
		File ac = new File("ab.music");
		ac.createNewFile();
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public void getChoice()
	{
		System.out.println("Please enter what choice you wish to make: ");
		System.out.println("text, music or both");
		String choice = kb.next();
		if (choice.toLowerCase().equals("text"))
		{
			playerChoice = choice;
		}
		else if (choice.toLowerCase().equals("both"))
		{
			playerChoice = choice;
		}
		else if (choice.toLowerCase().equals("music"));
		{
			playerChoice = choice;
		}
		
	}
	
	
	public void play() throws MidiUnavailableException, InvalidMidiDataException, FileNotFoundException
	{
		if(playerChoice.equals("text"))
		{
		Instrument a = new TextPrintInstrument();
			a.loadMusic(sheet);
			a.play();
		}
		else if (playerChoice.equals("music")){
			Instrument a = new MIDIInstrument();
			a.loadMusic(sheet);
			a.play();
		}
		else if(playerChoice.equals("both"))
		{
			Instrument a = new MIDIInstrument();
			Instrument b = new TextPrintInstrument();
			a.loadMusic(sheet);
			a.play();
			b.loadMusic(sheet);
			b.play();
		}
	}
}

