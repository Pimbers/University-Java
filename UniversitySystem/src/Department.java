import java.util.ArrayList;

public class Department {
    private String name;
    private String building;
    ArrayList<Course> courses;

    public Department(String name, String building){
        this.name = name;
        this.building = building;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public int getCourseCount(){
        return courses.size();
    }

    public void displayCourses(){
        for(Course course : courses){
            System.out.println(course.getCourseInfo());
        }
    }
}
