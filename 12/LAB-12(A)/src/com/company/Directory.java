package com.company;

import java.util.ArrayList;

public class Directory {
    String name;
    String parentDirectory;
    String allDirectory;

    Directory(String name, String parentDirectory) {
        this.name = name;
        this.parentDirectory = parentDirectory;
    }
    void setAllDirectory(ArrayList<Directory> directories){
        allDirectory=null;
        for(Directory directory:directories){
            if(parentDirectory.equals("")){
                allDirectory=name;
                break;
            }
            if(directory.name.equals(this.parentDirectory)){
                allDirectory=directory.allDirectory+"\\"+name;
                break;
            }
        }
    }
}
