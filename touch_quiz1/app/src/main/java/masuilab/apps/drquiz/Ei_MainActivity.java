package masuilab.apps.drquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ei_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ei__main);
    }

    public void onNext(View v) {
        Intent intent = new Intent(this,Ei_Play1Activity.class);
        startActivity(intent);
    }
}
