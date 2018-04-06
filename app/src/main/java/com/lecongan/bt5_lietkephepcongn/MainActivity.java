package com.lecongan.bt5_lietkephepcongn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnTongN;
    private Button btnNhanN;
    private EditText edtN;
    private TextView tvKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN = (EditText) findViewById(R.id.edt_n);
        tvKq = (TextView) findViewById(R.id.tv_kq);
        getBtnTongN();
        getBtnNhanN();
    }

    private void getBtnNhanN() {

        btnNhanN = (Button) findViewById(R.id.btn_nhan);
        btnNhanN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int N = Integer.parseInt(edtN.getText().toString());
                int nhan = 1;
                String chuoi = "";
                for (int i = 1; i <= N; i++) {
                    nhan = nhan * i;
//                    Toast.makeText(MainActivity.this, tong + "", Toast.LENGTH_SHORT).show();
                    chuoi += String.valueOf(i);
                    chuoi += (i != N) ? "*" : "";
                }
                tvKq.setText("S= " + chuoi + "\n" + "S= " + nhan);
            }
        });
    }

    private void getBtnTongN() {
        btnTongN = (Button) findViewById(R.id.btn_tong);
        btnTongN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int N= Integer.parseInt(edtN.getText().toString());
                int tong = 0;
                String chuoi = "";
                for(int i=1;i<=N;i++){
                    tong+=i;
//                    Toast.makeText(MainActivity.this, tong+"", Toast.LENGTH_SHORT).show();
                    chuoi+= String.valueOf(i);
                    chuoi+=(i!=N)?"+":"";
                }
                tvKq.setText("S= "+chuoi+"\n"+"S= "+tong);
            }
        });
    }
}
