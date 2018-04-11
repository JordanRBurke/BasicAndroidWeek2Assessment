package com.example.rodneytressler.week2assessment;

import android.accounts.*;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by rodneytressler on 12/14/17.
 */

public class WelcomeFragment extends Fragment {

    @BindView(R.id.welcome_text)
    protected TextView welcomeText;

    @BindView(R.id.instruction_text)
    protected TextView instructionsText;
    private WelcomeFragment welcomeFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        ButterKnife.bind(this, view);
        return view;

    }

    public static WelcomeFragment newInstance() {

        Bundle args = new Bundle();

        WelcomeFragment fragment = new WelcomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onResume() {
        super.onResume();
        Fragment getFragment = new WelcomeFragment();
        Bundle bundleBundle = new Bundle();

//        bundleBundle.putParcelable("WELCOME_INFO" , Account);
//        welcomeFragment.getArguments();
        Bundle bundle2 = this.getArguments();


    }
}
