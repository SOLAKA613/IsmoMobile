package fs.tetouan.ismo.com.accueil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fs.tetouan.ismo.com.R;
import fs.tetouan.ismo.com.stagiaire.StagiaireActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Filiere extends Fragment {

    public Filiere() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.acc_fragment_filiere, container, false);

         return view;
    }
}
