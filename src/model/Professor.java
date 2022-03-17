package model;

public class Professor extends Person{
        /**
         * 1.mainigie
         * 2.get funkcijas
         * 3.set funkcijas
         * 4.konstruktori
         * 5.toString funkcija
         * 6.parejas funkcijas
         */
        
        //1. mainigie
        private int id;
        private ProfDeg degree;
        
        private static int idCounter = 0;
        
        
        
        //2.get funkcijas   
        
        public ProfDeg getDegree(){
            return degree;
        }
        /**
         * @return int return the id
         */
        public int getId() {
            return id;
        }
        
        
        //3.set funkcijas
        
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
        
        /**
         * @param id the id to set
         */
        public void setId() {
            this.id = idCounter;
            idCounter++;
        }

    //4.konstruktori
    public Professor(){
        super();
        setId();
        //izsauks Personas bezargumenta konstruktoru
        setDegree(ProfDeg.master);
    }

    public Professor(String name, String surname, ProfDeg degree){
        super(name, surname);
        setId();
        //izsauks Personas argumenta konstruktoru
        setDegree(degree);
    }

        //5.toString funkcija
    public String toString(){
        return id + " " +super.toString() + " " + degree;
    }

    

    


}
