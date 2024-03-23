package com.example.smd_20l_1114_a1;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    TextView tvUsername, tvName, tvBio;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvUsername = view.findViewById(R.id.tvUsername);
        tvName = view.findViewById(R.id.tvName);
        tvBio = view.findViewById(R.id.tvBio);

        SharedPreferences sPref = requireActivity(). getSharedPreferences("Signup", requireActivity().MODE_PRIVATE);
        tvUsername.setText(sPref.getString("username","username"));
        tvName.setText(sPref.getString("name","Full Name"));
        tvBio.setText("Hello this is my bio!\n"+sPref.getString("gender","")+"\n"+sPref.getString("email",""));
    }
}