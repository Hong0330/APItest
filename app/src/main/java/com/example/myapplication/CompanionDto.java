package com.example.myapplication;

public class CompanionDto {
    private string content_ID;
    private int skin_ID;
    private string species;

    //생성자
    public CompanionDto() {
        super();
    }

    public CompanionDto(string content_ID, int skin_ID, string species) {
        super();
        this.content_ID = content_ID;
        this.skin_ID = skin_ID;
        this.species = species;
    }

    //getter,setter
    public string getContent_ID() {
        return content_ID;
    }

    public void setContent_ID(string content_ID) {
        this.content_ID = content_ID;
    }

    public int getSkin_ID() {
        return skin_ID;
    }

    public void setSkin_ID(int skin_ID) {
        this.skin_ID = skin_ID;
    }

    public string getSpecies() {
        return species;
    }

    public void setSpecies(string species) {
        this.species = species;
    }
}
