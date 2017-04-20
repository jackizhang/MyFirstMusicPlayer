package com.jackyzhang.myfirstmusicplayer.home.presenter;

/**
 * Created by zhangyunpu on 2017/4/20.
 */

public interface IHomePresenter {
    public void showMenu();
    public void onMenuItemClick(int position);
    public void goSearchActivity();
    public void goPlayActivity();
}
