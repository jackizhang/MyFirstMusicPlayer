package com.jackyzhang.myfirstmusicplayer.home.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jackyzhang.myfirstmusicplayer.R;
import com.jackyzhang.myfirstmusicplayer.home.presenter.IListPresenter;
import com.jackyzhang.myfirstmusicplayer.home.presenter.ListPresentCompl;
import com.jackyzhang.myfirstmusicplayer.home.view.IListView;

/**
 * Created by zhangyunpu on 2017/4/21.
 */

public class ListFragment extends Fragment implements IListView,AdapterView.OnItemClickListener{

    ListView lv_data;
    IListPresenter mListPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container);
        lv_data = (ListView)view.findViewById(R.id.lv_data);
        mListPresenter = new ListPresentCompl(this);
        return view;
    }

    @Override
    public void onItemClicked(int position) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mListPresenter.clickItem(position);
    }
}
