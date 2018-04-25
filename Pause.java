package prakt1;

public class Pause extends Command{
private double duration;
public void setDuration(double actduration) {
	duration=actduration;
}

public double getDuration() {
	return duration;
}
public String toString() {
	return getname();
}
}
