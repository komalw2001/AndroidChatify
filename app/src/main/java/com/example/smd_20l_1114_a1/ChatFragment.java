package com.example.smd_20l_1114_a1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ChatFragment extends ListFragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    public ChatFragment()
    {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<String> names = new ArrayList<>();
        names.add("Chat 1");
        names.add("Chat 2");
        names.add("Chat 3");
        names.add("Chat 4");
        names.add("Chat 5");
        names.add("Chat 6");
        names.add("Chat 7");
        names.add("Chat 8");
        names.add("Chat 9");
        names.add("Chat 10");
        names.add("Chat 11");
        names.add("Chat 12");
        names.add("Chat 13");
        names.add("Chat 14");
        names.add("Chat 15");
        names.add("Chat 16");
        names.add("Chat 17");
        names.add("Chat 18");
        names.add("Chat 19");
        names.add("Chat 20");

        setListAdapter(new ArrayAdapter<String>(requireActivity(), android.R.layout.simple_dropdown_item_1line, names));

    }
}