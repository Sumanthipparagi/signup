import .AppCompatActivity; import .Intent;
import .Bundle;
import .View; import .Button; import .EditText; import .Toast;
public class LoginActivity extends AppCompatActivity { EditText emailEditText, passwordEditText;
Button loginBtn; @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_login); emailEditText = findViewById(R.id.emailEditText);
passwordEditText = findViewById(R.id.passwordEditText); loginBtn = findViewById(R.id.loginBtn);
String registeredEmail = getIntent().getStringExtra("email");
String registeredPassword = getIntent().getStringExtra("password"); loginBtn.setOnClickListener(new View.OnClickListener() { @Override
public void onClick(View v) {
String email = emailEditText.getText().toString();
String password = passwordEditText.getText().toString();
if (registeredEmail.equals(email) && registeredPassword.equals(passwor d)) {
Intent intent = new Intent(LoginActivity.this, LoginSuccessActivit y.class);
startActivity(intent);
} else {
Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LE NGTH_SHORT).show();
}
}
});
}
}