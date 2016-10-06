package com.demo.serkansekman.drawermenu;

/**
 * Created by serkan.sekman on 10/6/2016.
 */

public class NavItem {

    private String title;
    private int resIcon;

    public NavItem(String title,int resIcon) {
        this.title = title;
        this.resIcon = resIcon;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
