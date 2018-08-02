package com.example.andres.block07;

import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NumberPicker possibilities;
    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilities = (NumberPicker) findViewById(R.id.numberPicker);
        web = (WebView) findViewById(R.id.internet);

        String[] possibilitesStrings = {
                "Bartok",
                "Debussy",
                "Prokofiev",
                "Shostakovich",
                "Stravinsky"
        };

        possibilities.setDisplayedValues(possibilitesStrings);
        possibilities.setMinValue(0);
        possibilities.setMaxValue(possibilitesStrings.length - 1);
        // Porque 0 cuenta. Además, si se cambia el tamaño del array, cambia el máximo.

       possibilities.setOnScrollListener(new NumberPicker.OnScrollListener() {
           @Override
           public void onScrollStateChange(NumberPicker numberPicker, int value) {
               if (value == NumberPicker.OnScrollListener.SCROLL_STATE_IDLE) {
                    int choice = possibilities.getValue();
                   switch (choice){
                       case (0):
                           web.setWebViewClient(new WebViewClient());
                           web.loadUrl("file:///android_asset/bartok.html");
                           break;
                       case (1):
                           web.setWebViewClient(new WebViewClient());
                           web.loadUrl("https://es.wikipedia.org/wiki/Claude_Debussy");
                           break;
                       case (2):
                           web.setWebViewClient(new WebViewClient());
                           web.loadUrl("https://es.wikipedia.org/wiki/Sergu%C3%A9i_Prok%C3%B3fiev");
                           break;
                       case (3):
                           web.setWebViewClient(new WebViewClient());
                           web.loadUrl("https://es.wikipedia.org/wiki/Dmitri_Shostak%C3%B3vich");
                           break;
                       case (4):
                           web.setWebViewClient(new WebViewClient());
                           web.loadUrl("https://es.wikipedia.org/wiki/Stravinsky");
                           break;
                   }

                   // Toast.makeText(getApplication(), String.valueOf(choice), Toast.LENGTH_LONG).show();
               }
           }
       });
    }
}
