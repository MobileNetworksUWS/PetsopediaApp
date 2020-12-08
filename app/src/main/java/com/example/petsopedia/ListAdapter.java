package com.example.petsopedia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> ParentListItem;
    private List<String> Items;

    ListAdapter(Activity context, List<String> Items, Map<String, List<String>> ParentListItem){
        this.context = context;
        this.ParentListItem = ParentListItem;
        this.Items = Items;
    }


    //Title (Parent)
    @Override
    public int getGroupCount() {
        return Items.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return Items.get(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String string = (String) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater != null;
            convertView = layoutInflater.inflate(R.layout.title, null);
        }

        TextView item = convertView.findViewById(R.id.titleText);
        item.setText(string);
        return convertView;
    }

    //Info (Child)
    @Override
    public int getChildrenCount(int groupPosition) {
        return Objects.requireNonNull(ParentListItem.get(Items.get(groupPosition))).size();
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return Objects.requireNonNull(ParentListItem.get(Items.get(groupPosition))).get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childName = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();

        if (convertView == null){
            convertView = inflater.inflate(R.layout.info, null);
        }

        TextView item = convertView.findViewById(R.id.infoText);
        item.setText(childName);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
}
