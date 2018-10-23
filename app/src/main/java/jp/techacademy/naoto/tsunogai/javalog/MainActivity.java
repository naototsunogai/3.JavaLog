package jp.techacademy.naoto.tsunogai.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ミナミ", 27, "『料理』");

        human.say();

        human.think();

        Human human2 = new Human("アマネ", 0, "『ご飯を食べること』");

        human2.say();

        human2.think();



    }

}
