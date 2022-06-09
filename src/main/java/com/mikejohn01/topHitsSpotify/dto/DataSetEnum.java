package com.mikejohn01.topHitsSpotify.dto;

public enum DataSetEnum {
    ARTIST ("artist"),
    SONG ("song"),
    DURATION_MS ("duration_ms"),
    EXPLICIT ("explicit"),
    YEAR ("year"),
    POPULARITY ("popularity"),
    DANCEABILITY ("danceability"),
    ENERGY ("energy"),
    KEY ("key"),
    LOUDNESS ("loudness"),
    MODE ("mode"),
    SPEECHINESS ("speechiness"),
    ACOUSTICNESS ("acousticness"),
    INSTRUMENTALNESS ("instrumentalness"),
    LIVENESS ("liveness"),
    VALENCE ("valence"),
    TEMPO ("tempo"),
    GENRE ("genre");

    private String fieldName;

    DataSetEnum(String fieldName){this.fieldName = fieldName;}

    public String getFieldName(){return fieldName;}
}
