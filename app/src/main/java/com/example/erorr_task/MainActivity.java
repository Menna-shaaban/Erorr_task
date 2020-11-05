package com.example.erorr_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.erorr_task.Animation.AnimationFragment;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    CircleImageView Image;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.indeterminateBar);
        Image=findViewById(R.id.i1);
        textView=findViewById(R.id.t1);
        progressBar.setVisibility(View.VISIBLE);
        timer();

    }
    private void timer(){
        new Handler(  ).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent( getApplicationContext(), AnimationFragment.class );
                startActivity( intent );

                finish();
            }
        },1500 );
    }
}