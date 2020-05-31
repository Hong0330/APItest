package com.example.myapplication;

public class MetadataDto {
    private string data_version;
    private string match_id;
    private List<string> participants = new List<string>();

    //생성자
    public MetadataDto() {
        super();
    }

    public MetadataDto(string data_version, string match_id, List<string> participants) {
        super();
        this.data_version = data_version;
        this.match_id = match_id;
        this.participants = participants;
    }
    //getter,setter

    public string getData_version() {
        return data_version;
    }

    public void setData_version(string data_version) {
        this.data_version = data_version;
    }

    public string getMatch_id() {
        return match_id;
    }

    public void setMatch_id(string match_id) {
        this.match_id = match_id;
    }


    public List<string> getParticipants() {
        return participants;
    }

    public void setParticipants(List<string> participants) {
        this.participants = participants;
    }
}
