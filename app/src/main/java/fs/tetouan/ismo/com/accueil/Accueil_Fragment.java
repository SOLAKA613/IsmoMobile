package fs.tetouan.ismo.com.accueil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

import fs.tetouan.ismo.com.R;
import fs.tetouan.ismo.com.formateur.FormateurActivity;
import fs.tetouan.ismo.com.stagiaire.StagiaireActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Accueil_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    private TextView link;
    private TextInputLayout textInputLogin;
    private TextInputLayout textInputPassword;
    private String login;
    private String password;
    private Context context;
    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.acc_fragment_accueil, container, false);


        link = view.findViewById(R.id.linkText);
        //link.setMovementMethod(LinkMovementMethod.getInstance());

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgot();
            }
        });

        textInputLogin = view.findViewById(R.id.idEditlogin);
        textInputPassword = view.findViewById(R.id.idEditpassword);

        button = view.findViewById(R.id.idButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connect();
            }

        });

        return view;

    }

    public void forgot(){
        FragmentTransaction fr=getFragmentManager().beginTransaction();
        fr.replace(R.id.nav_fragment_accueil,new Contacts());
        fr.addToBackStack(null);
        fr.commit();
    }

    private boolean validateLogin() {
        login = textInputLogin.getEditText().getText().toString().trim();
        if (login.isEmpty()) {
            textInputLogin.setError(getString(R.string.login_empty_erreur));
            return false;
        } else if (login.length() > 25) {
            textInputLogin.setError(getString(R.string.login_max_erreur));
            return false;
        } else {
            textInputLogin.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        password = textInputPassword.getEditText().getText().toString().trim();
        if (password.isEmpty()) {
            textInputPassword.setError(getString(R.string.login_empty_erreur));
            return false;
        } else if (password.length() > 25) {
            textInputPassword.setError(getString(R.string.login_max_erreur));
            return false;
        } else {
            textInputPassword.setError(null);
            return true;
        }
    }

    public void connect(){
        if ( !validateLogin() | !validatePassword()) {
            return;
        }

        //Start ProgressBar first (Set visibility VISIBLE)
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                //Starting Write and Read data with URL
                //Creating array for parameters
                String[] field = new String[2];
                field[0] = "login";
                field[1] = "password";
                //Creating array for data
                String[] data = new String[2];
                data[0] = login;
                data[1] = password;
                PutData putData = new PutData("http://192.168.178.24:80/LogIn-SignUp-master/login.php", "POST", field, data);
                System.out.println("putData: " + putData);
                if (putData.startPut()) {
                    if (putData.onComplete()) {
                        String result = putData.getResult();
                        if(result.equals("stagiaire")){
                            Toast.makeText(getActivity(),result,Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getActivity(), StagiaireActivity.class));
                        }else if(result.equals("formateur")){
                            Toast.makeText(getActivity(),result,Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getActivity(), FormateurActivity.class));
                        }else{
                            Toast.makeText(getActivity(),result,Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                //End Write and Read data with URL
            }

        });
    }
}
