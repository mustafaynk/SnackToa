package muyan.snacktoa;

import android.app.Activity;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SnackToa {

    public static void snackBarSuccess(Activity activity, String message) {
        View parent_view = activity.findViewById(android.R.id.content);
        final Snackbar snackbar = Snackbar.make(parent_view, "", Snackbar.LENGTH_SHORT);
        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.snackbar_icon_text, null);

        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackBarView = (Snackbar.SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);

        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_done);
        (custom_view.findViewById(R.id.parent_view)).setBackgroundColor(activity.getResources().getColor(R.color.green_500));
        snackBarView.addView(custom_view, 0);
        snackbar.show();
    }

    public static void snackBarInfo(Activity activity, String message) {
        View parent_view = activity.findViewById(android.R.id.content);
        final Snackbar snackbar = Snackbar.make(parent_view, "", Snackbar.LENGTH_SHORT);
        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.snackbar_icon_text, null);

        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackBarView = (Snackbar.SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);

        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error_outline);
        (custom_view.findViewById(R.id.parent_view)).setBackgroundColor(activity.getResources().getColor(R.color.blue_500));
        custom_view.bringToFront();
        snackBarView.addView(custom_view, 0);
        snackbar.show();
    }

    public static void snackBarError(Activity activity, String message) {
        View parent_view = activity.findViewById(android.R.id.content);
        final Snackbar snackbar = Snackbar.make(parent_view, "", Snackbar.LENGTH_LONG);
        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.snackbar_icon_text, null);

        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackBarView = (Snackbar.SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);

        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_close);
        (custom_view.findViewById(R.id.parent_view)).setBackgroundColor(activity.getResources().getColor(R.color.red_600));
        snackBarView.addView(custom_view, 0);
        snackbar.show();
    }

    public static void toastInfo(Activity activity, String message) {
        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error_outline);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(activity.getResources().getColor(R.color.blue_500));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toastInfo(Activity activity, String message, int duration) {
        Toast toast = new Toast(activity);
        toast.setDuration(duration);
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_error_outline);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(activity.getResources().getColor(R.color.blue_500));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toastError(Activity activity, String message) {
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_close);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(activity.getResources().getColor(R.color.red_600));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toastError(Activity activity, String message, int duration) {
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(duration);
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_close);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(activity.getResources().getColor(R.color.red_600));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toastSuccess(Activity activity, String message) {
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_done);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(activity.getResources().getColor(R.color.green_500));

        toast.setView(custom_view);
        toast.show();
    }

    public static void toastSuccess(Activity activity, String message, int color) {
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(R.drawable.ic_done);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(color);

        toast.setView(custom_view);
        toast.show();
    }

    public static void toastSuccess(Activity activity, String message, int color, int image) {
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);

        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.toast_icon_text, null);
        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        ((ImageView) custom_view.findViewById(R.id.icon)).setImageResource(image);
        ((CardView) custom_view.findViewById(R.id.parent_view)).setCardBackgroundColor(color);

        toast.setView(custom_view);
        toast.show();
    }

    public static void snackBarFloating(View parent_view, Activity activity, String message) {
        final Snackbar snackbar = Snackbar.make(parent_view, "", Snackbar.LENGTH_LONG);
        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.snackbar_toast_floating, null);

        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackBarView = (Snackbar.SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);
        (custom_view.findViewById(R.id.tv_undo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });

        snackBarView.addView(custom_view, 0);
        snackbar.show();
    }

    public static void snackBarFloating(View parent_view, Activity activity, String message, final snackbarUndoClick snackbarUndoClick) {
        final Snackbar snackbar = Snackbar.make(parent_view, "", Snackbar.LENGTH_LONG);
        //inflate view
        View custom_view = activity.getLayoutInflater().inflate(R.layout.snackbar_toast_floating, null);

        ((TextView) custom_view.findViewById(R.id.message)).setText(message);
        snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
        Snackbar.SnackbarLayout snackBarView = (Snackbar.SnackbarLayout) snackbar.getView();
        snackBarView.setPadding(0, 0, 0, 0);
        (custom_view.findViewById(R.id.tv_undo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbarUndoClick.onClick(v);
                snackbar.dismiss();
            }
        });

        snackBarView.addView(custom_view, 0);
        snackbar.show();
    }

    public interface snackbarUndoClick {
        void onClick(View v);
    }

}
