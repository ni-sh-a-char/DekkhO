package com.example.dekkho;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.picasso.Picasso;

public class NewsDetailActivity extends AppCompatActivity {

    String title, desc, content, imageURL, url;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        // Retrieve data from the intent
        title = getIntent().getStringExtra("title");
        desc = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        imageURL = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");

        // Initialize the WebView
        webView = findViewById(R.id.webview);

        // Configure the WebView settings
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript
        webView.setWebViewClient(new WebViewClient()); // Handle links within WebView

        // Load the URL
        webView.loadUrl(url);

        // Handle "Read News" button click
        findViewById(R.id.idBtnReadNews).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Show the WebView, hide other UI elements
                webView.setVisibility(View.VISIBLE);
                findViewById(R.id.idTVTitle).setVisibility(View.GONE);
                findViewById(R.id.idTVSubDesc).setVisibility(View.GONE);
                findViewById(R.id.idTVContent).setVisibility(View.GONE);
                findViewById(R.id.idIVNews).setVisibility(View.GONE);
            }
        });
    }
}
