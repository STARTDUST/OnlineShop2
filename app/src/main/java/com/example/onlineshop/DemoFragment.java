package com.example.onlineshop;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class DemoFragment extends Fragment {

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
                Button btn = view.findViewById(R.id.btn);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FirebaseAuth.getInstance().signOut();
                        Intent intent = new Intent(view.getContext(),BLoginActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    }
                });

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

            case 4:
            {
                view = inflater.inflate(R.layout.fragment_demo_4, container, false);
                return view;
            }

            case 5:
            {
                view = inflater.inflate(R.layout.fragment_demo_5, container, false);
                return view;
            }


            default:
            {
                view = inflater.inflate(R.layout.fragment_demo_error, container, false);

                return view;
            }
        }
//        View view = inflater.inflate(R.layout.fragment_demo_2, container, false);
//        textView = view.findViewById(R.id.txt_display);
//        textView.setText(getArguments().getString("message"));
//        return view;
    }

}
