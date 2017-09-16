package kr.pcsa.pscawebview.study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import kr.pcsa.pscawebview.R;

public class Study33Activity extends AppCompatActivity {

    /**
     * 액티비로 데이터를 전달하고 그 결과를 부모 액티비티에 뿌려 주는 방법에 대해서 배웠습니다.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study33);

        Intent intent = getIntent();
        if(intent != null) {
            String title = intent.getStringExtra("title");
            Toast.makeText(getApplicationContext(),title,Toast.LENGTH_LONG).show();
        }

        Button mBtnStudy33Result = (Button) findViewById(R.id.btnStudy33Result);
        mBtnStudy33Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                intent.putExtra("name","티아라");
                setResult(RESULT_OK,intent);

                finish();
            }
        });
    }
}
