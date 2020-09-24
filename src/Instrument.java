import java.io.FileNotFoundException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public abstract class Instrument {
	protected Sheet music;
	public abstract void loadMusic(Sheet music);
	public abstract void play() throws FileNotFoundException, MidiUnavailableException, InvalidMidiDataException;
	
	
}
