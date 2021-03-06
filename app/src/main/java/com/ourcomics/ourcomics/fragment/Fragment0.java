package com.ourcomics.ourcomics.fragment;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gc.materialdesign.views.ButtonRectangle;
import com.ourcomics.ourcomics.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnLongClick;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import me.drakeet.materialdialog.MaterialDialog;

public class Fragment0 extends Fragment {

    private boolean frameClick1 = true;
    private boolean frameClick2 = true;
    private boolean frameClick3 = true;
    private boolean frameClick4 = true;
    private boolean frameClick5 = true;
    private boolean frameClick6 = true;

    @InjectView(R.id.frame_1)
    ImageView frame1;

    @InjectView(R.id.frame_2)
    ImageView frame2;

    @InjectView(R.id.frame_3)
    ImageView frame3;

    @InjectView(R.id.frame_4)
    ImageView frame4;

    @InjectView(R.id.frame_5)
    ImageView frame5;

    @InjectView(R.id.frame_6)
    ImageView frame6;

    @OnLongClick(R.id.frame_1)
    boolean transLate1() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
        mMaterialDialog.show();
        return true;
    }


    @OnLongClick(R.id.frame_2)
    boolean transLate2() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
        mMaterialDialog.show();
        return true;
    }


    @OnLongClick(R.id.frame_3)
    boolean transLate3() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
        mMaterialDialog.show();
        return true;
    }

    @OnLongClick(R.id.frame_4)
    boolean transLate4() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
        mMaterialDialog.show();
        return true;
    }

    @OnLongClick(R.id.frame_5)
    boolean transLate5() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
        mMaterialDialog.show();
        return true;
    }

    @OnLongClick(R.id.frame_6)
    boolean transLate6() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
            }
        });
        mMaterialDialog.show();
        return true;
    }

    @OnClick(R.id.frame_1)
    void changeLanguage1() {
        if (frameClick1) {
            frame1.setImageDrawable(getResources().getDrawable(R.drawable.e_3_1));
            frameClick1 = false;
        } else {
            frame1.setImageDrawable(getResources().getDrawable(R.drawable.j_3_1));
            frameClick1 = true;
        }
    }

    @OnClick(R.id.frame_2)
    void changeLanguage2() {
        if (frameClick2) {
            frame2.setImageDrawable(getResources().getDrawable(R.drawable.e_3_2));
            frameClick2 = false;
        } else {
            frame2.setImageDrawable(getResources().getDrawable(R.drawable.j_3_2));
            frameClick2 = true;
        }
    }

    @OnClick(R.id.frame_3)
    void changeLanguage3() {
        if (frameClick3) {
            frame3.setImageDrawable(getResources().getDrawable(R.drawable.e_3_3));
            frameClick3 = false;
        } else {
            frame3.setImageDrawable(getResources().getDrawable(R.drawable.j_3_3));
            frameClick3 = true;
        }
    }

    @OnClick(R.id.frame_4)
    void changeLanguage4() {
        if (frameClick4) {
            frame4.setImageDrawable(getResources().getDrawable(R.drawable.e_3_4));
            frameClick4 = false;
        } else {
            frame4.setImageDrawable(getResources().getDrawable(R.drawable.j_3_4));
            frameClick4 = true;
        }
    }

    @OnClick(R.id.frame_5)
    void changeLanguage5() {
        if (frameClick5) {
            frame5.setImageDrawable(getResources().getDrawable(R.drawable.e_3_5));
            frameClick5 = false;
        } else {
            frame5.setImageDrawable(getResources().getDrawable(R.drawable.j_3_5));
            frameClick5 = true;
        }
    }

    @OnClick(R.id.frame_6)
    void changeLanguage6() {
        if (frameClick6) {
            frame6.setImageDrawable(getResources().getDrawable(R.drawable.e_3_6));
            frameClick6 = false;
        } else {
            frame6.setImageDrawable(getResources().getDrawable(R.drawable.j_3_6));
            frameClick6 = true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_page_3, null);
        ButterKnife.inject(this, view);
        return view;
    }

}
