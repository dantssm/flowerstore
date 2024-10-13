package com.example.flower;


public enum FlowerColor {
    RED("FF0000"), WHITE("#FFFFFF"), YELLOW("");

    private String code;

    FlowerColor(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
}
