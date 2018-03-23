//Student DTO
public class StudentDTO {
	private String classOf; // �й�
	private String name; // �̸�
	private String sex; // ����
	private String age; // ����
	private String privateCourse; // �����ϴ� ����
	
	StudentDTO(){};
	
	StudentDTO(String classOf, String name, String sex, String age, String privateCourse) {
		this.classOf = classOf;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.privateCourse = privateCourse;

	}
	
	

	public void setClassOf(String classOf) {
		this.classOf = classOf;
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

	public void setPrivateCourse(String privateCourse) {
		this.privateCourse = privateCourse;
	}

	public String getClassOf() {
		return classOf;
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

	public String getPrivateCouse() {
		return privateCourse;
	}
}
