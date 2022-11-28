package com.company;

import java.io.File;
import java.io.FileWriter;

public class SaveAsThread extends Thread{

    private String[] stringArray;
    private File file;

    public SaveAsThread(String[] stringArray, File file){
        this.stringArray = stringArray;
        this.file = file;
    }

    @Override
    public void run(){
        super.run();
        synchronized (file) {
            try(FileWriter writer = new FileWriter("array.txt", false)){
                for (String symbol :
                        stringArray) {
                    writer.append(symbol);
                    writer.append(" ");
                }
                writer.append("\n");
                writer.flush();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
