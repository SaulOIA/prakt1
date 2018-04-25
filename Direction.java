package prakt1;

public class Direction extends Command{
	private int degree;
	
	public void setDegree(int actdegree) {
		degree=actdegree;
	}
	public int getDegree() {
		return degree;
	
	}
public String toString() {
	return "the degree is "+degree;
}

}
