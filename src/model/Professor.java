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

    /**
     * @return String name, return the surname
     */
    public void setName(String name) {
        if(name.matches("")){
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
        this.surname = surname;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(ProfDeg degree) {
        this.degree = degree;
    }

}
