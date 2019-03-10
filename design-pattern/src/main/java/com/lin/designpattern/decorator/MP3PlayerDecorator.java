package com.lin.designpattern.decorator;

public class MP3PlayerDecorator implements UpgradePlayer {
    private Player player;
    public MP3PlayerDecorator(Player player){
        this.player=player;
    }
    @Override
    public void playMP4() {
        System.out.println("我可以播放MP4");
    }

    @Override
    public void playMP3() {
        player.playMP3();
    }
}
