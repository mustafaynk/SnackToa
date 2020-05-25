package muyan.snacktoa.example;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import muyan.snacktoa.SnackToa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMethod(View view) {
        switch (view.getId()) {
            case R.id.toastError:
                SnackToa.toastError(MainActivity.this, "Error Toast");
                break;
            case R.id.toastInfo:
                SnackToa.toastInfo(MainActivity.this, "Info Toast");
                break;
            case R.id.toastSuccess:
                SnackToa.toastSuccess(MainActivity.this, "Success Toast");
                break;
            case R.id.snackbarError:
                SnackToa.snackBarError(MainActivity.this, "Error Snackbar");
                break;
            case R.id.snackbarInfo:
                SnackToa.snackBarInfo(MainActivity.this, "Info Snackbar");
                break;
            case R.id.snackbarSuccess:
                SnackToa.snackBarSuccess(MainActivity.this, "Success Snackbar");
                break;
            case R.id.snackbarFloating:
                SnackToa.snackBarFloating(findViewById(android.R.id.content), MainActivity.this, "Floating Snackbar", new SnackToa.snackbarUndoClick() {
                    @Override
                    public void onClick(View v) {
                        SnackToa.toastInfo(MainActivity.this, "Undo Clicked");
                    }
                });
                break;
        }
    }
}
