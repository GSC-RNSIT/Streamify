package com.neetikabishwas.streamify;

import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

import kaaes.spotify.webapi.android.models.Artist;
import kaaes.spotify.webapi.android.models.Track;

public class DataHolder {
    public static List<Artist> artistsList = new ArrayList<>();
    public static String artistID;
    public static List<Track> topTracksList = new ArrayList<>();
    public static String mediaURL;
    public static int current;
    public static Intent playerServiceIntent;
    public static boolean twoPane = false;
}
