package Lesson_04_OOP;

public class Mitarbeiter {
    // describe the attributes of Mitarbeiter
    private String name ;
    private double gehalt;
    private int alter;

    public Mitarbeiter(String name, double gehalt, int alter ){
        this.name= name;
        this.gehalt = gehalt;
        this.alter = alter;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getGehalt() {
        return gehalt;
    }
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
}
