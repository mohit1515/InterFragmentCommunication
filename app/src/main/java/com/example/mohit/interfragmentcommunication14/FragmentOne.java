package com.example.mohit.interfragmentcommunication14;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {
    Button btnclk;
    int count = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container , false);

        btnclk = view.findViewById(R.id.btnsub);

        btnclk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Communicator communicator = (Communicator) getActivity();

                communicator.respond("Button 1 is clicked "+count+" times");
            }
        });
        return view;
    }




}
