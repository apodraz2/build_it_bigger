package com.podraza.android.jokedisplay;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class JokeActivityFragment extends Fragment {
    private String joke = null;

    public JokeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(getActivity().getIntent() != null) {
            joke = getActivity().getIntent().getStringExtra("joke");
        }

        View rootView = inflater.inflate(R.layout.fragment_joke, container, false);

        TextView jokeText = (TextView) rootView.findViewById(R.id.joke_display);

        if(joke != null) {
            jokeText.setText(joke);
        } else {
            jokeText.setText("THERE IS NO JOKE HAHAHAHA");
        }



        return rootView;
    }
}
