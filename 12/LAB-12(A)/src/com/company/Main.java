package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        try {
            String sql = "SELECT name, parentDirectory FROM directory.directory";
            ResultSet resultSet = dataBase.statement.executeQuery(sql);
            ArrayList<Directory> directories = new ArrayList<>();
            while (resultSet.next()) {
                directories.add(new Directory(resultSet.getString(1),
                        resultSet.getString(2)));
            }
            sql = "SELECT name, parentDirectory, size FROM directory.file";
            resultSet = dataBase.statement.executeQuery(sql);
            ArrayList<File> files = new ArrayList<>();
            while (resultSet.next()) {
                files.add(new File(resultSet.getString(1),
                        resultSet.getString(2), resultSet.getInt(3)));
            }
            System.out.println("\nDirectories: ");
            for (Directory directory : directories) {
                directory.setAllDirectory(directories);
                System.out.println(directory.allDirectory);
            }
            System.out.println("\nFiles: ");
            for (File file : files) {
                file.setAllDirectory(directories);
                System.out.println(file.allDirectory);
            }
            System.out.println("\nNumber of Files: ");
            for (Directory directory : directories) {
                int number = 0;
                for (File file : files) {
                    if (file.allDirectory.contains(directory.name)) {
                        number++;
                    }
                }
                System.out.println(directory.name + " has " + number + " files");
            }
            System.out.println("\nSize of Directory: ");
            for (Directory directory : directories) {
                int size = 0;
                for (File file : files) {
                    if (file.allDirectory.contains(directory.name)) {
                        size+=file.size;
                    }
                }
                System.out.println(directory.name + " takes " + size + " mb");
            }
            System.out.println("\nTransfer subDirectory3 to directory2: ");
            directories.get(5).parentDirectory=directories.get(2).name;
            System.out.println("\nDirectories: ");
            for (Directory directory : directories) {
                directory.setAllDirectory(directories);
                System.out.println(directory.allDirectory);
            }
            System.out.println("\nFiles: ");
            for (File file : files) {
                file.setAllDirectory(directories);
                System.out.println(file.allDirectory);
            }
            System.out.println("\nRemove directory1: ");
            directories.remove(1);
            for(int i=0;i<directories.size();i++){
                directories.get(i).setAllDirectory(directories);
                if(directories.get(i).allDirectory==null){
                    directories.remove(i);
                    i--;
                }
            }

            for(int i=0;i<files.size();i++){
                files.get(i).setAllDirectory(directories);
                if(files.get(i).allDirectory==null){
                    files.remove(i);
                    i--;
                }
            }
            System.out.println("\nDirectories:");
            for(Directory directory:directories){
                System.out.println(directory.allDirectory);
            }
            System.out.println("\nFiles:");
            for(File file:files){
                System.out.println(file.allDirectory);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
