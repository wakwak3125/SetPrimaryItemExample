package com.wakwak.setprimaryitemexample.java;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wakwak.setprimaryitemexample.R;

/**
 * Created by Ryo on 2018/01/17.
 */

public class JavaPageFragment extends Fragment {

    public static JavaPageFragment newInstance(int page) {

        Bundle args = new Bundle();

        JavaPageFragment fragment = new JavaPageFragment();
        args.putString("page", String.valueOf(page));
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView text = view.findViewById(R.id.page_position);
        if (getArguments() != null) {
            text.setText(getArguments().getString("page"));
        }
    }
}
