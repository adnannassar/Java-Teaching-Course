package AdvancedKurs.PK_Klausuren.Klausur_31_08_2021.Aufgabe_1;

import java.io.*;
import java.util.List;

public class SerialDAO implements IDao {
    private String dateiName;

    public SerialDAO(String dateiName) {
        this.dateiName = dateiName;
    }

    @Override
    public void speichern(List<Medium> list) throws PersistenzException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(dateiName))) {
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Medium> laden() throws PersistenzException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(dateiName))) {
            return (List<Medium>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
