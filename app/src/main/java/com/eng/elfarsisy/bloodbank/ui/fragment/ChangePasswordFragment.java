package com.eng.elfarsisy.bloodbank.ui.fragment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.eng.elfarsisy.bloodbank.R;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChangePasswordFragment extends Fragment {


    EditText verficationcode;
    EditText newPassword;
    EditText confirmnewpassword;
    Button changepasswordBtn;

    public ChangePasswordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_change_password, container, false);
        verficationcode = view.findViewById(R.id.verficationcode);
        newPassword = view.findViewById(R.id.newpassword);
        confirmnewpassword = view.findViewById(R.id.confirmnewpassword);
        changepasswordBtn = view.findViewById(R.id.changepasswordbtn);
        changepasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(container.getContext()).setTitle("Are you sure").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
           builder.create().show();
            }
        });


        return view;
    }

}
//        changepasswordBtn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        String veficationCode = verficationcode.getText().toString();
//        String NewPassword = newPassword.getText().toString();
//        String Newpassword2 = confirmnewpassword.getText().toString();
//
//        if (!TextUtils.isEmpty(veficationCode) && !TextUtils.isEmpty(NewPassword) && TextUtils.equals(NewPassword, Newpassword2)) {
//        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
//        dialog.setTitle("Are you sure").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialogInterface, int i) {
//        dialogInterface.dismiss();
//        }
//        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialogInterface, int i) {
//        dialogInterface.cancel();
//        }
//        });
//
//        } else {
//        Toast.makeText(container.getContext(), "empty field", Toast.LENGTH_SHORT).show();
//        }
//        }
//        });