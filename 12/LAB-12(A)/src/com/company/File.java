package com.company;

import java.util.ArrayList;

public class File {
    String name;
    String parentDirectory;
    String allDirectory;
    int size;
    File(String name,String parentDirectory,int size){
        this.name=name;
        this.parentDirectory=parentDirectory;
        this.size=size;
    }
    void setAllDirectory(ArrayList<Directory> directories){
        allDirectory=null;
        for(Directory directory:directories){
            if(directory.name.equals(this.parentDirectory)){
                allDirectory=directory.allDirectory+"\\"+name;
                break;
            }
        }
    }
}
