package com.helloappsti22a4;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class Tabfragment3Activity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_3, container, false);

        ImageView imgMovie1 = rootView.findViewById(R.id.imgMovie);
        ImageView imgMovie2 = rootView.findViewById(R.id.imgMovie2);
        ImageView imgMovie3 = rootView.findViewById(R.id.imgMovie3);

        imgMovie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startExoplayerActivity("bora");
            }
        });

        imgMovie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startExoplayerActivity("century");
            }
        });

        imgMovie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startExoplayerActivity("demon");
            }
        });

        return rootView;
    }
    private void startExoplayerActivity(String videoInfo) {
        Intent intent = new Intent(getActivity(), Exoplayer1Activity.class);
        intent.putExtra("videoInfo", videoInfo);
        startActivity(intent);
    }

}
