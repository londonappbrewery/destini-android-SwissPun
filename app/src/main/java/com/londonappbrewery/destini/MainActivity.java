package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
Button Red;
Button Blue;
TextView Story;
int redbutton=0;
int bluebutton=0;
boolean left=false;
boolean right=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Red= findViewById(R.id.buttonTop);
        Blue = findViewById(R.id.buttonBottom);
        Story =findViewById(R.id.storyTextView);

Story.setText(R.string.T1_Story);

        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redbutton++;
                Show(redbutton,bluebutton);

            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bluebutton++;
                Show(redbutton,bluebutton);


            }
        });



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    public  void  Show(int index1,int index2){
        if (index1==1&&index2==0){
            Story.setText(R.string.T3_Story);
            Red.setText(R.string.T3_Ans1);
            Blue.setText(R.string.T3_Ans2);
            right=false;
            left=true;
        }
        if (index1==0&&index2==1){
            Story.setText(R.string.T2_Story);
            Red.setText(R.string.T2_Ans1);
            Blue.setText(R.string.T2_Ans2);
            right=true;
            left=false;
        }
        if (index1==2&&index2==0){
            Story.setText(R.string.T6_End);
            Red.setVisibility(View.GONE);
            Blue.setVisibility(View.GONE);

        }

        if (index1==1&&index2==1&&left==true&&right==false){
            Story.setText(R.string.T5_End);
            Red.setVisibility(View.GONE);
            Blue.setVisibility(View.GONE);
        }

        if (index1==0&&index2==2){
            Story.setText(R.string.T4_End);
            Red.setVisibility(View.GONE);
            Blue.setVisibility(View.GONE);

        }

        if (index1==1&&index2==2){
            Story.setText(R.string.T5_End);
            Red.setVisibility(View.GONE);
            Blue.setVisibility(View.GONE);
        }


        if (index1==2&&index2==1){
            Story.setText(R.string.T6_End);
            Red.setVisibility(View.GONE);
            Blue.setVisibility(View.GONE);
        }
        if (index1==1&&index2==1&&right==true&&left==false){
            Story.setText(R.string.T3_Story);
            Red.setText(R.string.T3_Ans1);
            Blue.setText(R.string.T3_Ans2);
        }







    }



}
