package model;

public class Person {
    //1.mainigie
    private String name, surname;
    
    //2.get funkcijas
     /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return String return the surname
     */
    public String getSurname() {
        return surname;
    }

    //3.set funkcijas
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if(name!=null && name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")){
            this.name = name;
        }
        else {
            this.name = "notknown";
        }
    }
    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        if(surname!=null && surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+[-]?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")){
            this.surname = surname;
        }
        else {
            this.surname = "notknown";
        }
    }

    //4.konstruktori
    public Person(){
        setName("Test");
        setSurname("Person");
    }

    public Person(String name, String surname){
        setName(name);
        setSurname(surname);
    }

    //5.toString()
    public String toString(){
        return name + " " + surname; 
    }
}
