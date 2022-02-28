package AlteKlausurenVonHiba.aufgabe6;

public class ElectronicBook  extends  Book{
    private double fileSize;


    public ElectronicBook(String author, String titel,double fileSize ) {
        super(author, titel);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", FileSize: " + fileSize;
    }
}
