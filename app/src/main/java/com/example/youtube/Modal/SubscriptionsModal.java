package com.example.youtube.Modal;

public class SubscriptionsModal {

    private String titleSubs;
    private String videoSubs;
    private int fotoSubs;

    public SubscriptionsModal() {

    }

    public String getTitleSubs() {
        return titleSubs;
    }

    public void setTitleSubs(String titleSubs) {
        this.titleSubs = titleSubs;
    }

    public String getVideoSubs() {
        return videoSubs;
    }

    public void setVideoSubs(String videoSubs) {
        this.videoSubs = videoSubs;
    }

    public int getFotoSubs() {
        return fotoSubs;
    }

    public void setFotoSubs(int fotoSubs) {
        this.fotoSubs = fotoSubs;
    }

    public SubscriptionsModal(String titleSubs, String videoSubs, int fotoSubs) {
        this.titleSubs = titleSubs;
        this.videoSubs = videoSubs;
        this.fotoSubs = fotoSubs;
    }
}
