package com.example.translatorapp;

public class WordModal {

    private String englishWord;
    private String kiswahiliWord;
    private int image;

//    constructors
    public WordModal() {
    }

    public WordModal(String englishWord, String kiswahiliWord, int image) {
        this.englishWord = englishWord;
        this.kiswahiliWord = kiswahiliWord;
        this.image = image;
    }

//    setters and getters
    public String getEnglishWord() {
        return englishWord;
    }

    public String getKiswahiliWord() {
        return kiswahiliWord;
    }

    public int getImage() {
        return image;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public void setKiswahiliWord(String kiswahiliWord) {
        this.kiswahiliWord = kiswahiliWord;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
