package myproject.hellobean.beans;

public class HelloBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello "+name+"!";
	}
	
	
}
