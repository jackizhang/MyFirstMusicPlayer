package com.jackyzhang.myfirstmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jackyzhang.myfirstmusicplayer.home.presenter.HomePresenterCompl;
import com.jackyzhang.myfirstmusicplayer.home.presenter.IHomePresenter;
import com.jackyzhang.myfirstmusicplayer.home.view.IHomeView;

public class HomeActivity extends AppCompatActivity implements IHomeView{

    IHomePresenter mHomePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHomePresenter = new HomePresenterCompl(this);
    }


    @Override
    public void onMenuShowed() {
        //show menu
    }

    @Override
    public void onMenuItmClicked(int position) {

    }

    @Override
    public void onGotoSearchActivity() {

    }

    @Override
    public void onGoPlayActivity() {

    }
}
