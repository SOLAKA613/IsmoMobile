package fs.tetouan.ismo.com.accueil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fs.tetouan.ismo.com.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Parametre extends Fragment {

    public Parametre() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.acc_fragment_parametre, container, false);

        return v;
    }
}
