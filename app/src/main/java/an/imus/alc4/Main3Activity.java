package an.imus.alc4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView = (ImageView) findViewById(R.id.imageView);
        int imageresource = getResources().getIdentifier("@drawable/rawable", null, this.getPackageName());

        imageView.setImageResource(imageresource);
    }
}
