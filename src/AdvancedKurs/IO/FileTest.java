package AdvancedKurs.IO;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File from = new File("/Users/nassar/Desktop/Test/Vorlesungen/message.txt");
        String fullName = from.getName();
        String nameWithoutExtension = fullName.substring(0, fullName.lastIndexOf('.'));
        String extension = fullName.substring(fullName.indexOf('.'), fullName.length());

        String toName = nameWithoutExtension + " copy" + extension;
        File to = new File("/Users/nassar/Desktop/Test/Vorlesungen/" + toName);
        StopWatch stopWatch = new StopWatch();


        stopWatch.start();
        copyByteByByte(from, to);
        stopWatch.stop();
        System.out.println("Copy Byte By Byte hat " + stopWatch.getDuration() / 1000 + " milli Sekunden gedauert");

        System.out.println();

        stopWatch.start();
        copyByBuffer(from, to);
        stopWatch.stop();
        System.out.println("Copy By Buffer " + stopWatch.getDuration() / 1000 + " milli Sekunden gedauert");

        System.out.println();

        stopWatch.start();
        copyByBufferReaderAndWriter(from, to);
        stopWatch.stop();
        System.out.println("Copy Byte Buffer Reader " + stopWatch.getDuration() / 1000 + " milli Sekunden gedauert");

        System.out.println();
        Student student = new Student("Student 1", 1.3f);
        File f = new File("/Users/nassar/Desktop/Test/StudentInfo.txt");
        writeStudentIfoInFile(student, f);

    }

    private static void copyByteByByte(File from, File to) {
        try (FileInputStream fis = new FileInputStream(from);
             FileOutputStream fos = new FileOutputStream(to)) {
            int letter;
            while ((letter = fis.read()) != -1) {
                fos.write(letter);
            }
            System.out.println("Date wurde kopiert!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void copyByBuffer(File from, File to) {
        try {
            FileInputStream fis = new FileInputStream(from);
            FileOutputStream fos = new FileOutputStream(to);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int letter;
            while ((letter = bis.read()) != -1) {
                bos.write(letter);
            }
            fis.close();
            fos.close();
            System.out.println("Date wurde kopiert!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void copyByBufferReaderAndWriter(File from, File to) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(from));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to));

            int letter;
            while ((letter = bufferedReader.read()) != -1) {
                bufferedWriter.write(letter);
            }
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Date wurde kopiert!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void writeStudentIfoInFile(Student student, File f) {
        try {
            FileWriter fileWriter = new FileWriter(f);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("Name: %s\nNote: %s", student.name, student.note);
            System.out.println("Student info wurden in file geschrieben");
            fileWriter.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Student {
    String name;
    float note;

    public Student(String name, float note) {
        this.name = name;
        this.note = note;
    }
}
