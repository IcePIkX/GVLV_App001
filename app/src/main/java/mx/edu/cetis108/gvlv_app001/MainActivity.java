package mx.edu.cetis108.gvlv_app001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSaludar_click(View v)
    {
        TextView lblSaludo = (TextView) findViewById(R.id.lblSaludo);
        EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        lblSaludo.setText("Hola " +txtNombre.getText() +"");
    }

}
