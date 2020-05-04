package app.softsolstudio.violinfingerboardquiz;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;

import java.io.IOException;
import java.io.InputStream;

public class Common {
    public static MediaPlayer bgplayer;
    public static MediaPlayer player;
    public static void SoundPlayer(Context ctx, String name){
        AssetFileDescriptor afd = null;

        try {
            afd = ctx.getAssets().openFd(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (player==null)
        {
            player=new MediaPlayer();
        }
        else
        {
            player.reset();
            player.release();
            player=new MediaPlayer();
        }
        player = new MediaPlayer();

        try {
            player.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            player.prepare();
            player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    player.setVolume(100,100);
                    player.start();
                }
            });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void bgsoundplayer(Context ctx){

        AssetFileDescriptor afd = null;
        try {
            afd = ctx.getAssets().openFd("music_theme.mp3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        bgplayer = new MediaPlayer();
        try {
            bgplayer.setDataSource(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            bgplayer.prepare();
            bgplayer.setLooping(true);
            bgplayer.setVolume(30,30);
            bgplayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Bitmap loadBitmapFromAssets(Context ctx, String path)
    {
        InputStream stream = null;
        try
        {
            stream = ctx.getAssets().open(path);
            return BitmapFactory.decodeStream(stream);
        }
        catch (Exception ignored) {} finally
        {
            try
            {
                if(stream != null)
                {
                    stream.close();
                }
            } catch (Exception ignored) {}
        }
        return null;
    }
}

