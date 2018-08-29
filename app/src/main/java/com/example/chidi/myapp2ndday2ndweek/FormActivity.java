//Form to capture biodata
package com.example.chidi.myapp2ndday2ndweek;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FormActivity implements Parcelable{

    protected FormActivity(Parcel in) {
    }

    public static final Creator<FormActivity> CREATOR = new Creator<FormActivity>() {
        @Override
        public FormActivity createFromParcel(Parcel in) {
            return new FormActivity(in);
        }

        @Override
        public FormActivity[] newArray(int size) {
            return new FormActivity[size];
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
