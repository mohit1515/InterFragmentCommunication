package com.example.mohit.interfragmentcommunication14;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {
    TextView txtdata;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_two, container , false);

        txtdata = view.findViewById(R.id.txtdata);
        return view;
    }

    void getData(String msg)
    {
        txtdata.setText(msg);
    }
}
