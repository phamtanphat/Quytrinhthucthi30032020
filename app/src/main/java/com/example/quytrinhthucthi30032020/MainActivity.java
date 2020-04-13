package com.example.quytrinhthucthi30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 1 : Khai báo view
    EditText mEdtSothunhat,mEdtSothuhai;
    Button mBtnReset,mBtnCong,mBtnTru,mBtnNhan,mBtnChia;
    TextView mTvKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 : Ánh xạ
        mEdtSothunhat = findViewById(R.id.edittextSothunhat);
        mEdtSothuhai = findViewById(R.id.edittextSothuhai);
        mBtnReset = findViewById(R.id.buttonReset);
        mBtnCong = findViewById(R.id.buttonCong);
        mBtnTru = findViewById(R.id.buttonTru);
        mBtnNhan = findViewById(R.id.buttonNhan);
        mBtnChia = findViewById(R.id.buttonChia);
        mTvKetqua = findViewById(R.id.textviewKetqua);

        // interface : Function gọi lại để người khác có thể xử lý

        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoiSothunhat = mEdtSothunhat.getText().toString();
                String chuoiSothunhai = mEdtSothuhai.getText().toString();

                if (chuoiSothunhat.isEmpty() || chuoiSothunhai.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                int sothu1 = Integer.parseInt(chuoiSothunhat);
                int sothu2 = Integer.parseInt(chuoiSothunhai);

                int ketqua = sothu1 + sothu2;
                mTvKetqua.setText("Kết quả = " + ketqua);
            }
        });

    }
}
