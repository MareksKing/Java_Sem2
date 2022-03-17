package VeaService;
import java.util.Random;

import model.Course;
import model.Grade;
import model.ProfDeg;
import model.Professor;
import model.Student;

public class VeaService {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        
        Professor mareks = new Professor("Mareks", "Robalds", ProfDeg.bachelor);
        Professor karina = new Professor("Karina", "Šķirmante", ProfDeg.master);
        Professor vairis = new Professor("Vairis", "Caune", ProfDeg.doctor);
        System.out.println(mareks);
        System.out.println(karina);
        System.out.println(vairis);

        Course java = new Course("Programmēšana Tīmeklī JAVA 2022", karina, (byte)2);
        Course python = new Course("Python programmēšana", vairis, (byte) 2);
        Course matematika = new Course("Matemātiskā loģika", mareks, (byte) 2);
        
        System.out.println(java);
        System.out.println(python);
        System.out.println(matematika);

        Student stud1 = new Student("Vilnis", "Lībeks");
        Student stud2 = new Student("Emīls", "Šeflers");
        Student stud3 = new Student("Daniels", "Fišers");

        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);

        Grade gr1 = new Grade(4, stud1, java);
        Grade gr2 = new Grade(7, stud1, python);
        Grade gr3 = new Grade(9, stud1, matematika);

        Grade gr4 = new Grade(7, stud2, java);
        Grade gr5 = new Grade(9, stud2, python);
        Grade gr6 = new Grade(6, stud2, matematika);
        
        Grade gr7 = new Grade(8, stud3, java);
        Grade gr8 = new Grade(8, stud3, python);
        Grade gr9 = new Grade(7, stud3, matematika);
    }
}
