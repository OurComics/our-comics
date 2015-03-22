package com.ourcomics.ourcomics.model;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.ourcomics.ourcomics.R;
import com.ourcomics.ourcomics.activity.MainActivity;
import com.ourcomics.ourcomics.activity.MainActivity2Activity;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * Created by atsuhirotsuruta on 15/03/22.
 */
public class GridListViewCard extends Card {

    protected TextView mTitle;
    protected TextView mSecondaryTitle;
    protected RatingBar mRatingBar;
    protected TextView info;
    protected TextView story;
    protected ImageView iconView;
    protected String position;
    protected int[] imageViewId =
            {R.drawable.bj_1,
                    R.drawable.bj_2,
                    R.drawable.bj_3,
                    R.drawable.bj_4,
                    R.drawable.bj_5,
                    R.drawable.bj_6,
                    R.drawable.bj_7,
                    R.drawable.bj_8,
                    R.drawable.bj_9,
                    R.drawable.bj_10,
                    R.drawable.bj_11,
                    R.drawable.bj_12,
                    R.drawable.bj_13,
                    R.drawable.bj_11,
                    R.drawable.bj_12,
                    R.drawable.bj_13};


    private String[] storyArray = {
            "1話", "2話", "3話", "4話", "5話",
            "6話", "7話", "8話", "9話", "10話",
            "11話", "12話", "13話"

    };

    private String[] infoArray = {
            "佐藤秀峰", "佐藤秀峰", "佐藤秀峰", "佐藤秀峰", "佐藤秀峰",
            "佐藤秀峰", "佐藤秀峰", "佐藤秀峰", "佐藤秀峰", "佐藤秀峰",
            "佐藤秀峰", "佐藤秀峰", "佐藤秀峰"
    };

    /**
     * Constructor with a custom inner layout
     *
     * @param context
     */
    public GridListViewCard(Context context) {
        this(context, R.layout.home_indiv_layout);
    }

    /**
     * @param context
     * @param innerLayout
     */
    public GridListViewCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    public GridListViewCard(Context context, String position) {
        super(context, R.layout.home_indiv_layout);
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
        int position1 = Integer.parseInt(position) - 1;

        //Retrieve elements
        mTitle = (TextView) parent.findViewById(R.id.title);
        iconView = (ImageView) parent.findViewById(R.id.icon);

        story = (TextView) parent.findViewById(R.id.story_num);
        info = (TextView) parent.findViewById(R.id.story_info);
        iconView.setImageDrawable(mContext.getResources().getDrawable(imageViewId[position1]));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, MainActivity.class);
                mContext.startActivity(intent);
            }
        });

        mTitle.setText("ブラックジャックによろしく" + position + "巻");

        story.setVisibility(View.GONE);
        info.setText(infoArray[position1]);

    }
}
