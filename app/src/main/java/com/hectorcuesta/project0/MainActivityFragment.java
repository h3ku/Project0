package com.hectorcuesta.project0;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Hector Cuesta Garcia
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        return view;
    }


    //Define the listeners of the buttons.

    @OnClick(R.id.btnSpotify)
    public void onClickSpotifyStreamer() {
        Toast toast = Toast.makeText(
                getContext(),
                "This open Spotify Streamer App.",
                Toast.LENGTH_LONG);
        toast.show();
    }

    @OnClick(R.id.btnScores)
    public void onClickScoresApp() {
        Toast toast = Toast.makeText(
                getContext(),
                "This open Scores App.",
                Toast.LENGTH_LONG);
        toast.show();
    }

    @OnClick(R.id.btnLibrary)
    public void onClickLibraryApp() {
        Toast toast = Toast.makeText(
                getContext(),
                "This open Library App.",
                Toast.LENGTH_LONG);
        toast.show();
    }

    @OnClick(R.id.btnBuildItBigger)
    public void onclickBuildItBigger() {
        Toast toast = Toast.makeText(
                getContext(),
                "This open Build It Bigger App.",
                Toast.LENGTH_LONG);
        toast.show();
    }

    @OnClick(R.id.btnXYZ)
    public void onClickXYZReader() {
        Toast toast = Toast.makeText(
                getContext(),
                "This open XYZ Reader App.",
                Toast.LENGTH_LONG);
        toast.show();
    }

    @OnClick(R.id.btnCapstone)
    public void onClickCapstone() {
        Toast toast = Toast.makeText(
                getContext(),
                "This open Capstone App.",
                Toast.LENGTH_LONG);
        toast.show();
    }
}
