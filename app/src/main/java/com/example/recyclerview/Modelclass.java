package com.example.recyclerview;

public class Modelclass {
    private String tilte;
    private String body1;
    private String body2;
    private String button;

    public String getTilte() {
        return tilte;
    }

    public String getBody1() {
        return body1;
    }
    public String getBody2() {
        return body2;
    }

    public String getButton() {
        return button;
    }

    public Modelclass(String tilte, String body1, String body2, String button) {
        this.tilte = tilte;
        this.body2 = body2;
        this.body1 = body1;
        this.button = button;
    }
}
