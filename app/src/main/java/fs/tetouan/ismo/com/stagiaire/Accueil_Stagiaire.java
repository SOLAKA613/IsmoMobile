package fs.tetouan.ismo.com.stagiaire;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import fs.tetouan.ismo.com.R;
import fs.tetouan.ismo.com.formateur.FormateurActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class Accueil_Stagiaire extends Fragment {

    private Button button;

    public Accueil_Stagiaire() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.sta_fragment_accueil, container, false);
        button = view.findViewById(R.id.buttonStagiaire);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), FormateurActivity.class));
            }

        });

        return view;
    }
}
