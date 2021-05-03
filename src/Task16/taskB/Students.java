package Task16.taskB;

public class Students {
    private String name;
    private String serName;
    private String patron;
    private boolean gender;
    private  String gen;
    private String dateBerth;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getSerName() {
        return serName;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getPatron() {
        return patron;
    }

    public void setGender(boolean woman) {
        gender = woman;
    }

    public String getGender() {
        if(gender){
            gen = "Мужской пол";
        }else {
            gen = "Женский пол";
        }
        return gen;
    }

    public void setDateBerth(String dateBerth) {
        this.dateBerth = patron;
    }

    public String getDateBerth() {
        return dateBerth;
    }


}
