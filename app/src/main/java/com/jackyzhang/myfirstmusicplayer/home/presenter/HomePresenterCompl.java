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
}
