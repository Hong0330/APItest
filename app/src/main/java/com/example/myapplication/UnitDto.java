package com.example.myapplication;


public class UnitDto {
    private List<int> items = new List<int>();
    private string character_id;
    private string name;
    private int rarity;
    private int tier;

    //생성자
    public UnitDto() {
        super();
    }

    public UnitDto(List<int> items, string character_id, string name, int rarity, int tier) {
        super();
        this.items = items;
        this.character_id = character_id;
        this.name = name;
        this.rarity = rarity;
        this.tier = tier;
    }

    //getter,setter
    public List<int> getItems() {
        return items;
    }

    public void setItems(List<int> items) {
        this.items = items;
    }

    public string getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(string character_id) {
        this.character_id = character_id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
