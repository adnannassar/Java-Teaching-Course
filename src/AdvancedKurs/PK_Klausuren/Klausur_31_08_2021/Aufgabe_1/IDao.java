package AdvancedKurs.PK_Klausuren.Klausur_31_08_2021.Aufgabe_1;

import java.util.List;

public interface IDao {
    void speichern(List<Medium> list) throws PersistenzException;

    List<Medium> laden() throws PersistenzException;


}
