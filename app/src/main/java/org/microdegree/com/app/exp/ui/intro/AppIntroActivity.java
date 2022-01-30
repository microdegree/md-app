package org.microdegree.com.app.exp.ui.intro;

import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.github.appintro.AppIntro;
import com.github.appintro.AppIntroCustomLayoutFragment;
import com.github.appintro.AppIntroFragment;
import com.github.appintro.model.SliderPage;

import org.microdegree.com.app.exp.R;
import org.microdegree.com.app.exp.data.local.MySharedPreference;
import org.microdegree.com.app.exp.ui.signin.SignInActivity;

public class AppIntroActivity extends AppIntro {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] header = {
                "ಕನ್ನಡಿಗರಿಗೆ IT Job-Ready ಮಾಡುವ ಅಭಿಯಾನ",
                "Our Recognition",
                "Join 15000+ Learners"
        };

        String[] desc = {
                "Learn coding and job-ready skills from industry experts in kannada",
                "MicroDegree is chosen among top innovative startups by Govt. of Karnataka's flagship Elevate-Call2 program",
                "Come, explore the power of learning job-ready skills in vernacular at an affordable price."
        };
//        String[] desc = {"","",""};
        int[] imageId = {R.drawable.onboardnew1, R.drawable.onboardnew2, R.drawable.onboardnew3};


        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle(header[0]);
        sliderPage.setDescription(desc[0]);
        sliderPage.setImageDrawable(imageId[0]);
        sliderPage.setBackgroundColor(getResources().getColor(R.color.white));
        sliderPage.setTitleColor(getResources().getColor(R.color.dark_blue));
        sliderPage.setDescriptionColor(getResources().getColor(R.color.sky_blue));

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle(header[1]);
        sliderPage2.setDescription(desc[1]);
        sliderPage2.setImageDrawable( imageId[1]);
        sliderPage2.setBackgroundColor(getResources().getColor(R.color.white));
        sliderPage2.setTitleColor(getResources().getColor(R.color.dark_blue));
        sliderPage2.setDescriptionColor(getResources().getColor(R.color.sky_blue));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle(header[2]);
        sliderPage3.setDescription(desc[2]);
      //  sliderPage3.setDescription("Coding ಈಗ ಸುಲಭ ಹಾಗೂ ಕನ್ನಡದಲ್ಲಿ");
        sliderPage3.setImageDrawable(imageId[2]);
        sliderPage3.setBackgroundColor(getResources().getColor(R.color.white));
        sliderPage3.setTitleColor(getResources().getColor(R.color.dark_blue));
        sliderPage3.setDescriptionColor(getResources().getColor(R.color.sky_blue));

        addSlide(AppIntroFragment.newInstance(sliderPage));
        addSlide(AppIntroFragment.newInstance(sliderPage2));
        addSlide(AppIntroFragment.newInstance(sliderPage3));

        setIndicatorColor(getResources().getColor(R.color.dark_blue),getResources().getColor(R.color.grey));
        setColorDoneText(getResources().getColor(R.color.black));
        setSkipButtonEnabled(false);
        setColorSkipButton(getResources().getColor(R.color.black));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        MySharedPreference.setFirstTime(false,getApplicationContext());
        Intent i = new Intent(getApplicationContext(), SignInActivity.class);
        startActivity(i);
        finish();

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        MySharedPreference.setFirstTime(false,getApplicationContext());
        Intent i = new Intent(getApplicationContext(), SignInActivity.class);
        startActivity(i);
        finish();

    }
}
