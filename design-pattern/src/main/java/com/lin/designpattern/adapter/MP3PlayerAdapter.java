package com.lin.designpattern.adapter;

public class MP3PlayerAdapter extends MP3Player implements UpgradePlayer{
    @Override
    public void playMP4() {
        playMP3();
        System.out.println("我可以播放MP4");
    }
}
