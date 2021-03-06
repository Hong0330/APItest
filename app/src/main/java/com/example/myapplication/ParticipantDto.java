package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class ParticipantDto {
    private CompanionDto companion;
    private int gold_left;
    private int last_round;
    private int level;
    private int placement;
    private int players_eliminated;
    private String puuid;
    private float time_eliminated;
    private int total_damage_to_players;
    private ArrayList<TraitDto> traits = new ArrayList<TraitDto>();
    private ArrayList<UnitDto> units = new ArrayList<UnitDto>();

    //생성자
    public ParticipantDto() {
        super();
    }

    public ParticipantDto(CompanionDto companion, int gold_left, int last_round, int level, int placement, int players_eliminated, String puuid, float time_eliminated, int total_damage_to_players, ArrayList<TraitDto> traits, ArrayList<UnitDto> units) {
        super();
        this.companion = companion;
        this.gold_left = gold_left;
        this.last_round = last_round;
        this.level = level;
        this.placement = placement;
        this.players_eliminated = players_eliminated;
        this.puuid = puuid;
        this.time_eliminated = time_eliminated;
        this.total_damage_to_players = total_damage_to_players;
        this.traits = traits;
        this.units = units;
    }

    //getter,setter
    public CompanionDto getCompanion() {
        return companion;
    }

    public void setCompanion(CompanionDto companion) {
        this.companion = companion;
    }

    public int getGold_left() {
        return gold_left;
    }

    public void setGold_left(int gold_left) {
        this.gold_left = gold_left;
    }

    public int getLast_round() {
        return last_round;
    }

    public void setLast_round(int last_round) {
        this.last_round = last_round;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }

    public int getPlayers_eliminated() {
        return players_eliminated;
    }

    public void setPlayers_eliminated(int players_eliminated) {
        this.players_eliminated = players_eliminated;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public float getTime_eliminated() {
        return time_eliminated;
    }

    public void setTime_eliminated(float time_eliminated) {
        this.time_eliminated = time_eliminated;
    }

    public int getTotal_damage_to_players() {
        return total_damage_to_players;
    }

    public void setTotal_damage_to_players(int total_damage_to_players) {
        this.total_damage_to_players = total_damage_to_players;
    }

    public List<TraitDto> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<TraitDto> traits) {
        this.traits = traits;
    }

    public List<UnitDto> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<UnitDto> units) {
        this.units = units;
    }
}
