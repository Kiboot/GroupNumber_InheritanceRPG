package mcm.edu.ph.groupnumber_inheritancerpg.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mcm.edu.ph.groupnumber_inheritancerpg.Model.Hero;
import mcm.edu.ph.groupnumber_inheritancerpg.R;
import mcm.edu.ph.groupnumber_inheritancerpg.Model.GameUnit;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Hero nathan = new Hero("Nathan",1,100,50,5,2,1,10,0);
        Hero philipImproved = new Hero("Philip",5,200,100,7,6,7,6,5);

        philipImproved.setLevel(3);


        Hero nathan2 = new Hero();

        nathan2.setHealthPoint(100);
        nathan2.setManaPoint(50);
        nathan2.setLevel(3);




        Hero aisha = new Hero("Aisha",100,100);

    }

}