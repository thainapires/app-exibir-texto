package com.thaina.exibirfrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    String frase1, frase2, frase3;
    Button btn;
    TextView fra1, fra2, fra3;
    ImageView img;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fra1 = (TextView) findViewById(R.id.textView2);
        fra2 = (TextView) findViewById(R.id.textView3);
        fra3 = (TextView) findViewById(R.id.textView4);
        btn = (Button) findViewById(R.id.button2);
    }
    public void btnClicked(View v){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myFirebaseRef = database.getInstance().getReference();
        myFirebaseRef.child("Salute/EN").addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                frase1 = dataSnapshot.getValue(String.class);
                fra1.setText(frase1);
                img = (ImageView)findViewById(R.id.usaFlag1);
                img.setVisibility(View.VISIBLE);
                img = (ImageView)findViewById(R.id.usaFlag2);
                img.setVisibility(View.VISIBLE);
            }

            public void onCancelled(DatabaseError error) {

            }
        });
        myFirebaseRef.child("Salute/ES").addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                frase2 = dataSnapshot.getValue(String.class);
                fra2.setText(frase2);
                img = (ImageView)findViewById(R.id.espFlag1);
                img.setVisibility(View.VISIBLE);
                img = (ImageView)findViewById(R.id.espFlag2);
                img.setVisibility(View.VISIBLE);

            }

            public void onCancelled(DatabaseError error) {

            }
        });
        myFirebaseRef.child("Salute/PT-BR").addValueEventListener(new ValueEventListener() {
            public void onDataChange(DataSnapshot dataSnapshot) {
                frase3 = dataSnapshot.getValue(String.class);
                fra3.setText(frase3);
                img = (ImageView)findViewById(R.id.brFlag1);
                img.setVisibility(View.VISIBLE);
                img = (ImageView)findViewById(R.id.brFlag2);
                img.setVisibility(View.VISIBLE);

            }

            public void onCancelled(DatabaseError error) {

            }
        });
    }

}

