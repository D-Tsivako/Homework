package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class Word {
    Scanner scanner = new Scanner(System.in);
    String word;

    Word(){
        System.out.print("Word: ");
        word = scanner.next();
    }

    public String toString(){
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word)) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
