package model;

public class Student extends Person{
        //1.mainīgie
    private int id;
    
    private static int idCounter= 20000;

        //2.get funkcijas
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId() {
        this.id = idCounter;
        idCounter++;
    }


        //4.konstuktori

    public Student() {
        super();
        setId();
        //izsauks Personas bezargumenta konstruktoru
    } 
    public Student(String name, String surname) {
        super(name, surname);
        setId();
        //izsauks Personas argumenta konstruktoru
    }

    
    //5.toString()
    @Override
    public String toString() {
        return "Student [id=" + id + " " +super.toString()  + "]";
    } 
    
    
    
    

}
