
public class HalfNote extends Note{
private int time;
private int key;
	public HalfNote(int key, int time) {
		super(key, time);
		this.key = key;
		this.time = time;
	}

public int getDuration()
{
	return 8;
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
		String ab = "Half Note " + key;
		return ab;
	}

}
