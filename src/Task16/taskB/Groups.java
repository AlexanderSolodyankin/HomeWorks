package Task16.taskB;

public class Groups {
    private int quantStudents;
    private Students[] unling = new Students[0];
    private String courses;
    private String dateStart;
    private int learns;

    public void setUnling(Students[] unit){
        unling = unit;
    }

    public Students[] getUnling() {
        return unling;
    }

    public void setCourses(String cour){
        courses = cour;
    }public String getCourses(){return courses;}

    public void setDateStart(String data){
        dateStart = data;
    }public String getDateStart(){return dateStart;}

    public void setLearns(int ler){
        learns = ler;
    }public int getLearns(){return learns;}

}
