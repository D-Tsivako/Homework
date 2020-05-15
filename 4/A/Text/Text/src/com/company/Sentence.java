package com.company;

import java.util.*;

public class Sentence {
    Scanner scanner = new Scanner(System.in);
    int numberOfWords;
    Word[] words;

    Sentence() {
        System.out.print("Number of words: ");
        try {
            numberOfWords = scanner.nextInt();
            if (numberOfWords <= 0) throw new IllegalArgumentException();
            words=new Word[numberOfWords];
            for(int i=0;i<numberOfWords;i++){
                words[i]=new Word();
            }
        }catch (InputMismatchException e){
            System.err.println(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sentence)) return false;
        Sentence sentence = (Sentence) o;
        return numberOfWords == sentence.numberOfWords &&
                Arrays.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(numberOfWords);
        result = 31 * result + Arrays.hashCode(words);
        return result;
    }

    public String toString(){
        String sentence="";
        for(int i=0;i<numberOfWords;i++)
            sentence+=" "+words[i];
        sentence+=".";
        return sentence;
    }
}
