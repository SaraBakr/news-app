package com.example.allan.newsappexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;

public class AsyntaskLoaderClass extends AsyncTaskLoader {

                private String url_string = "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=d71303a8686b43c99acafc5b7ec99513";
    ArrayList<NewsArticle> newsArticleArrayList;
    public AsyntaskLoaderClass(@NonNull Context context) {
        super(context);
    }



    @Nullable
    @Override
    public Object loadInBackground() {
        StringBuilder JsonData = new StringBuilder();
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {

            URL url = new URL(url_string);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.connect();
            inputStream = httpURLConnection.getInputStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader reader = new BufferedReader(inputStreamReader);

            String line = reader.readLine();


            while (line != null) {
                JsonData.append(line);
                line = reader.readLine();

            }


        } catch (ProtocolException e) {
            e.printStackTrace();

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }

        try {
            JSONObject root = new JSONObject(JsonData.toString());
            JSONArray articles = root.getJSONArray("articles");

            /*
             * you can use List instead of ArrayList for more flixablety
             * In all cases, the best practice is to use List whenever you need a list object (whether ArrayList or LinkedList), so you can keep your code flexible.
             * */

            newsArticleArrayList = new ArrayList<>();

            String title;
            String author;
            String image;

            Gson gson=new Gson();




        } catch (JSONException e) {
            e.printStackTrace();
        }

        return newsArticleArrayList;
    }

    public ArrayList<NewsArticle> getNewsArticleArrayList() {
        return newsArticleArrayList;
    }
}

