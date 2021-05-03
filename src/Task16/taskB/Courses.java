package Task16.taskB;

public class Courses {
    private String nameCours;
    private String dateCreat;
    private int idCourse;
    private String serNameDecan;
    private String nameDecan;
    private String patronDecan;

    public void setNameCours(String name) {
        nameCours = name;
    }

    public String getNameCours() {
        return nameCours;
    }

    public void setDateCreat(String date) {
        dateCreat = date;
    }

    public String getDateCreat() {
        return dateCreat;
    }

    public void setIdCourse(int id) {
        if (id <= 0) {
            System.err.println("Неверный номер курса!!!!");
        } else {
            idCourse = id;
        }
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setNameDecan(String nameDec) {
        this.nameDecan = nameDec;
    }

    public String getNameDecan() {
        return nameDecan;
    }

    public void setSerNameDecan(String serNameDecan) {
        this.serNameDecan = serNameDecan;
    }

    public String getSerNameDecan() {
        return serNameDecan;
    }

    public void setPatronDecan(String patronDecan) {
        this.patronDecan = patronDecan;
    }

    public String getPatronDecan() {
        return patronDecan;
    }
}
