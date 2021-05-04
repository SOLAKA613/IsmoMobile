package fs.tetouan.ismo.com.stagiaire;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fs.tetouan.ismo.com.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EmploisTemps extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    public EmploisTemps() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.sta_fragment_emplois_temps, container, false);
    }
}
