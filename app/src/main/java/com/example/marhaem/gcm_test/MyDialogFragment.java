package com.example.marhaem.gcm_test;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by marhaem on 023, 23.02..
 */
public class MyDialogFragment extends DialogFragment
{
    public MyDialogFragment(){}

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        int title = getArguments().getInt("title");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);
        builder.setMessage("Some message here");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
            }
        });
        return builder.create();
    }

    public static MyDialogFragment newInstance(int title)
    {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        Bundle args = new Bundle();
        args.putInt("title", title);
        dialogFragment.setArguments(args);
        return dialogFragment;
    }

    public void showDialog()
    {
        MyDialogFragment Fragment = MyDialogFragment.newInstance(R.string.dialogTitle);
        Fragment.show(getFragmentManager(), "dialog");
    }
}
