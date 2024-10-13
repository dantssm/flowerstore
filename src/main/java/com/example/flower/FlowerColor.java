package com.example.flower;


public enum FlowerColor {
    RED("#FF0000"), WHITE("#FFFFFF"), YELLOW("#FFFF00");

    private String code;

    FlowerColor(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
}
