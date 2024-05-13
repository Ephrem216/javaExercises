package thinkingInObjects;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[100];
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudents(String student){
        for(int i =0; i < numberOfStudents; i++){
            if(students[i].equals(student)){
                for(int j = i; j < numberOfStudents; j++){
                    students[j] = students[j + 1];
                }
                numberOfStudents--;
            }
        }
    }

    public void print(){
        for(int i = 0; i < numberOfStudents; i++){
            System.out.println(students[i]);
        }
    }
}
