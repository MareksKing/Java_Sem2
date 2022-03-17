package model;

public class Course {
        //1.mainīgie
    private int id;
    private String title;
    private byte creditPoints;
    private Professor professor;

    private static int idCounter = 10000;

    //2.get funkcijas
    
    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }
   
    /**
     * @return byte return the creditPoints
     */
    public byte getCreditPoints() {
        return creditPoints;
    }
  
    /**
     * @return Professor return the professor
     */
    public Professor getProfessor() {
        return professor;
    }


        //3.set funkcijas
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        if(title!=null && title.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[\\s\\da-zēūīļķģšāžčņA-ZĒŪĪĀŠĢĶĻŅČŽ]+")){
            this.title = title;
        } else {
            this.title = "unknown";
        }

    }
    
    /**
     * @param creditPoints the creditPoints to set
     */
    public void setCreditPoints(byte creditPoints) {
        if(creditPoints>0 && creditPoints <= 20){
            this.creditPoints = creditPoints;
        } else {
            this.creditPoints = 2;
        }

    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        if(professor != null){
            this.professor = professor;
        } else {
            this.professor = new Professor();
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
    public Course(){
        setId();
        setTitle("Tests");
        setProfessor(new Professor());
        setCreditPoints((byte)2);
    }

    public Course(String title, Professor professor, byte creditPoints){
        setId();
        setTitle(title);
        setProfessor(professor);
        setCreditPoints(creditPoints);
    }

    @Override
    public String toString() {
        return "Course [CreditPoints=" + creditPoints + ", ID=" + id + ", Professor=" + professor + ", Title=" + title
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        Course otherCourse = (Course) obj;
        if(title.equals(otherCourse.getTitle()) && creditPoints == otherCourse.getCreditPoints()){
            return true;
        }else{
            return false;
        }
    }

    


    


}

