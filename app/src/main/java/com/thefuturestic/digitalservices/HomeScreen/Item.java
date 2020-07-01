package com.thefuturestic.digitalservices.HomeScreen;


public class Item {

    public String text;
    public int drawable;
    public String color;
    public String detailText;
    public Item(String text, int drawable, String color,String detailText ) {
        this.text = text;
        this.drawable = drawable;
        this.color = color;
        this.detailText=detailText;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getDetailText() {
        return detailText;
    }

    public void setDetailText(String detailText) {
        this.detailText = detailText;
    }
}
