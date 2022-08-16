package com.example.quotesuser;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.example.quotesuser.ViewQuotes.QuotesList;
import com.example.quotesuser.ViewQuotes.VAttitude;
import com.example.quotesuser.ViewQuotes.VChange;
import com.example.quotesuser.ViewQuotes.VEducation;
import com.example.quotesuser.ViewQuotes.VFailure;
import com.example.quotesuser.ViewQuotes.VFaith;
import com.example.quotesuser.ViewQuotes.VFrienship;
import com.example.quotesuser.ViewQuotes.VHappiness;
import com.example.quotesuser.ViewQuotes.VHealth;
import com.example.quotesuser.ViewQuotes.VInspirational;
import com.example.quotesuser.ViewQuotes.VLeadership;
import com.example.quotesuser.ViewQuotes.VLife;
import com.example.quotesuser.ViewQuotes.VLove;
import com.example.quotesuser.ViewQuotes.VMotivational;
import com.example.quotesuser.ViewQuotes.VPatience;
import com.example.quotesuser.ViewQuotes.VPeace;
import com.example.quotesuser.ViewQuotes.VPositive;
import com.example.quotesuser.ViewQuotes.VPower;
import com.example.quotesuser.ViewQuotes.VRelationship;
import com.example.quotesuser.ViewQuotes.VSuccess;
import com.example.quotesuser.ViewQuotes.VTrust;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                finish();
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
                break;

            case R.id.optionMenu_profile:
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.nav_quote_list:
                Intent intent1=new Intent(HomeActivity.this, QuotesList.class);
                startActivity(intent1);
                break;


            case R.id.nav_contactus:
                Intent intent = new Intent(HomeActivity.this, ContactUs.class);
                startActivity(intent);
                break;


            case R.id.nav_aboutus:
                Intent intent4 = new Intent(HomeActivity.this, AboutView.class);
                startActivity(intent4);
                break;

            case R.id.nav_inquiry:
                Intent intent3 = new Intent(HomeActivity.this, InquiryActivity.class);
                startActivity(intent3);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.nav_image_quotes:
                Intent intent5 = new Intent(HomeActivity.this, ImagesActivity.class);
                startActivity(intent5);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.nav_your_quotes:
                Intent intent6 = new Intent(HomeActivity.this, InsertYourQuotes.class);
                startActivity(intent6);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;

            case R.id.nav_share_app:
                Intent intent7 = new Intent(HomeActivity.this, ShareApp.class);
                startActivity(intent7);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
            case R.id.nav_rate_app:
                Intent intent8 = new Intent(HomeActivity.this, RateApp.class);
                startActivity(intent8);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                break;
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void quotesMotivational(View view) {
        startActivity(new Intent(HomeActivity.this, VMotivational.class));
    }

    public void quotesInpirational(View view) {
        startActivity(new Intent(HomeActivity.this, VInspirational.class));
    }

    public void quotesSuccess(View view) {
        startActivity(new Intent(HomeActivity.this, VSuccess.class));
    }

    public void quotesPositive(View view) {
        startActivity(new Intent(HomeActivity.this, VPositive.class));
    }


    public void quotesLeadership(View view) {
        startActivity(new Intent(HomeActivity.this, VLeadership.class));
    }

    public void quotesLife(View view) {
        startActivity(new Intent(HomeActivity.this, VLife.class));
    }

    public void quotesLove(View view) {
        startActivity(new Intent(HomeActivity.this, VLove.class));
    }

    public void quotesAttitude(View view) {
        startActivity(new Intent(HomeActivity.this, VAttitude.class));
    }

    public void quotesChange(View view) {
        startActivity(new Intent(HomeActivity.this, VChange.class));
    }

    public void quotesPatience(View view) {
        startActivity(new Intent(HomeActivity.this, VPatience.class));
    }

    public void quotesPeace(View view) {
        startActivity(new Intent(HomeActivity.this, VPeace.class));
    }

    public void quotesEducation(View view) {
        startActivity(new Intent(HomeActivity.this, VEducation.class));
    }

    public void quotesRelationship(View view) {
        startActivity(new Intent(HomeActivity.this, VRelationship.class));
    }

    public void quotesFailure(View view) {
        startActivity(new Intent(HomeActivity.this, VFailure.class));
    }

    public void quotesFaith(View view) {
        startActivity(new Intent(HomeActivity.this, VFaith.class));
    }

    public void quotesPower(View view) {
        startActivity(new Intent(HomeActivity.this, VPower.class));
    }

    public void quotesFriendship(View view) {
        startActivity(new Intent(HomeActivity.this, VFrienship.class));
    }

    public void quotesHappiness(View view) {
        startActivity(new Intent(HomeActivity.this, VHappiness.class));
    }

    public void quotesHealth(View view) {
        startActivity(new Intent(HomeActivity.this, VHealth.class));
    }

    public void quotesTrust(View view) {
        startActivity(new Intent(HomeActivity.this, VTrust.class));
    }

}