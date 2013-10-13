package pazzled.game.home;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import pazzled.game.menu.MenuActivity;

// All Log statements are as per the taken from the default android.util.Log module.
// The logging utils may have to be converted and made similar to the Atomic project

public class HomeActivity extends Activity implements AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(ACTIVITY_SERVICE, "On Create");

        ImageView homeLogo = (ImageView) findViewById(R.id.pazzled_logo);
        Animation logoSlideUp = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
        logoSlideUp.setAnimationListener(this);
        homeLogo.setAnimation(logoSlideUp);
        Log.d(ACTIVITY_SERVICE, "Logo Animation");

        TextView pazzledText = (TextView) findViewById(R.id.pazzled);
        TextView labsText = (TextView) findViewById(R.id.labs);
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        shake.setAnimationListener(this);
        pazzledText.setAnimation(shake);
        labsText.setAnimation(shake);
        Log.d(ACTIVITY_SERVICE, "Text Animation");
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent startMenuActivity = new Intent(this, MenuActivity.class);
        startActivity(startMenuActivity);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu.
        // This adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        Log.d(ACTIVITY_SERVICE, "On Create Options Menu");
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ACTIVITY_SERVICE, "On Start");
        // The activity is about to become "visible".
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ACTIVITY_SERVICE, "On Resume");
        // The activity has become visible (it has "resumed").
    }

    @Override
    protected void onPause() {
        Log.d(ACTIVITY_SERVICE, "On Pause");
        super.onPause();
        // Another activity is taking focus (this activity is about to be
        // "paused").
    }

    @Override
    protected void onStop() {
        Log.d(ACTIVITY_SERVICE, "On Stop");
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ACTIVITY_SERVICE, "On Destroy");
        // The activity is about to be destroyed.
    }
}