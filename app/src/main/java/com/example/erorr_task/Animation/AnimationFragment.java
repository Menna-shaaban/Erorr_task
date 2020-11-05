package com.example.erorr_task.Animation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.erorr_task.R;
import com.like.LikeButton;
import com.like.OnAnimationEndListener;
import com.like.OnLikeListener;


public class AnimationFragment extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    ImageView imageView1,imageView2,imageView3,love1,love2,love3;
    RatingBar ratingBar1, ratingBar2, ratingBar3;
    boolean love;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anime_items);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.anim);
        t3=findViewById(R.id.anim2);
        t4=findViewById(R.id.anim3);
        imageView1=findViewById(R.id.img);
        imageView2=findViewById(R.id.img2);
        imageView3=findViewById(R.id.img4);
       love1=findViewById(R.id.like);
        love2=findViewById(R.id.like2);
        love3=findViewById(R.id.like3);
        ratingBar1=findViewById(R.id.ratingbar);
        ratingBar2=findViewById(R.id.ratingbar2);
        ratingBar3=findViewById(R.id.ratingbar3);
        love1.setImageResource(isLove()?R.drawable.fav:R.drawable.ic_favorit_black);
        love1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(love==false){

                    setLove(!isLove());
                    love1.setImageResource(isLove()?R.drawable.fav:R.drawable.ic_favorit_black);
                }else
                    setLove(!isLove());
                love1.setImageResource(isLove()?R.drawable.ic_favorit_black:R.drawable.fav );

            }


        });
        love2.setImageResource(isLove()?R.drawable.fav:R.drawable.ic_favorit_black);
        love2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(love==false){

                    setLove(!isLove());
                    love2.setImageResource(isLove()?R.drawable.fav:R.drawable.ic_favorit_black);
                }else
                    setLove(!isLove());
                love2.setImageResource(isLove()?R.drawable.ic_favorit_black:R.drawable.fav );

            }


        });
        love3.setImageResource(isLove()?R.drawable.fav:R.drawable.ic_favorit_black);
        love3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(love==false){

                    setLove(!isLove());
                    love3.setImageResource(isLove()?R.drawable.fav:R.drawable.ic_favorit_black);
                }else
                    setLove(!isLove());
                love3.setImageResource(isLove()?R.drawable.ic_favorit_black:R.drawable.fav );

            }


        });
}

    private boolean isLove() {
        return love;
    }
    private void setLove(boolean lovee) {
        love=lovee;
    }

}
