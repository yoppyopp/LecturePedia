package com.pure.lpedia;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter_CardItem_Oomx extends ArrayAdapter<Item_CardList_Oomx> {

    Context context;
    int resLayout;
    List<Item_CardList_Oomx> listCardItems;

    public Adapter_CardItem_Oomx(Context context, int resLayout, List<Item_CardList_Oomx> listCardItems) {
        super(context, resLayout, listCardItems);

        this.context = context;
        this.resLayout = resLayout;
        this.listCardItems = listCardItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(context, resLayout, null);

        TextView title = (TextView) v.findViewById(R.id.card_title_oomx);
        TextView Date = (TextView) v.findViewById(R.id.card_date_oomx);

        Item_CardList_Oomx cardItem = listCardItems.get(position);

        title.setText(cardItem.getCardTitle());
        Date.setText(cardItem.getCardDate());

        return v;
    }
}