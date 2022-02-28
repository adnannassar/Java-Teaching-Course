package Aufgabe3;

public class SMS {
    private int empfangerId;
    private String text;

    public SMS(int empfangerId, String text) {
        this.empfangerId = empfangerId;
        this.text = text;
    }

    public int getEmpfangerId() {
        return empfangerId;
    }

    public String getText() {
        return text;
    }
}
