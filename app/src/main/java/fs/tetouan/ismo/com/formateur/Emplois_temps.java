package fs.tetouan.ismo.com.formateur;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fs.tetouan.ismo.com.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Emplois_temps extends Fragment {

    public Emplois_temps() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.for_fragment_emplois_temps, container, false);
    }
}