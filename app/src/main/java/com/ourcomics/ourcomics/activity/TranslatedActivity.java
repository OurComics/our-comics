package com.ourcomics.ourcomics.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;

import com.ourcomics.ourcomics.R;
import com.ourcomics.ourcomics.model.GridListViewCard;
import com.ourcomics.ourcomics.model.TranslatedGridViewCard;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardGridArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardGridView;

public class TranslatedActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translated);
        ArrayList<Card> cards = new ArrayList<Card>();


        TranslatedGridViewCard card = new TranslatedGridViewCard(this);

        //Create a CardHeader
        CardHeader header = new CardHeader(this);
        //Add Header to card
        card.addCardHeader(header);
        cards.add(card);

        CardGridArrayAdapter mCardArrayAdapter = new CardGridArrayAdapter(this, cards);

        CardGridView gridView = (CardGridView) findViewById(R.id.myGrid);
        if (gridView != null) {
            gridView.setAdapter(mCardArrayAdapter);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_translated, menu);
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
}
