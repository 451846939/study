package com.lin.designpattern.decorator;

public class Test {
    public static void main(String[] args) {
        MP3PlayerDecorator mp3PlayerDecorator = new MP3PlayerDecorator(new MP3Player());
        mp3PlayerDecorator.playMP3();
        mp3PlayerDecorator.playMP4();
    }
}
