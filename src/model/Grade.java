package model;

public class Grade {
    //1.mainīgie
    private int id;
    private int gradeValue;
    private Student student;
    private Course course;

    private static int idCounter = 50000;

    //2.get funkcijas

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return Course return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @return int return the gradeValue
     */
    public int getGradeValue() {
        return gradeValue;
    }

  
    /**
     * @return Student return the student
     */
    public Student getStudent() {
        return student;
    }

    //3.set funkcijas
    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        if(student != null){
            this.student = student;
        } else {
            this.student = new Student();
        }
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        if(course != null){
            this.course = course;
        } else {
            this.course = new Course();
        }
    
    }

    /**
     * @param id the id to set
     */
    public void setId() {
        this.id = idCounter++;
    }

    /**
     * @param gradeValue the gradeValue to set
     */
    public void setGradeValue(int gradeValue) {
        if(gradeValue > 0 && gradeValue <= 10){
            this.gradeValue = gradeValue;
        }
        else if (gradeValue > 10){
            this.gradeValue = 10;
        } else{
            this.gradeValue = 1;
        }
    }

    
    //4.konstruktori
    
    public Grade(int gradeValue, Student student, Course course) {
        setId();
        setGradeValue(gradeValue);
        setStudent(student);
        setCourse(course);
    }
    public Grade(){
        setId();
        setCourse(course);
    }
}
