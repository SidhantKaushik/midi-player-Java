import java.io.FileNotFoundException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class MIDIInstrument extends Instrument{
	private Sheet music;
	@Override
	public void loadMusic(Sheet music) {
		this.music = music;
		
	}

	@Override
	public void play() throws MidiUnavailableException, InvalidMidiDataException, FileNotFoundException {
		music.loadNotes();
		music.musicPlayer();
		
	}

}
