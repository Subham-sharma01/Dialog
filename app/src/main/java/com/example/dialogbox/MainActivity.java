package com.example.dialogbox;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main);

//             Create the AlertDialog
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Terms and conditions");
            alertDialog.setMessage("have you red the aggrement");
            alertDialog.setIcon(R.drawable.baseline_sms_24);

            // Set the single button
            alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // Handle button click (e.g., dismiss the dialog)
                    dialog.dismiss();
                }
            });
            AlertDialog alertDialog1=new AlertDialog.Builder(MainActivity.this).create();
            alertDialog1.setTitle("Delete");
            alertDialog1.setIcon(R.drawable.baseline_delete_24);
            alertDialog1.setMessage("are you shure you want to deete");
            alertDialog1.setButton(DialogInterface.BUTTON_POSITIVE, "yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Yes clicked", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog1.setButton(DialogInterface.BUTTON_NEGATIVE, "no", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "no clicked", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog1.setButton(DialogInterface.BUTTON_NEUTRAL, "cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "cancel clicked", Toast.LENGTH_SHORT).show();
                }
            });

            // Show the AlertDialog
            alertDialog.show();


            // Show the AlertDialog1
            alertDialog1.show();
        }
    }
