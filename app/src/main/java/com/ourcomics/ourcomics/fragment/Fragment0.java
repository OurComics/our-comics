package com.ourcomics.ourcomics.fragment;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ourcomics.ourcomics.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

public class Fragment0 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        return view;
    }

}
