package com.uqlproject;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.StringRenderer;

import java.text.MessageFormat;
import java.util.*;

/**
 * Created by Igor on 2016-05-27.
 */
public class ColumnHelper {
    public static final String TRACK_TOKEN_NAME = "Track";
    public static final String GENRE_TOKEN_NAME = "Genre";
    public static final String MEDIA_TOKEN_NAME = "Media";
    public static final String ALBUM_TOKEN_NAME = "Album";
    public static final String ARTIST_TOKEN_NAME = "Artist";
    public static final String COMPOSER_TOKEN_NAME = "Composer";
    public static final String TIME_TOKEN_NAME = "Time";
    public static final String SIZE_TOKEN_NAME = "Size";

    public static final String TRACK_TABLE = "Track";
    public static final String MEDIA_TABLE = "MediaType";
    public static final String GENRE_TABLE = "Genre";
    public static final String ALBUM_TABLE = "Album";
    public static final String ARTIST_TABLE = "Artist";

    public static final String NAME_COLUMN = "Name";
    public static final String COMPOSER_COLUMN = "Composer";
    public static final String TIME_COLUMN = "Milliseconds";
    public static final String SIZE_COLUMN = "Bytes";


    private HashMap<String,String> columnMap;


    public ColumnHelper() {
        this.columnMap = new HashMap<String,String>();
        columnMap.put(TRACK_TOKEN_NAME,concatTableWithColumn(TRACK_TABLE,NAME_COLUMN));
        columnMap.put(GENRE_TOKEN_NAME,concatTableWithColumn(GENRE_TABLE,NAME_COLUMN));
        columnMap.put(MEDIA_TOKEN_NAME,concatTableWithColumn(MEDIA_TABLE,NAME_COLUMN));
        columnMap.put(ALBUM_TOKEN_NAME,concatTableWithColumn(ALBUM_TABLE,NAME_COLUMN));
        columnMap.put(ARTIST_TOKEN_NAME,concatTableWithColumn(ARTIST_TABLE,NAME_COLUMN));
        columnMap.put(COMPOSER_TOKEN_NAME,concatTableWithColumn(TRACK_TABLE,COMPOSER_COLUMN));
        columnMap.put(TIME_TOKEN_NAME,concatTableWithColumn(TRACK_TABLE,TIME_COLUMN));
        columnMap.put(SIZE_TOKEN_NAME,concatTableWithColumn(TRACK_TABLE,SIZE_COLUMN));
    }

    public String getColumn(String keyWord){
        if(columnMap.containsKey(keyWord)){
            return columnMap.get(keyWord);
        }
        else {
            throw new IllegalArgumentException("Argument " + keyWord + " not known");
        }
    }

    private String concatTableWithColumn(String table, String column){
        return table + '.' + column;
    }

    public List<String> getAllColumns(){
        return new ArrayList<String>(columnMap.values());
    }


}
