package com.ourcomics.ourcomics.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ourcomics.ourcomics.R;

/**
 * Created by atsuhirotsuruta on 15/03/21.
 */
public class GridListViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private String[] mHueArray = {
            "ブラックジャックによろしく", "ブラックジャックによろしく","ブラックジャックによろしく","ブラックジャックによろしく","ブラックジャックによろしく",
            "ブラックジャックによろしく","ブラックジャックによろしく","ブラックジャックによろしく","ブラックジャックによろしく","ブラックジャックによろしく",
            "ブラックジャックによろしく","ブラックジャックによろしく","ブラックジャックによろしく"
    };

    private String[] storyArray = {
            "1話", "2話", "3話", "4話","5話",
            "6話", "7話", "8話", "9話","10話",
            "11話", "12話", "13話"

    };

    private String[] infoArray = {
            "佐藤秀峰","佐藤秀峰","佐藤秀峰","佐藤秀峰","佐藤秀峰",
            "佐藤秀峰","佐藤秀峰","佐藤秀峰","佐藤秀峰","佐藤秀峰",
            "佐藤秀峰","佐藤秀峰","佐藤秀峰"
    };


    private Integer[] mHueIdArray = {
            R.drawable.bla
    };
    private static class ViewHolder {
        public ImageView iconView;
        public TextView titleTextView;
        public TextView story;
        public TextView info;
    }

    public GridListViewAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return mHueArray.length;
    }

    public Object getItem(int position) {
        return mHueArray[position];
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.home_indiv_layout, null);
            holder = new ViewHolder();
            holder.iconView = (ImageView)convertView.findViewById(R.id.icon);
            holder.titleTextView = (TextView)convertView.findViewById(R.id.title);
            holder.story = (TextView) convertView.findViewById(R.id.story_num);
            holder.info = (TextView) convertView.findViewById(R.id.story_info);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }


        holder.iconView.setImageResource(mHueIdArray[0]);
        holder.titleTextView.setText(mHueArray[position]);
        holder.story.setText(storyArray[position]);
        holder.info.setText(infoArray[position]);

        return convertView;
    }
}