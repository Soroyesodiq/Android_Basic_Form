package com.example.androidbasicui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidbasicui.fragment.DemoFragment;

public class OutPutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_put);
        TextView output=findViewById(R.id.output);
        Bundle bundle=getIntent().getExtras();
        String data_output=bundle.getString("output_data");
        //String data_output=getIntent().getStringExtra("output_data");
        output.setText(data_output);

        DemoFragment demoFragment=new DemoFragment();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        Bundle bundle1=new Bundle();
        bundle1.putString("output_data_fragment",data_output);
        demoFragment.setArguments(bundle1);
        fragmentTransaction.add(R.id.container_fragment,demoFragment);
        fragmentTransaction.commit();

        //now let's pass data to fragment

    }
}
