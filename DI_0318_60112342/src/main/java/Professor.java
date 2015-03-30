
public class Professor {
	private String name;
	private Lecture lecture;
	private Student student;
	
	public Professor(){
		
	}
	public Professor(String name){
		this.name = name;
	}

	public String getProfessorName() {
		return name;
	}

	public void setProfessorName(String name) {
		this.name = name;
	}
	public void addLecture(Lecture lecture) {
		// TODO Auto-generated method stub
		this.lecture = lecture;
		
	}
	public void showLecture() {
		System.out.println("강의는 " + lecture.getName() + "교수님은 " +Professor.class.getName() + "학생은 "+ student.getName()+"학번은 " + student.getNumber());
		// TODO Auto-generated method stub
		
		
	}
	

}
