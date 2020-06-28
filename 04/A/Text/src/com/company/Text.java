package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Text {
    Scanner scanner=new Scanner(System.in);
    int numberOfSentences;
    String header;
    Sentence[] sentences;
    Text(){
        System.out.print("Header: ");
        header=scanner.nextLine();
        System.out.print("Number of sentences: ");
        try{
            numberOfSentences=scanner.nextInt();
            if(numberOfSentences<=0) throw new IllegalArgumentException();
            sentences=new Sentence[numberOfSentences];
            for(int i=0;i<numberOfSentences;i++){
                sentences[i]=new Sentence();
            }
        }catch (InputMismatchException e){
            System.err.println(e);
        }
    }
    void show(){
        System.out.println("\t\t"+header);
        for(int i=0;i<numberOfSentences;i++){
            for(int j=0;j<sentences[i].numberOfWords;j++){
                System.out.print(" "+sentences[i].words[j]);
            }
            System.out.print(".");
        }
        System.out.println();
    }
    String getHeader(){
        return header;
    }
    void addSentence(){
        Sentence sentence=new Sentence();
        Sentence[] sentences=new Sentence[numberOfSentences];
        for(int i=0;i<numberOfSentences;i++)
            sentences[i]=this.sentences[i];
        numberOfSentences++;
        this.sentences=new Sentence[numberOfSentences];
        for(int i=0;i<numberOfSentences-1;i++){
            this.sentences[i]=sentences[i];
        }
        this.sentences[numberOfSentences-1]=sentence;
    }
}
