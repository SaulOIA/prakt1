package prakt1;

public class ControlDeveloper {
	
	private String name =new String("Control-Developer");
	
	public String getname(){
		return name;
	}
	
	public void setname(String actname) {
		name=actname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlDeveloper a=new ControlDeveloper();
		
		System.out.println(a.name);
		System.out.println(a.getname());

	}

}
