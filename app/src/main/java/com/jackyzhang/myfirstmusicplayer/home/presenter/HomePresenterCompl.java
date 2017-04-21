package com.jackyzhang.myfirstmusicplayer.home.presenter;

import com.jackyzhang.myfirstmusicplayer.home.view.IHomeView;

/**
 * Created by zhangyunpu on 2017/4/20.
 */

public class HomePresenterCompl implements IHomePresenter {

    IHomeView mHomeView;

    public HomePresenterCompl(IHomeView homeView){
        mHomeView = homeView;
    }

    @Override
    public void showMenu() {
        mHomeView.onMenuShowed();
    }

    @Override
    public void onMenuItemClick(int position) {
        mHomeView.onMenuItmClicked(position);
    }

    @Override
    public void goSearchActivity() {
        mHomeView.onGotoSearchActivity();
    }

    @Override
    public void goPlayActivity() {
        mHomeView.onGoPlayActivity();
    }

    @Override
    public void clickSongBtn() {
        mHomeView.onSongBtnClicked();
    }

    @Override
    public void clickAlbumBtn() {
        mHomeView.onAlbumBtnClicked();
    }

    @Override
    public void clickArtBtn() {
        mHomeView.onArtBtnClicked();
    }

}
