package com.example.allan.newsappexample;


import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<NewsArticle>>
{

    ListView listView;
  //  private String url_string = "https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=d71303a8686b43c99acafc5b7ec99513";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        listView.setDivider(null);
        LoaderManager loaderManager=getSupportLoaderManager();
        loaderManager.initLoader(0,null,this).forceLoad();

    }

    @NonNull
    @Override
    public android.support.v4.content.Loader<ArrayList<NewsArticle>> onCreateLoader(int id, @Nullable Bundle args) {





        return new AsyntaskLoaderClass(this);

    }

    @Override
    public void onLoadFinished(@NonNull android.support.v4.content.Loader<ArrayList<NewsArticle>> loader, ArrayList<NewsArticle> data) {
NewsAdapter adapter=new NewsAdapter(this,R.layout.list_item,data);
listView.setAdapter(adapter);




    }

    @Override
    public void onLoaderReset(@NonNull android.support.v4.content.Loader<ArrayList<NewsArticle>> loader) {

    }



















        /*  try {
            URL url=new URL(url_string);
new asyntask().execute(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
    /* AsyncTask is used to make threats in the background to do something for you for a short time
     * it's easier than java threats
     * you can use it for long process background task
     * and for the short process as well like internet connection
      */
/*void means the time of the process you can give it an integer value
* Url means it's network connection
* */


/*
*the first parameter in asynctask is the parameter which will be handeled  by the do in background method
*the second parameter is the progress of the asynktask
*the third param is
* */
/*
    class asyntask extends AsyncTask<URL,Void,String>{
/*
* doinbackground is used to do what you want to do in the background
* */
      //  @Override
  /*      protected String doInBackground(URL... urls) {
            /*String builder is used to append a string to an existing string
           * it's more ifficent than regular string*/
/*            StringBuilder JsonData = new StringBuilder();
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


            }
            catch (ProtocolException e) {
                e.printStackTrace();

            } catch (MalformedURLException e) {
                e.printStackTrace();

            } catch (IOException e) {

                e.printStackTrace();
            }
            return JsonData.toString();
        }
/*
* */
   /*     @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            try {
                JSONObject root = new JSONObject(s);
                JSONArray articles = root.getJSONArray("articles");
/*
* you can use List instead of ArrayList for more flixablety
* In all cases, the best practice is to use List whenever you need a list object (whether ArrayList or LinkedList), so you can keep your code flexible.
* */
             /*   ArrayList<NewsArticle> newsArticleArrayList = new ArrayList<>();

                String title;
                String author;
                String image;

                for (int i = 0; i < articles.length(); i++) {
                    JSONObject element = articles.getJSONObject(i);
                    title = element.getString("title");
                    author = element.getString("author");
                    image = element.getString("urlToImage");

                    newsArticleArrayList.add(new NewsArticle(author, title, image));

                }

                NewsAdapter newsAdapter = new NewsAdapter(MainActivity.this, R.layout.list_item, newsArticleArrayList);
                listView.setAdapter(newsAdapter);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        */
    }


