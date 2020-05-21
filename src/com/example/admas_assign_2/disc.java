package com.example.admas_assign_2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class disc extends ActionBarActivity {
    public ImageView disc;
    public ImageView impact;
    public ImageView prevenstion;
    public TextView tv;
    public TextView phone;
    public ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discription);
        tv = (TextView) findViewById(R.id.title);
        phone = (TextView) findViewById(R.id.phone);
        logo = (ImageView) findViewById(R.id.logo);
        Bundle extras = getIntent().getExtras();
        String pass_cata = extras.getString("val1");
        Toast.makeText(getApplicationContext(), pass_cata, Toast.LENGTH_LONG).show();
        disc = (ImageView) findViewById(R.id.disk);
        impact = (ImageView) findViewById(R.id.impact);
        prevenstion = (ImageView) findViewById(R.id.prevension);
        tv.setText(pass_cata);

        if (pass_cata.contains("CAD")) {
            logo.setBackgroundResource(R.drawable.heartlogo);
            disc.setBackgroundResource(R.drawable.cad);
            impact.setBackgroundResource(R.drawable.impactofcad);
            prevenstion.setBackgroundResource(R.drawable.prevenstion);

        }
        if (pass_cata.contains("Arrhythmia")) {
            logo.setBackgroundResource(R.drawable.heartlogo);
            disc.setBackgroundResource(R.drawable.arrhythmia);
            prevenstion.setBackgroundResource(R.drawable.careofourheart);

        }
        if (pass_cata.contains("Heart failure")) {
            logo.setBackgroundResource(R.drawable.heartlogo);
            disc.setBackgroundResource(R.drawable.heartfailure);
            prevenstion.setBackgroundResource(R.drawable.careofourheart);

        }

        if (pass_cata.contains("valve Disease")) {
            logo.setBackgroundResource(R.drawable.heartlogo);
            disc.setBackgroundResource(R.drawable.heartvalvedisease);
            prevenstion.setBackgroundResource(R.drawable.careofourheart);

        }

        if (pass_cata.contains("Lung Cancer")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.lungcancer);
            impact.setBackgroundResource(R.drawable.lungcancer2);
            prevenstion.setBackgroundResource(R.drawable.lungcancerprevension);

        }
        if (pass_cata.contains("Breast Cancer")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.breastcancer);
            prevenstion.setBackgroundResource(R.drawable.lungcancerprevension);

        }

        if (pass_cata.contains("Prostate cancer")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.prostatecancer);
            prevenstion.setBackgroundResource(R.drawable.lungcancerprevension);

        }

        if (pass_cata.contains("Skin cancer")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.skincancer);
            prevenstion.setBackgroundResource(R.drawable.lungcancerprevension);

        }
        if (pass_cata.contains("Diabetes Discription")) {
            logo.setBackgroundResource(R.drawable.diabeteslogo);
            disc.setBackgroundResource(R.drawable.diabates);
            impact.setBackgroundResource(R.drawable.diabatesimpact);
            prevenstion.setBackgroundResource(R.drawable.diabatesprevension);

        }
        if (pass_cata.contains("Type 1")) {
            logo.setBackgroundResource(R.drawable.diabeteslogo);
            disc.setBackgroundResource(R.drawable.type1);
            impact.setBackgroundResource(R.drawable.diabatesimpact);
            prevenstion.setBackgroundResource(R.drawable.diabatesprevension);

        }
        if (pass_cata.contains("Type 2")) {
            logo.setBackgroundResource(R.drawable.diabeteslogo);
            disc.setBackgroundResource(R.drawable.type2);
            impact.setBackgroundResource(R.drawable.diabatesimpact);
            prevenstion.setBackgroundResource(R.drawable.diabatesprevension);

        }
        if (pass_cata.contains("Stroke Discription")) {
            logo.setBackgroundResource(R.drawable.strokelogo);
            disc.setBackgroundResource(R.drawable.stroke);
            prevenstion.setBackgroundResource(R.drawable.prevenstionstroke);

        }
        if (pass_cata.contains("Hemorrhagic stroke")) {
            logo.setBackgroundResource(R.drawable.strokelogo);
            disc.setBackgroundResource(R.drawable.hemorrhagicstroke);
            impact.setBackgroundResource(R.drawable.prevenstionstroke);
            prevenstion.setBackgroundResource(R.drawable.generalprevenstion2);

        }

        if (pass_cata.contains("Ischemic stroke")) {
            logo.setBackgroundResource(R.drawable.strokelogo);
            disc.setBackgroundResource(R.drawable.ichemicstroke);
            impact.setBackgroundResource(R.drawable.prevenstionstroke);
            prevenstion.setBackgroundResource(R.drawable.generalprevenstion2);

        }
        if (pass_cata.contains("Transient ischemic attack")) {
            logo.setBackgroundResource(R.drawable.strokelogo);
            disc.setBackgroundResource(R.drawable.transientischemicattack);
            impact.setBackgroundResource(R.drawable.prevenstionstroke);
            prevenstion.setBackgroundResource(R.drawable.generalprevenstion2);

        }

        if (pass_cata.contains("Alzimers")) {
            logo.setBackgroundResource(R.drawable.alzimerslogo);
            disc.setBackgroundResource(R.drawable.alzimers);
            prevenstion.setBackgroundResource(R.drawable.alzimersprevension);


        }
        if (pass_cata.contains("Tuberclosis")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.tuberclosis);
            impact.setBackgroundResource(R.drawable.tuberclosisimpact);
            prevenstion.setBackgroundResource(R.drawable.tuberclosisprevenstion);


        }
        if (pass_cata.contains("Diarrhea")) {
            logo.setBackgroundResource(R.drawable.diarrhealogo);
            disc.setBackgroundResource(R.drawable.diarrhea);
            impact.setBackgroundResource(R.drawable.diarrheaimpact);
            prevenstion.setBackgroundResource(R.drawable.diarrheaprevension);


        }
        if (pass_cata.contains("Chronic obstructive pulmonary")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.chronicobstructivepulmonary);
            prevenstion.setBackgroundResource(R.drawable.chronicobstructivepulmonaryriskfactors);



        }
        if (pass_cata.contains("Cirrosis")) {
            logo.setBackgroundResource(R.drawable.cancerlogo);
            disc.setBackgroundResource(R.drawable.cirrosis);
            prevenstion.setBackgroundResource(R.drawable.cirrosisprevension);



        }
        if (pass_cata.contains("General Health Tips")) {

            disc.setBackgroundResource(R.drawable.generalprevenstion);




        }
        if (pass_cata.contains("Developer")) {

            disc.setBackgroundResource(R.drawable.generalprevenstion);

            tv.setText("Developer:- Seife Akalu");
            phone.setText("Phone:- 251-913-816-043");

        }

    }
}
