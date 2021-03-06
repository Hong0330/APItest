package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class InfoDto {
    private long game_datetime;
    private float game_length;
    private String game_version;
    private ArrayList<ParticipantDto> participants = new ArrayList<ParticipantDto>();
    private int queue_id;
    private int tft_set_number;

    //생성자
    public InfoDto() {
        super();
    }

    public InfoDto(long game_datetime, float game_length, String game_version, ArrayList<ParticipantDto> participants, int queue_id, int tft_set_number) {
        super();
        this.game_datetime = game_datetime;
        this.game_length = game_length;
        this.game_version = game_version;
        this.participants = participants;
        this.queue_id = queue_id;
        this.tft_set_number = tft_set_number;
    }

    //getter,setter
    public long getGame_datetime() {
        return game_datetime;
    }

    public void setGame_datetime(long game_datetime) {
        this.game_datetime = game_datetime;
    }

    public float getGame_length() {
        return game_length;
    }

    public void setGame_length(float game_length) {
        this.game_length = game_length;
    }

    public String getGame_version() {
        return game_version;
    }

    public void setGame_version(String game_version) {
        this.game_version = game_version;
    }

    public List<ParticipantDto> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<ParticipantDto> participants) {
        this.participants = participants;
    }

    public int getQueue_id() {
        return queue_id;
    }

    public void setQueue_id(int queue_id) {
        this.queue_id = queue_id;
    }

    public int getTft_set_number() {
        return tft_set_number;
    }

    public void setTft_set_number(int tft_set_number) {
        this.tft_set_number = tft_set_number;
    }
}
