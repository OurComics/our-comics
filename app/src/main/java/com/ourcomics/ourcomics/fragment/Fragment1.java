package com.ourcomics.ourcomics.fragment;

import android.content.Intent;
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
import com.ourcomics.ourcomics.activity.RegisterActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnLongClick;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import me.drakeet.materialdialog.MaterialDialog;

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class Fragment1 extends Fragment {

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
        showDialog();
        return true;
    }

    public void showDialog() {
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setMessage("翻訳をする場合登録が必要です。");

        mMaterialDialog
                .setNegativeButton("cancel", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mMaterialDialog.dismiss();
                    }
                })
                .setPositiveButton("登録する", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mMaterialDialog.dismiss();
                        Intent intent = new Intent(getActivity(), RegisterActivity.class);
                        startActivity(intent);
                        getActivity().finish();
                    }
                })
                .show();
    }

    @OnClick(R.id.frame_1)
    void changeLanguage1() {
        if (frameClick1) {
            frame1.setImageDrawable(getResources().getDrawable(R.drawable.e_2_1));
            frameClick1 = false;
        } else {
            frame1.setImageDrawable(getResources().getDrawable(R.drawable.j_2_1));
            frameClick1 = true;
        }
    }

    @OnClick(R.id.frame_2)
    void changeLanguage2() {
        if (frameClick2) {
            frame2.setImageDrawable(getResources().getDrawable(R.drawable.e_2_2));
            frameClick2 = false;
        } else {
            frame2.setImageDrawable(getResources().getDrawable(R.drawable.j_2_2));
            frameClick2 = true;
        }
    }

    @OnClick(R.id.frame_3)
    void changeLanguage3() {
        if (frameClick3) {
            frame3.setImageDrawable(getResources().getDrawable(R.drawable.e_2_3));
            frameClick3 = false;
        } else {
            frame3.setImageDrawable(getResources().getDrawable(R.drawable.j_2_3));
            frameClick3 = true;
        }
    }

    @OnClick(R.id.frame_4)
    void changeLanguage4() {
        if (frameClick4) {
            frame4.setImageDrawable(getResources().getDrawable(R.drawable.e_2_4));
            frameClick4 = false;
        } else {
            frame4.setImageDrawable(getResources().getDrawable(R.drawable.j_2_4));
            frameClick4 = true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_page2, null);
        ButterKnife.inject(this, view);
        return view;
    }

}
