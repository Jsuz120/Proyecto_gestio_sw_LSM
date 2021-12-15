package com.example.galeria.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.galeria.R;

public class Galeria_Fotos_Adapter extends BaseAdapter {
    private Context mContext;
    public int[] imageArray ={
            R.drawable.letraa,
            R.drawable.letrab,
            R.drawable.letrac,
            R.drawable.letrad,
            R.drawable.letrae,
            R.drawable.letraf,
            R.drawable.letrag,
            R.drawable.letrah,
            R.drawable.letrai,
            R.drawable.letraj,
            R.drawable.letrak,
            R.drawable.letral,
            R.drawable.letram,
            R.drawable.letran,
            R.drawable.letrann,
            R.drawable.letrao,
            R.drawable.letrap,
            R.drawable.letraq,
            R.drawable.letrar,
            R.drawable.letras,
            R.drawable.letrat,
            R.drawable.letrau,
            R.drawable.letrav,
            R.drawable.letraw,
            R.drawable.letrax,
            R.drawable.letray,
            R.drawable.letraz
    };

    public Galeria_Fotos_Adapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340, 350));

        return imageView;

    }
}
