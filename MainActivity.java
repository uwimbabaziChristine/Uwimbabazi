package gatore.moise.signupapp;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog.Builder;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText Uname,pswd;
    TextView message;
    Button login,regist;


       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uname=(EditText)findViewById(R.id.Uname);
        pswd=(EditText)findViewById(R.id.pswd);
        message=(TextView)findViewById(R.id.message);
           login.setOnClickListener(this);
          regist.setOnClickListener(this);


    }
    public void onClick(View view){
           if(view==regist){

               Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
           }
          if (view==login){
              if(Uname.getText().toString()=="admin" && pswd.getText().toString()=="password"){

                  message.setText("Login Sucess");
              }
              else {
                  message.setText("Invalid");
              }
              }


    }
}
