package com.app.selfiewars.selfiewars;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SettingsActivity extends AppCompatActivity {

    LinearLayout follow;
    LinearLayout updatetouserprofile;
    LinearLayout useragreement;
    LinearLayout about;
    LinearLayout logout;
    ImageView backspace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        settingsItemsCreated();
        backspaceIconClicked();
        followClicked();
        updateToUserProfileClicked();
    }

    public void settingsItemsCreated(){
        follow = findViewById(R.id.followLinearLayout);
        updatetouserprofile = findViewById(R.id.updatetouserprofileLinearLayout);
        useragreement = findViewById(R.id.useragreementLinearLayout);
        about = findViewById(R.id.aboutLinearLayout);
        logout = findViewById(R.id.logoutLinearLayout);
        backspace = findViewById(R.id.backspaceIcon);
    }
    public void backspaceIconClicked(){
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public void followClicked(){
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(intent);
            }
        });
    }
    public void updateToUserProfileClicked(){
        updatetouserprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),UpdateToUserProfile.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
