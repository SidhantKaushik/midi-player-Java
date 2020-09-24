
public class WholeNote extends Note {
private int key;
private int time;
	
public WholeNote(int key, int time) {
		super(key, time);
		this.key = key;
		this.time = time;
	}

public int getDuration()
{
	return 16;
}

@Override
public int getKey() {
	return key;
}
@Override
public int getTime()
{
	return time;
}
public String toString() {
	String ab = "Whole Note " + key;
	return ab;
}
}
