package com.example.rodneytressler.week2assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.input_name)
    protected EditText inputName;
    @BindView(R.id.input_email)
    protected EditText inputEmail;
    @BindView(R.id.button_register)
    protected Button registerButton;
    private WelcomeFragment welcomeFragment;
    public static final String WELCOME_INFO = "welcome_info";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void toastRegistrationFailure() {
        Toast.makeText(this, "Please enter all fields first!", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_register)
    protected void registerButtonCLick() {

        String finalName = inputName.getText().toString();
        String finalEmail = inputEmail.getText().toString();
        Account account = new Account(finalName, finalEmail);

        if (finalName == "") {
            toastRegistrationFailure();
        } else if (finalEmail == "") {
            toastRegistrationFailure();
        } else if (finalName == null) {
            toastRegistrationFailure();
        } else if (finalEmail == null) {
            toastRegistrationFailure();
        }

        welcomeFragment = WelcomeFragment.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, welcomeFragment).commit();
        Bundle bundle = new Bundle();
        bundle.putParcelable(WELCOME_INFO, account);
        welcomeFragment.setArguments(bundle);
    }
}
