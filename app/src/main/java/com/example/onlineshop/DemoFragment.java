package com.example.onlineshop;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DemoFragment extends Fragment {
    Context context;

    public DemoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view;

//        Log.wtf("log",getArguments().getInt("message") + "");

        switch (getArguments().getInt("message")){
            case 1:
            {
                view = inflater.inflate(R.layout.fragment_demo_1, container, false);


                return view;
            }

            case 2:
            {
                view = inflater.inflate(R.layout.fragment_demo_2, container, false);

                return view;
            }

            case 3:
            {
                view = inflater.inflate(R.layout.fragment_demo_3, container, false);
                return view;
            }

            default:
            {
                view = inflater.inflate(R.layout.fragment_demo_error, container, false);

                int p=3;
                return view;
            }
        }
//        View view = inflater.inflate(R.layout.fragment_demo_2, container, false);
//        textView = view.findViewById(R.id.txt_display);
//        textView.setText(getArguments().getString("message"));
//        return view;
    }

}
