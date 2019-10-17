package ionela.com.traveljournalapp.utils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ionela.com.traveljournalapp.NavigationDrawerActivity;
import ionela.com.traveljournalapp.R;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, NavigationDrawerActivity.class));
    }
}
