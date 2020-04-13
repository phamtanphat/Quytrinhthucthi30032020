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
    String mChuoiSothunhat, mChuoiSothunhai;
    int mSothu1 , mSothu2 , mKetqua;
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
        // shift + f6 , alt + j : chon các biến trùng với nhau

        mBtnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChuoiSothunhat = mEdtSothunhat.getText().toString();
                mChuoiSothunhai = mEdtSothuhai.getText().toString();

                if (mChuoiSothunhai.isEmpty() || mChuoiSothunhai.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                mSothu1 = Integer.parseInt(mChuoiSothunhat);
                mSothu2 = Integer.parseInt(mChuoiSothunhai);

                mKetqua = mSothu1 + mSothu2;
                mTvKetqua.setText("Kết quả = " + mKetqua);
            }
        });
        mBtnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChuoiSothunhat = mEdtSothunhat.getText().toString();
                mChuoiSothunhai = mEdtSothuhai.getText().toString();

                if (mChuoiSothunhai.isEmpty() || mChuoiSothunhai.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                mSothu1 = Integer.parseInt(mChuoiSothunhat);
                mSothu2 = Integer.parseInt(mChuoiSothunhai);

                mKetqua = mSothu1 - mSothu2;
                mTvKetqua.setText("Kết quả = " + mKetqua);
            }
        });
        mBtnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChuoiSothunhat = mEdtSothunhat.getText().toString();
                mChuoiSothunhai = mEdtSothuhai.getText().toString();

                if (mChuoiSothunhai.isEmpty() || mChuoiSothunhai.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                mSothu1 = Integer.parseInt(mChuoiSothunhat);
                mSothu2 = Integer.parseInt(mChuoiSothunhai);

                mKetqua = mSothu1 * mSothu2;
                mTvKetqua.setText("Kết quả = " + mKetqua);
            }
        });
        mBtnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChuoiSothunhat = mEdtSothunhat.getText().toString();
                mChuoiSothunhai = mEdtSothuhai.getText().toString();

                if (mChuoiSothunhai.isEmpty() || mChuoiSothunhai.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }

                mTvKetqua.setText("Kết quả = " +  (Float.parseFloat(mChuoiSothunhat) / Float.parseFloat(mChuoiSothunhai)));
            }
        });
        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTvKetqua.setText("");
                mEdtSothunhat.setText("");
                mEdtSothuhai.setText("");
            }
        });

    }
}
