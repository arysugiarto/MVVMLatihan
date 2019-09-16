package com.arysugiarto.mvvmlatihan.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.arysugiarto.mvvmlatihan.R;
import com.arysugiarto.mvvmlatihan.databinding.ActivityMainBinding;
import com.arysugiarto.mvvmlatihan.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());

        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter({"toastMessage"})
    public static void main(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(),message,Toast.LENGTH_SHORT).show();
    }
}
