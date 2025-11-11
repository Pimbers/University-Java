public class Course {
    private String code;
    private String name;
    private int credits;
    private int capacity;
    private int enrolledStudents;

    public Course(String code, String name, int credits, int capacity, int enrolledStudents){
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.capacity = capacity;
        this.enrolledStudents = enrolledStudents;
    }

    public boolean enrollStudent(){
        if(enrolledStudents < capacity){
            enrolledStudents++;
            return true;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
        return false;
    }

    public String getCourseInfo(){
        return " Code: " + code + " Name: " + name + " Credits: " + credits + " Capacity: " + capacity + " Enrolled Students: " + enrolledStudents;
    }
}
