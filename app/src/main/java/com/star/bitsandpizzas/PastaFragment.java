package com.star.bitsandpizzas;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class PastaFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.pasta)
        );

        setListAdapter(arrayAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
