package Model;

public class skill {
	String name;
	int dmagevalue;
	
	public skill(String name, int dmagevalue) {
		this.name = name;
		this.dmagevalue = dmagevalue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDmagevalue() {
		return dmagevalue;
	}
	public void setDmagevalue(int dmagevalue) {
		this.dmagevalue = dmagevalue;
	}
	
	
}
