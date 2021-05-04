package fs.tetouan.ismo.com;

import android.os.Bundle;

import androidx.navigation.ui.AppBarConfiguration;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //navigation between fragment
        //getSupportFragmentManager().beginTransaction().replace(R.id.main_activity, new Accueil_Stagiaire()).commit();

    }

}
