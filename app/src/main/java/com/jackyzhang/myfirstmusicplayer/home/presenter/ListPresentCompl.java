package com.jackyzhang.myfirstmusicplayer.home.presenter;

import com.jackyzhang.myfirstmusicplayer.home.view.IListView;

/**
 * Created by zhangyunpu on 2017/4/21.
 */

public class ListPresentCompl implements IListPresenter {

    IListView listCompl;

    public ListPresentCompl(IListView list){
        listCompl = list;
    }
    @Override
    public void clickItem(int position) {
        listCompl.onItemClicked(position);
    }
}
