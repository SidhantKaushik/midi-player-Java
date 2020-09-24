import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

public class SheetTest {
private String ad = "test.music";
private File musicFile = new File(ad);

private Sheet ab;
	@Test
	public void testHasNotesAt() throws FileNotFoundException {
		ab = new Sheet(musicFile);
		Note ak = new QuarterNote(3, 5);
		ab.addNote(0, ak);
		boolean ar = ab.hasNotesAt(0);
		assertEquals("Testing to see if has note", true, ar);
	}
	@Test
	public void testLoadNotes() throws FileNotFoundException {
		ab = new Sheet(musicFile);
		ab.loadNotes();
		boolean ar = ab.hasNotesAt(3);
		assertEquals("Testing to see if has note", true, ar);
		
	}
	
	@Test
	public void testTextPrint() throws FileNotFoundException {
		ab = new Sheet(musicFile);
		ab.loadNotes();
		ab.textPrint();
		}
	@Test
	public void testGetNote() throws FileNotFoundException {
	ab = new Sheet(musicFile);
	Note ak = new QuarterNote(3, 5);
	ab.addNote(0, ak);
	assertEquals("testing to see if getNote works", ak.toString(), ab.getNote(0));
	}
}
