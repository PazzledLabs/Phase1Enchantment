package pazzled.game.home;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    public void onStart() {
        super.onStart();
        ImageView homeLogo = (ImageView) findViewById(R.id.pazzled_logo);
        Animation logoSlideUp = AnimationUtils.loadAnimation(this, R.anim.abc_slide_in_bottom);
        homeLogo.startAnimation(logoSlideUp);

        TextView pazzledText = (TextView) findViewById(R.id.pazzled);
        TextView labsText = (TextView) findViewById(R.id.labs);
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        pazzledText.startAnimation(shake);
        labsText.startAnimation(shake);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

}
