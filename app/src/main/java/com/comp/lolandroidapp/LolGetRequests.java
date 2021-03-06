package com.comp.lolandroidapp;

public class LolGetRequests {
    // https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/DeathDragon97?api_key=RGAPI-226e4526-8a33-49f1-8490-2f99ab87a068
     /*
    Example: JSON returned
    {
        "id": 40396988,
        "accountId": 203344624,
        "name": "DeathDragon97",
        "profileIconId": 3159,
        "revisionDate": 1539920319000,
        "summonerLevel": 105
    }
     */

    // URL+Request+?api_key=+API_KEY
    final String API_Key = "RGAPI-86d89a5d-3b70-457b-adc6-610afab42ba7";
    final String BASE_API = "?api_key=";
    final String BASE_URL = "https://na1.api.riotgames.com";
// https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/DeathDragon97?api_key=RGAPI-86d89a5d-3b70-457b-adc6-610afab42ba7
    // Returned in JSONobject
    public String requestSummonerByName(String sName){
        String requestUrl = "/lol/summoner/v3/summoners/by-name/";
        return BASE_URL + requestUrl + sName + BASE_API + API_Key;
    }

    // Return in a JSONArray
    // Example request for JSON view: https://na1.api.riotgames.com/lol/match/v3/matchlists/by-account/203344624?api_key=RGAPI-86d89a5d-3b70-457b-adc6-610afab42ba7
    public String requestMatchHistory(long accountId){
        String requestUrl = "https://na1.api.riotgames.com/lol/match/v3/matchlists/by-account/";
        return BASE_URL + requestUrl + accountId + BASE_API + API_Key;
    }

    // https://na1.api.riotgames.com/lol/match/v3/matches/2919167105?api_key=RGAPI-86d89a5d-3b70-457b-adc6-610afab42ba7
    public String requestMatchInfo(long gameId) {
       String requestUrl = "https://na1.api.riotgames.com/lol/match/v3/matches/";
       return BASE_URL + requestUrl + gameId + BASE_API + API_Key;
    }

    // Returned in a JSONArray
    public String requestChampionMasteries(long summonerId){
        String requestUrl = "/lol/champion-mastery/v3/champion-masteries/by-summoner/";
        return BASE_URL + requestUrl + summonerId + BASE_API + API_Key;
    }

    // Returns a single String line
    String requestChampionMasteryScore(long summonerId){
        String requestUrl = "/lol/champion-mastery/v3/scores/by-summoner/";
        return BASE_URL + requestUrl + summonerId + BASE_API + API_Key;
    }
    // Returns a JSONArray
    String requestLeagueRankBySummoner(long summonerId){
        String requestUrl = "/lol/league/v3/positions/by-summoner/";
        return BASE_URL + requestUrl + summonerId + BASE_API + API_Key;
    }

    /*  This is for optional Requirements later */
    String requestSpectateActiveGameBySummoner(long summonerId){
        String requestUrl = "/lol/spectator/v3/active-games/by-summoner/";
        return BASE_URL + requestUrl + summonerId + BASE_API + API_Key;
    }
}
