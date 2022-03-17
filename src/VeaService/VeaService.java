package VeaService;

import java.util.ArrayList;


import model.Course;
import model.Grade;
import model.Person;
import model.ProfDeg;
import model.Professor;
import model.Student;

public class VeaService {
    private static ArrayList<Professor> allProfs = new ArrayList<Professor>();
    private static ArrayList<Student> allStudents = new ArrayList<Student>();
    private static ArrayList<Course> allCourses = new ArrayList<Course>();
    private static ArrayList<Grade> allGrades = new ArrayList<Grade>();
    private static ArrayList<Person> allPersons = new ArrayList<Person>();
    public static void main(String[] args) throws Exception {
        
        Professor prof1 = new Professor("Mareks", "Robalds", ProfDeg.bachelor);
        Professor prof2 = new Professor("Karina", "Šķirmante", ProfDeg.master);
        Professor prof3 = new Professor("Vairis", "Caune", ProfDeg.doctor);
        allPersons.add(prof1);
        allPersons.add(prof2);
        allPersons.add(prof3);
        // for (Professor prof : allProfs) {
        //     System.out.println(prof);
        // }

        Course c1 = new Course("Programmēšana Tīmeklī JAVA 2022", prof2, (byte)2);
        Course c2 = new Course("Python programmēšana", prof3, (byte) 2);
        Course c3 = new Course("Matemātiskā loģika", prof1, (byte) 2);
        allCourses.add(c1);
        allCourses.add(c2);
        allCourses.add(c3);
        for (Course c : allCourses) {
            System.out.println(c);
        }
        Student stud1 = new Student("Vilnis", "Lībeks");
        Student stud2 = new Student("Emīls", "Šeflers");
        Student stud3 = new Student("Daniels", "Fišers");
        allPersons.add(stud1);
        allPersons.add(stud2);
        allPersons.add(stud3);
        // for(Student stud : allStudents){
        //     System.out.println(stud);
        // }
        Grade gr1 = new Grade(4, stud1, c1);
        Grade gr2 = new Grade(7, stud1, c2);
        Grade gr3 = new Grade(9, stud1, c3);

        Grade gr4 = new Grade(7, stud2, c1);
        Grade gr5 = new Grade(9, stud2, c2);
        Grade gr6 = new Grade(6, stud2, c3);
        
        Grade gr7 = new Grade(8, stud3, c1);
        Grade gr8 = new Grade(8, stud3, c2);
        Grade gr9 = new Grade(7, stud3, c3);
        allGrades.add(gr1);
        allGrades.add(gr2);
        allGrades.add(gr3);

        allGrades.add(gr4);
        allGrades.add(gr5);
        allGrades.add(gr6);
        
        allGrades.add(gr7);
        allGrades.add(gr8);
        allGrades.add(gr9);
        for(Grade gr : allGrades){
            System.out.println(gr);
        }

        Person p = new Person("Kalvis", "Kalns");
        allPersons.add(p);
        Student stud4 = new Student("Pēteris", "Lielais");
        allPersons.add(stud4);
        for (Person person : allPersons) {
            System.out.println(person);
        }

        for (Person person : allPersons) {
            if(person instanceof Professor){
                Professor prof = (Professor) person;
                System.out.println(prof.getDegree());
            }
        }
    }

    //CRUD  -  Create, Read, Update, Delete
    //C  -  Create
    private static boolean addNewCourse(String title, Professor professor, byte creditPoints){
        Course course = new Course(title, professor, creditPoints);
        if(allCourses.contains(course)){
            return false;
        } else {
            allCourses.add(course);
            return true;
        }
    }

    //R  -  Read
    private static Course readCourseById(int courseId){
        if(courseId >= 10000 && courseId <= 20000){
            for (Course course : allCourses) {
                if(course.getId() == courseId){
                    return course;
                }
            }
        }
        return new Course();
    }

    //U  -  Update
    private static boolean updateCourseById(int courseId, byte updateCp, Professor updateProfessor){
        if(courseId >= 10000 && courseId <= 20000){
            for (Course course : allCourses) {
                if(course.getId() == courseId){
                    course.setCreditPoints(updateCp);
                    course.setProfessor(updateProfessor);
                    return true;
                }
            }
        }
        return false;
    }

    //D  -  Delete
    private static boolean deleteCourseById(int courseId){
        if(courseId >= 10000 && courseId <= 20000){
            for (Course course : allCourses) {
                if(course.getId() == courseId){
                    allCourses.remove(course);
                    return true;
                }
            }
        }
        return false;
    }
}
