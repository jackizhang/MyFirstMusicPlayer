package com.jackyzhang.myfirstmusicplayer.home.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by zhangyunpu on 2017/4/21.
 */

public class SongCompl implements ISong {

    String mSongName;
    String mAlbumName;
    String mArtistName;
    long mDuration;
    String mCoverPath;


    public SongCompl(){

    }

    @Override
    public String getSongName() {
        return mSongName;
    }

    @Override
    public String getAlbumName() {
        return mAlbumName;
    }

    @Override
    public String getArtistName() {
        return mArtistName;
    }

    @Override
    public long getDuration() {
        return mDuration;
    }

    @Override
    public String getCoverPath() {
        return mCoverPath;
    }

    @Override
    public Bitmap getCoverBitmap() {
        return BitmapFactory.decodeFile(mCoverPath);
    }
}
