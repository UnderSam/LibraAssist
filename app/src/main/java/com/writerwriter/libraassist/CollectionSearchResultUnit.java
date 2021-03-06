package com.writerwriter.libraassist;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by Larry on 2017/12/12.
 */

public class CollectionSearchResultUnit {
    private static final String NULL_TITLE = "取得資料中...";
    private static final String NULL_IMG = "https://www.cmswing.com/u/avatar/131";
    private static final String ERROR_IMG = "http://www.51allout.co.uk/wp-content/uploads/2012/02/Image-not-found.gif";

    private String isbn;
    private String title = NULL_TITLE;
    private String author = NULL_IMG;
    private String img;
    private String publish_year;
    private String publisher;
    private String location;
    private String storage;
    private String link;
    private String searchState = "null";

    public CollectionSearchResultUnit() {
    }

    public CollectionSearchResultUnit(HashMap<String, String> data) {
        SetInfo(data);
    }

    public void SetInfo(HashMap<String, String> data) {
        if(data.containsKey("isbn")) isbn = data.get("isbn");
        if(data.containsKey("title")) title = data.get("title");
        if(data.containsKey("author")) author = data.get("author");
        if(data.containsKey("img")) img = data.get("img");
        if(data.containsKey("publish_year")) publish_year = data.get("publish_year");
        if(data.containsKey("publisher")) publisher = data.get("publisher");
        if(data.containsKey("link")) link = data.get("link");
        if(data.containsKey("location")) location = data.get("location");
        if(data.containsKey("storage")) storage = data.get("storage");
        if(data.containsKey("searchState")) searchState = data.get("searchState");

        if (img.equals("")) img = ERROR_IMG;
    }

    public String getImg() { return img; }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public String getLibrary() { return location; }

    public String getLink() { return link; }

    public String getIsbn() {
        return isbn;
    }

    public String getPublish_year() {
        return publish_year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLocation() {
        return location;
    }

    public String getStorage() {
        return storage;
    }

    public String getDetail() {
        if (searchState.equals("true"))
            return   "書名         : "+title+"\n"
                    +"作者         : "+author+"\n"
                    +"ISBN         : "+isbn+"\n"
                    +"出版社     : "+publisher+"\n"
                    +"出版年     : "+publish_year+"\n"
                    +"館藏位置 : "+location+"\n"
                    +"可借數量 : "+storage;
        else if (searchState.equals("false") || searchState.equals("Pending!"))
            return "搜尋詳細資訊中...";
        else if (searchState.equals("null"))
            return NULL_TITLE;
        else
            return "Error!!! State : "+searchState;
    }

    public boolean isNull() {
        return searchState == "null";
    }

    public String getSearchState() {
        return searchState;
    }
}
