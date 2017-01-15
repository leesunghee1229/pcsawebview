package kr.pcsa.pscawebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Study1Activity extends AppCompatActivity {

    Button mButton;
    ImageView mImg1;
    ImageView mImg2;

    Boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study1);

        init();
    }

    private void init() {
        mButton = (Button) findViewById(R.id.button4);
        mImg1 = (ImageView) findViewById(R.id.img1);
        mImg2 = (ImageView) findViewById(R.id.img2);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected) {
                    mImg1.setVisibility(View.VISIBLE);
                    mImg2.setVisibility(View.GONE);
                }
                else {
                    mImg1.setVisibility(View.GONE);
                    mImg2.setVisibility(View.VISIBLE);
                }

                selected = !selected;
            }
        });
    }
}
