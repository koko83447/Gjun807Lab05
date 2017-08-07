package com.example.android.lab05_CourtCounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment {
    private TextView m_tv_team_name;
    private TextView m_tv_team_score;


    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }
    @Override
    public void onStart(){
        super.onStart();

        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_tema_name);
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_tema_score);
    }

}
