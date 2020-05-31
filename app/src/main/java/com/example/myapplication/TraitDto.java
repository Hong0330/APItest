package com.example.myapplication;

public class TraitDto {
    private string name;
    private int num_units;
    private int tier_current;
    private int tier_total;

    //생성자
    public TraitDto() {
        super();
    }

    public TraitDto(string name, int num_units, int tier_current, int tier_total) {
        super();
        this.name = name;
        this.num_units = num_units;
        this.tier_current = tier_current;
        this.tier_total = tier_total;
    }

    //getter,setter
    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getNum_units() {
        return num_units;
    }

    public void setNum_units(int num_units) {
        this.num_units = num_units;
    }

    public int getTier_current() {
        return tier_current;
    }

    public void setTier_current(int tier_current) {
        this.tier_current = tier_current;
    }

    public int getTier_total() {
        return tier_total;
    }

    public void setTier_total(int tier_total) {
        this.tier_total = tier_total;
    }
}
