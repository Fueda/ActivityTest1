package jp.ac.titech.itpro.sdl.activitytest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    private final static String TAG = "AnswerActivity";

    public final static String NAME_EXTRA = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_answer);
        TextView tagText = findViewById(R.id.answer_tag_text);
        tagText.setText(TAG);

        String name = getIntent().getStringExtra(NAME_EXTRA);
        TextView answerText = findViewById(R.id.answer_text);
        answerText.setText(getString(R.string.answer_text_format, name));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

}
