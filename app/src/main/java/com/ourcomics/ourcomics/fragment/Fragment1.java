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

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class Fragment1 extends Fragment {

    @InjectView(R.id.photo)
    ImageViewTouch photo;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_manga_view1, null);
        ButterKnife.inject(this, view);
        Matrix matrix = photo.getDisplayMatrix();
        Drawable bitmap = getResources().getDrawable(R.drawable.bla);
        photo.setImageDrawable(bitmap);
        return view;
    }

}
