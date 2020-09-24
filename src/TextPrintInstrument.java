import java.io.FileNotFoundException;

public class TextPrintInstrument extends Instrument{
	private Sheet music;
	
	@Override
	public void play() throws FileNotFoundException {
		music.loadNotes();
		music.textPrint();
	}

	@Override
	public void loadMusic(Sheet music) {
		// TODO Auto-generated method stub
			this.music = music;
	}

}
