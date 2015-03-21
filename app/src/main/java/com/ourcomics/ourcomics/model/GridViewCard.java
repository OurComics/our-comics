package com.ourcomics.ourcomics.model;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ourcomics.ourcomics.R;
import com.ourcomics.ourcomics.activity.MainActivity2Activity;

import java.util.zip.Inflater;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class GridViewCard extends Card {

    protected TextView mTitle;
    protected TextView mSecondaryTitle;
    protected RatingBar mRatingBar;
    protected ImageView iconView;
    protected String position;
    protected int[] imageViewId =
            { R.drawable.bj_1,
            R.drawable.bj_2,
            R.drawable.bj_3,
            R.drawable.bj_4};
    /**
     * Constructor with a custom inner layout
     * @param context
     */
    public GridViewCard(Context context) {
        this(context, R.layout.home_indiv_layout);
    }

    /**
     *
     * @param context
     * @param innerLayout
     */
    public GridViewCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    public GridViewCard(Context context, String position) {
        super(context, R.layout.home_indiv_layout);
        this.position = position;
    }
    /**
     * Init
     */
    private void init(){

        //No Header

        //Set a OnClickListener listener
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        //Retrieve elements
        mTitle = (TextView) parent.findViewById(R.id.title);
        iconView = (ImageView) parent.findViewById(R.id.icon);
        iconView.setImageDrawable(mContext.getResources().getDrawable(imageViewId[0]));
        view. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, MainActivity2Activity.class);
                mContext.startActivity(intent);
            }});

        mTitle.setText("ブラックジャックによろしく" +  position + "巻");

    }
}