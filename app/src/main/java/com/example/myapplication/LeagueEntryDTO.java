package com.example.myapplication;

public class LeagueEntryDTO {
    private string leagueId;
    private string queueType;
    private string tier;
    private string rank;
    private string summonerId;
    private string summonerName;
    private int leaguePoints;
    private int wins;
    private int losses;
    private boolean veteran;
    private boolean inactive;
    private boolean freshBlood;
    private boolean hotStreak;

    public LeagueEntryDTO() {
        super();
    }

    public LeagueEntryDTO(string leagueId, string queueType, string tier, string rank, string summonerId, string summonerName, int leaguePoints, int wins, int losses, boolean veteran, boolean inactive, boolean freshBlood, boolean hotStreak) {
        super();
        this.leagueId = leagueId;
        this.queueType = queueType;
        this.tier = tier;
        this.rank = rank;
        this.summonerId = summonerId;
        this.summonerName = summonerName;
        this.leaguePoints = leaguePoints;
        this.wins = wins;
        this.losses = losses;
        this.veteran = veteran;
        this.inactive = inactive;
        this.freshBlood = freshBlood;
        this.hotStreak = hotStreak;
    }

    public string getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(string leagueId) {
        this.leagueId = leagueId;
    }

    public string getQueueType() {
        return queueType;
    }

    public void setQueueType(string queueType) {
        this.queueType = queueType;
    }

    public string getTier() {
        return tier;
    }

    public void setTier(string tier) {
        this.tier = tier;
    }

    public string getRank() {
        return rank;
    }

    public void setRank(string rank) {
        this.rank = rank;
    }

    public string getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(string summonerId) {
        this.summonerId = summonerId;
    }

    public string getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(string summonerName) {
        this.summonerName = summonerName;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public boolean getVeteran() {
        return veteran;
    }

    public void setVeteran(boolean veteran) {
        this.veteran = veteran;
    }

    public boolean getInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public boolean getFreshBlood() {
        return freshBlood;
    }

    public void setFreshBlood(boolean freshBlood) {
        this.freshBlood = freshBlood;
    }

    public boolean getHotStreak() {
        return hotStreak;
    }

    public void setHotStreak() {
        this.hotStreak = hotStreak;
    }
}