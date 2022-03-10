package model;

public class Professor {
        /**
         * 1.mainigie
         * 2.get funkcijas
         * 3.set funkcijas
         * 4.konstruktori
         * 5.toString funkcija
         * 6.parejas funkcijas
         */

        //1. mainigie
    private String name, surname;
    private ProfDeg degree;

        //2.get funkcijas   
    public String getName(){
        return name;
    }

    public String getSurame(){
        return surname;
    }

    public ProfDeg getDegree(){
        return degree;
    }

        //3.set funkcijas
    /**
     * @param name, the name to set
     */
    public void setName(String name) {
        if(name != null && name.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ])")){
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
        if(surname != null && surname.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+[-]?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ])")){
            this.surname = surname;
        }
        else {
            this.surname = "notknown";
        }
        
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(ProfDeg degree) {
        if(degree != null){
            this.degree = degree;
        }
        else {
            this.degree = ProfDeg.master;
        }
    }

        //4.konstruktori
    public Professor(){
        setName("Test");
        setSurname("Professor");
        setDegree(ProfDeg.master);
    }

    public Professor(String name, String surname, ProfDeg degree){
        setName(name);
        setSurname(surname);
        setDegree(degree);
    }

        //5.toString funkcija
    public String toString(){
        return name + " " + surname + " " + degree;
    }

    

    

}
