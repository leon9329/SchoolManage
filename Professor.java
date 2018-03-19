
public class Professor {
	private String name;
	private String sex;
	private int age;
	private String subject;
	
	Professor(String name, String sex, int age, String subject){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.subject = subject;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSubject() {
		return subject;
	}

}
