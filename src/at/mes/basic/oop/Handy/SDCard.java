package at.mes.basic.oop.Handy;

import java.util.ArrayList;

public class SDCard {
    private double capacity;
    private ArrayList<Phonefile> files;

    public SDCard(double capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public void saveFile(Phonefile file){
        if(capacity < 0) {
            System.out.println("Du hast keinen Speicherplatz mehr.");
        } else{
            files.add(file);
        }
    }

    public double getFreeSpace(){
        double size = 0;

        for (Phonefile file: files) {
            size += file.getSize();
        }
        return capacity - size;
    }

    public void getAllFiles(){
        for (Phonefile file: files) {
            int i = 0;
            i += 1;
            System.out.println(i + ". Bild: " + file.getName() + "." + file.getExtension());
        }
    }

    public void addFile(Phonefile file){
        this.files.add(file);
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Phonefile> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<Phonefile> files) {
        this.files = files;
    }
}
