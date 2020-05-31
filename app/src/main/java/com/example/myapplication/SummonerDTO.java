package com.example.myapplication;

public class SummonerDTO {

    //필드
    private string accountId;
    private int profileIconId;
    private long revisionDate;
    private string name;
    private string id;
    private string puuid;
    private long summonerLevel;


    //생성자
    public SummonerDTO() {
        super();
    }

    public SummonerDTO(string accountId,int profileIconId,long revisionDate,string name,string id,string puuid,long summonerLevel) {
        super();
        this.accountId = accountId;
        this.profileIconId = profileIconId;
        this.revisionDate = revisionDate;
        this.name = name;
        this.id = id;
        this.puuid = puuid;
        this.summonerLevel = summonerLevel;
    }

    //getter,setter
    public string getAccountId() {
        return accountId;
    }

    public void setAccountId(string accountId) {
        this.accountId = accountId;
    }

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(long revisionDate) {
        this.revisionDate = revisionDate;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getId() {
        return id;
    }

    public void setId(string id) {
        this.id = id;
    }

    public string getPuuid() {
        return puuid;
    }

    public void setPuuid(string puuid) {
        this.puuid = puuid;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }

}
