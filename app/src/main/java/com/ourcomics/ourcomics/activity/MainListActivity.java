package com.ourcomics.ourcomics.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.balysv.materialmenu.MaterialMenu;
import com.balysv.materialmenu.MaterialMenuDrawable;
import com.ourcomics.ourcomics.R;
import com.ourcomics.ourcomics.model.GridListViewCard;
import com.ourcomics.ourcomics.model.GridViewCard;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardGridArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardGridView;

public class MainListActivity extends ActionBarActivity {
    private DrawerLayout mDrawerLayout;
    private String[] mTitles;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawer;
    private MaterialMenuDrawable materialMenu;
    private boolean isDrawerOpened;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        // ツールバーをアクションバーとしてセット
        setSupportActionBar(toolbar);
        mTitles = getResources().getStringArray(R.array.drawer_item);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Set the adapter for the list view

        View headerView = getLayoutInflater().inflate(R.layout.home_drawer, null);
        mDrawerList.addHeaderView(headerView);
        mDrawerList.setAdapter(new AdapterClass(this, mTitles));
        // Set the list's click listener

        materialMenu = new MaterialMenuDrawable(this, Color.WHITE, MaterialMenuDrawable.Stroke.THIN);
        toolbar.setNavigationIcon(materialMenu);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, toolbar,
                R.string.open, R.string.open) {
            @Override
            public void onDrawerClosed(View drawerView) {
                isDrawerOpened = false;
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                isDrawerOpened = true;
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                // ActionBarDrawerToggleクラス内の同メソッドにてアイコンのアニメーションの処理をしている。
                // overrideするときは気を付けること。
                super.onDrawerSlide(drawerView, slideOffset);
                materialMenu.setTransformationOffset(
                        MaterialMenuDrawable.AnimationState.BURGER_ARROW,
                        isDrawerOpened ? 2 - slideOffset : slideOffset
                );
            }

            @Override
            public void onDrawerStateChanged(int newState) {
                // 表示済み、閉じ済みの状態：0
                // ドラッグ中状態:1
                // ドラッグを放した後のアニメーション中：2
            }
        };
        mDrawer.setDrawerListener(mDrawerToggle);
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerToggle.setHomeAsUpIndicator(R.drawable.home);
        ArrayList<Card> cards = new ArrayList<Card>();

        for (int i = 0; i < 12; i++) {
            //Create a Card
            GridListViewCard card = new GridListViewCard(this, String.valueOf(i + 1));

            //Create a CardHeader
            CardHeader header = new CardHeader(this);
            //Add Header to card
            card.addCardHeader(header);
            cards.add(card);
        }

        CardGridArrayAdapter mCardArrayAdapter = new CardGridArrayAdapter(this,cards);

        CardGridView gridView = (CardGridView) findViewById(R.id.myGrid);
        if (gridView!=null){
            gridView.setAdapter(mCardArrayAdapter);
        }
    }

    public class AdapterClass extends ArrayAdapter<String> {
        Context context;
        private String[] TextValue;
        private int[] imageResource = new int[]{
                R.drawable.home,
                R.drawable.chart,
                R.drawable.icon07,
                R.drawable.arrow,
                R.drawable.bitcoin,
                R.drawable.yen,
                R.drawable.comments,
                R.drawable.settings
        };

        public AdapterClass(Context context, String[] TextValue) {
            super(context, R.layout.text_view, TextValue);
            this.context = context;
            this.TextValue = TextValue;
        }


        @Override
        public View getView(final int position, View coverView, ViewGroup parent) {
            // TODO Auto-generated method stub

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.text_view,
                    parent, false);
            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    selectItem(position + 1);
                }
            });

            ImageView icon = (ImageView) rowView.findViewById(R.id.menu_icon);
            if (position < 8) {
                icon.setImageDrawable(getResources().getDrawable(imageResource[position]));
            }
            TextView text1 = (TextView) rowView.findViewById(android.R.id.text1);
            text1.setText(TextValue[position]);

            return rowView;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void selectItem(int position) {
        // Create a new fragment and specify the planet to show based on position

        // Highlight the selected item, update the title, and close the drawer

        switch (position) {
            case 1:
                break;
            case 2:
                Intent intent = new Intent(this, TranslatedActivity.class);
                startActivity(intent);
                break;
            case 3:
                break;
            case 4:
            default:
                return;
        }
    }
}
