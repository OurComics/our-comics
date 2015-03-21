package com.ourcomics.ourcomics.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;
import com.ourcomics.ourcomics.R;

import java.util.zip.Inflater;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.OnLongClick;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import me.drakeet.materialdialog.MaterialDialog;

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class Fragment2 extends Fragment {

    private boolean frameClick1 = true;
    private boolean frameClick2 = true;
    private boolean frameClick3 = true;
    private boolean frameClick4 = true;
    private int translateCount = 0;

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
        TextView explain = (TextView) view.findViewById(R.id.explain);
        explain.setText("８千人‥");
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
                showDialog();
                translateCount++;
                if(translateCount == 2) {
                    sendTranslate();
                }
            }
        });
        mMaterialDialog.show();
        return true;
    }

    public void showDialog() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        TextView explain = (TextView) view.findViewById(R.id.explain);
        explain.setText("毎年8千人が全国に81ある大学医学部を卒業してゆく");
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
                if(translateCount == 2) {
                    sendTranslate();
                }
            }
        });
        mMaterialDialog.show();
    }

    @OnLongClick(R.id.frame_3)
    boolean transLate3() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.translate_edit, null);
        TextView explain = (TextView) view.findViewById(R.id.explain);
        explain.setText("君たちはその8千人のトップの80人である！");
        ButtonRectangle okButton = (ButtonRectangle) view.findViewById(R.id.buttonRectangle);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setView(view);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMaterialDialog.dismiss();
                translateCount++;
                if(translateCount == 2) {
                    sendTranslate();
                }
            }
        });
        mMaterialDialog.show();
        return true;
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

    public void sendTranslate() {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.confirm_dialog, null);
        final MaterialDialog mMaterialDialog = new MaterialDialog(getActivity())
                .setTitle("送信")
                .setView(view);
        mMaterialDialog
                .setNegativeButton("cancel", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mMaterialDialog.dismiss();
                    }
                })
                .setPositiveButton("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mMaterialDialog.dismiss();
                        Toast.makeText(getActivity(), "翻訳した内容を送信しました。", Toast.LENGTH_LONG).show();
                    }
                }).show();
    }

}

