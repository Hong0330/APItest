package com.example.myapplication;

public class MatchDto {
    private MetadataDto matadata;
    private InfoDto info;

    //생성자
    public MatchDto() {
        super();
    }

    public MatchDto(MetadataDto matadata, InfoDto info) {
        super();
        this.matadata = matadata;
        this.info = info;
    }

    //getter,setter
    public MetadataDto getMatadata() {
        return matadata;
    }

    public void setMatadata(MetadataDto matadata) {
        this.matadata = matadata;
    }

    public InfoDto getInfo() {
        return info;
    }

    public void setInfo(InfoDto info) {
        this.info = info;
    }
}
