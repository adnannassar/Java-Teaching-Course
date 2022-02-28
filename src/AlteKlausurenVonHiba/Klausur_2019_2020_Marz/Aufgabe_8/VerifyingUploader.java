package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_8;

public class VerifyingUploader extends Uploader {
    private UploadVerifier uploadVerifier;

    public VerifyingUploader(UploadVerifier uploadVerifier) {
        this.uploadVerifier = uploadVerifier;
    }

    @Override
    public boolean upload(Uploadable uploadable) {
        if (uploadVerifier.isValid(uploadable)) {
            return super.upload(uploadable);
        } else {
            return false;
        }
    }
}
