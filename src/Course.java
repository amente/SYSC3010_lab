import java.util.ArrayList;

public class Course
{
    private String id;
    private String name;
    private Professor professor;
    private ArrayList<Student>students;
    
    public Course( String id, String name)
    {
    	this.id = id;
    	this.name = name;
    	this.students = new ArrayList<Student>();
    }
    
    public String getId() { return id; }
    public String getName() { return name; }

    public String toString() { return "Course Name: " + name + "Course ID:" + id; }
    public boolean equals(Object o)
    {
    	return o instanceof Course && id.equals(((Course) o).getId()) && name.equals(((Course) o).getName());
    }

    public void setProfessor(Professor professor)
    {
    	this.professor = professor;
    }
    public Professor getProfessor()
    {
    	return professor;
    }

    public void addStudent( Student student )
    {
    	students.add(student);
    }
    public void removeStudent( Student student )
    {
    	students.remove(student);
    }
    public Student[] getStudents()
    {
    	return (Student[])students.toArray();
    }
}
