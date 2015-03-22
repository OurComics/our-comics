package com.ourcomics.ourcomics.model;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.ourcomics.ourcomics.R;
import com.ourcomics.ourcomics.activity.MainActivity2Activity;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * Created by atsuhirotsuruta on 15/03/22.
 */
public class TranslatedGridViewCard extends Card {

    protected TextView mTitle;
    protected TextView mSecondaryTitle;
    protected RatingBar mRatingBar;
    protected TextView info;
    protected TextView story;
    protected ImageView iconView;
    protected String position;
    /**
     * Constructor with a custom inner layout
     *
     * @param context
     */
    public TranslatedGridViewCard(Context context) {
        this(context, R.layout.translated_item);
    }

    /**
     * @param context
     * @param innerLayout
     */
    public TranslatedGridViewCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    public TranslatedGridViewCard(Context context, String position) {
        super(context, R.layout.translated_item);
        this.position = position;
    }

    /**
     * Init
     */
    private void init() {

        //No Header

        //Set a OnClickListener listener
    }

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        RatingBar ratingBar = (RatingBar) parent.findViewById(R.id.ratingBar);
        ratingBar.setRating(4.5f);
    }
}
