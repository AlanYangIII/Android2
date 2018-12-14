package com.example.alanyang.android2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentX extends Fragment {
    View BaseView;
    ImageView Image;
    int resID;

    public void setData(int resId) {
        this.resID = resId;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        BaseView = inflater.inflate(R.layout.first_layout, container, false);
        Image = BaseView.findViewById(R.id.ImageView1);
        Image.setImageResource(resID);
        return BaseView;

    }
}
