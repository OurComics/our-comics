package com.ourcomics.ourcomics.fragment;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ourcomics.ourcomics.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnLongClick;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class Fragment2 extends Fragment {

    private boolean frameClick1 = true;
    private boolean frameClick2 = true;
    private boolean frameClick3 = true;
    private boolean frameClick4 = true;

    @InjectView(R.id.frame_1)
    ImageView frame1;

    @InjectView(R.id.frame_2)
    ImageView frame2;

    @InjectView(R.id.frame_3)
    ImageView frame3;

    @InjectView(R.id.frame_4)
    ImageView frame4;

    @OnLongClick(R.id.frame_1)
    void transLate1() {

    }

    @OnLongClick(R.id.frame_2)
    void transLate2() {

    }

    @OnLongClick(R.id.frame_3)
    void transLate3() {

    }

    @OnLongClick(R.id.frame_4)
    void transLate4() {

    }

    @OnClick(R.id.frame_1)
    void changeLanguage1() {
        if (frameClick1) {
            frame1.setImageDrawable(getResources().getDrawable(R.drawable.e_1_1));
            frameClick1 = false;
        } else {
            frame1.setImageDrawable(getResources().getDrawable(R.drawable.j_1_1));
            frameClick1 = true;
        }
    }

    @OnClick(R.id.frame_2)
    void changeLanguage2() {
        if (frameClick2) {
            frame2.setImageDrawable(getResources().getDrawable(R.drawable.e_1_2));
            frameClick2 = false;
        } else {
            frame2.setImageDrawable(getResources().getDrawable(R.drawable.j_1_2));
            frameClick2 = true;
        }
    }

    @OnClick(R.id.frame_3)
    void changeLanguage3() {
        if (frameClick3) {
            frame3.setImageDrawable(getResources().getDrawable(R.drawable.e_1_3));
            frameClick3 = false;
        } else {
            frame3.setImageDrawable(getResources().getDrawable(R.drawable.j_1_3));
            frameClick3 = true;
        }
    }

    @OnClick(R.id.frame_4)
    void changeLanguage4() {
        if (frameClick4) {
            frame4.setImageDrawable(getResources().getDrawable(R.drawable.e_1_4));
            frameClick4 = false;
        } else {
            frame4.setImageDrawable(getResources().getDrawable(R.drawable.j_1_4));
            frameClick4 = true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_page1, null);
        ButterKnife.inject(this, view);
        return view;
    }

}

