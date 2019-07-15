package com.example.mohit.interfragmentcommunication14;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    @Override
    public void respond(String message) {
        FragmentTwo fragmentTwo = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.fragtwo);
        fragmentTwo.getData(message);
    }
}
