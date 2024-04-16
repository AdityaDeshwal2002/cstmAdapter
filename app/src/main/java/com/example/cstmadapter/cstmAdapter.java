package com.example.cstmadapter;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class cstmAdapter extends BaseAdapter {
    private Context context;
    private String[] itemsArray;
    public cstmAdapter(Context context, String[] itemsArray){
        this.context = context;
        this.itemsArray = itemsArray;
    }

    @Override
    public int getCount() {
        return itemsArray.length;
    }

    @Override
    public Object getItem(int position) {
        return itemsArray[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){

            convertView =  LayoutInflater.from(context).inflate(R.layout.cstm_listview_view,parent,false);

            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.ItemmsView);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(itemsArray[position]);
        return convertView;
    }

     static class ViewHolder{
        TextView textView;
    }
}
