import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Sheet {
	private Map<Integer, Object> ab = new HashMap<Integer, Object>();
	private Scanner kb;
	private int time;
	private String type;
	private int note;
	private Note notes = null;
	private Map<Integer, Object> ab1 = new HashMap<Integer, Object>();
	private File musicFile;	
	private List<Integer> noteTracker = new ArrayList<>();
	private List<Integer> timeTracker = new ArrayList<>();
	private List<Integer> lengthTracker = new ArrayList<>();
	public Sheet(File musicFile) throws FileNotFoundException
	{
		this.musicFile = musicFile;
		
	}
	public File getMusicFile()
	{
		return musicFile;
	}
		@SuppressWarnings("unlikely-arg-type")
		//loads the notes that are passed from the music file and puts them in their respective
		//arraylists and variables
		public void loadNotes() throws FileNotFoundException{
		kb= new Scanner(musicFile);
		while (kb.hasNextLine()) {
		time = kb.nextInt();
		timeTracker.add(time);
		type = kb.next();
		note = kb.nextInt();
		if (type.toLowerCase().equals("q"))
		{
			notes = new QuarterNote(note, time);
			lengthTracker.add(4);
		}
		
		else if(type.toLowerCase().equals("w")) {
			notes = new WholeNote(note, time);
			lengthTracker.add(16);
		}
		else if(type.toLowerCase().equals("h"))
		{
			notes = new HalfNote(note, time);
			lengthTracker.add(8);
		}
		noteTracker.add(note);
		addNote(time, notes);
		}
	}
	//takes a Note and time and inputs it into the map
	public void addNote(int time, Note note)
	{
		ab.put(time, note);
	}
	//returns the note for the text
	public String getNote(int time) {
		return ab.get(time).toString();
	}
	//returns if the time has a note at it or not
	public boolean hasNotesAt(int time)
	{
		if(ab.get(time).equals(""))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	//prints out the music as text
	public void textPrint() {
	for(int i = 0; i<timeTracker.size(); i++) {
		int nextTime= timeTracker.get(i);
		System.out.println(getNote(nextTime));
	}
	}
	//plays music out
	public void musicPlayer() throws MidiUnavailableException, InvalidMidiDataException {
		MIDISequencePlayer play = new MIDISequencePlayer(10,100);
		System.out.println("Playing Music");
		for(int i = 0; i<timeTracker.size(); i++) {;
			play.addNote(noteTracker.get(i), 100, timeTracker.get(i), lengthTracker.get(i));
		}
		play.play();
	}
}
	
