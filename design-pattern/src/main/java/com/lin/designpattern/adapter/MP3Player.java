package com.lin.designpattern.adapter;

public class MP3Player implements Player {
    @Override
    public void playMP3() {
        System.out.println("我可以播放MP3");
    }
}
