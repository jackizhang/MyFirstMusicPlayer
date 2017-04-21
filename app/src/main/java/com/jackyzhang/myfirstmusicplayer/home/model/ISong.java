package com.jackyzhang.myfirstmusicplayer.home.model;

import android.graphics.Bitmap;

/**
 * Created by zhangyunpu on 2017/4/21.
 */

public interface ISong {
    String getSongName();
    String getAlbumName();
    String getArtistName();
    long getDuration();
    String getCoverPath();
    Bitmap getCoverBitmap();
}
