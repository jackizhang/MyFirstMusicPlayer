package com.jackyzhang.myfirstmusicplayer.home.view;

/**
 * Created by zhangyunpu on 2017/4/20.
 */

public interface IHomeView {
    public void onMenuShowed();
    public void onMenuItmClicked(int position);
    public void onGotoSearchActivity();
    public void onGoPlayActivity();
    public void onSongBtnClicked();
    public void onAlbumBtnClicked();
    public void onArtBtnClicked();
}
