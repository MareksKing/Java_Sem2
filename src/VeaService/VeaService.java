package VeaService;
import java.util.Random;

import model.Course;
import model.ProfDeg;
import model.Professor;

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
    }
}
