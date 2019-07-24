package com.example.android.cookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        /*
         *TODO: Find a reference to the ImageView in the layout. Change the image.
         */
        eatCookieTextView();
        /*
         *TODO: Find a reference to the TextView in the layout. Change the text.
         */
        afterCookieImageView();

    }

    private void eatCookieTextView() {
        TextView eatCookieTextView = findViewById(R.id.status_text_view);
        eatCookieTextView.setText("I'm so full");
    }

    private void afterCookieImageView() {
        ImageView afterCookieImageView = findViewById(R.id.android_cookie_image_view);
        afterCookieImageView.setImageResource(R.drawable.after_cookie);
    }
}