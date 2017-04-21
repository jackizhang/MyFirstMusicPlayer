package com.jackyzhang.myfirstmusicplayer.home.presenter;

/**
 * Created by zhangyunpu on 2017/4/20.
 */

public interface IHomePresenter {
     void showMenu();
     void onMenuItemClick(int position);
     void goSearchActivity();
     void goPlayActivity();
     void clickSongBtn();
     void clickAlbumBtn();
     void clickArtBtn();
}
