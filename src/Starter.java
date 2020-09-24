import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Starter {
//starts up the program and gets the main class running
	public static void main(String[] args) throws FileNotFoundException, IOException, MidiUnavailableException, InvalidMidiDataException {
		ExampleMain run = new ExampleMain();
		run.Starter();
	}

}
