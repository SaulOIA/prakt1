package prakt1;

public class Gear extends Command {
	private int speed;
	private double duration;
	
	public void setSpeed(int actspeed) {
		speed=actspeed;
	}
	public int getSpeed() {
		return speed;
	}
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
