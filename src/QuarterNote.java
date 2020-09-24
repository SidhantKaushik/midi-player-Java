
public class QuarterNote extends Note{
private int key;
private int time;
	public QuarterNote(int key, int time) {
		super(key, time);
		this.key = key;
		this.time = time;
	}

public int getDuration()
{
	return 4;
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

@Override
public String toString() {
	String ab = "Quarter Note " + key;
	return ab;
}
}
