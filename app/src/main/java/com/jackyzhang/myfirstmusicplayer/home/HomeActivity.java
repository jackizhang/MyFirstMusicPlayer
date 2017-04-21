package com.jackyzhang.myfirstmusicplayer.home;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.jackyzhang.myfirstmusicplayer.R;
import com.jackyzhang.myfirstmusicplayer.home.presenter.HomePresenterCompl;
import com.jackyzhang.myfirstmusicplayer.home.presenter.IHomePresenter;
import com.jackyzhang.myfirstmusicplayer.home.view.IHomeView;

public class HomeActivity extends AppCompatActivity implements IHomeView,View.OnClickListener{

    IHomePresenter mHomePresenter;
    ImageView iv_menu,iv_song,iv_artist,iv_album,iv_search;
    ViewPager vp_fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init mvp
        mHomePresenter = new HomePresenterCompl(this);

        //init ui
        iv_menu = (ImageView)findViewById(R.id.iv_menu);
        iv_menu.setOnClickListener(this);

        iv_album = (ImageView)findViewById(R.id.iv_album);
        iv_album.setOnClickListener(this);

        iv_artist = (ImageView)findViewById(R.id.iv_artist);
        iv_artist.setOnClickListener(this);

        iv_search = (ImageView)findViewById(R.id.iv_search);
        iv_search.setOnClickListener(this);

        iv_song = (ImageView)findViewById(R.id.iv_song);
        iv_song.setOnClickListener(this);

        vp_fragment = (ViewPager)findViewById(R.id.vp_fragment);

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

    @Override
    public void onSongBtnClicked() {

    }

    @Override
    public void onAlbumBtnClicked() {

    }

    @Override
    public void onArtBtnClicked() {

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.iv_menu)
            mHomePresenter.showMenu();
        else if(v.getId() == R.id.iv_artist)
            mHomePresenter.clickArtBtn();
        else if(v.getId() == R.id.iv_album)
            mHomePresenter.clickAlbumBtn();
        else if(v.getId() == R.id.iv_song)
            mHomePresenter.clickSongBtn();
        else if(v.getId() == R.id.iv_search)
            mHomePresenter.goSearchActivity();
    }
}
