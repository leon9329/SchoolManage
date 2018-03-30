
public class ProfessorDTO implements PersonDTO{
	private String id = "a";
	private String password = "a";
	private String name;
	private String sex;
	private String age;
	private String subject;
	
	ProfessorDTO() {

	}

	ProfessorDTO(String name, String sex, String age, String subject) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.subject = subject;

	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getID() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public String getAge() {
		return age;
	}

	public String getSubject() {
		return subject;
	}
	
	public String getId() {
		return id;
	}
}
