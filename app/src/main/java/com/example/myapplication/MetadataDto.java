package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MetadataDto {
    private String data_version;
    private String match_id;
    private ArrayList<String> participants = new ArrayList<String>();

    //생성자
    public MetadataDto() {
        super();
    }

    public MetadataDto(String data_version, String match_id, ArrayList<String> participants) {
        super();
        this.data_version = data_version;
        this.match_id = match_id;
        this.participants = participants;
    }
    //getter,setter

    public String getData_version() {
        return data_version;
    }

    public void setData_version(String data_version) {
        this.data_version = data_version;
    }

    public String getMatch_id() {
        return match_id;
    }

    public void setMatch_id(String match_id) {
        this.match_id = match_id;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<String> participants) {
        this.participants = participants;
    }
}
