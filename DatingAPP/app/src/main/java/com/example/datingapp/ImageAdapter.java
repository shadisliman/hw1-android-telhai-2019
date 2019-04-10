package com.example.datingapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] mImageIds = new int[]{R.drawable.cr71, R.drawable.messi1, R.drawable.sr1, R.drawable.ahmad, R.drawable.dabbur1};
    ImageAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageResource(mImageIds[position]);
        imageView.setOnClickListener(new ImageView.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(position==0)
                {
                    Intent intent=new  Intent(v.getContext(),Cr7.class);
                    v.getContext().startActivity(intent);
                }

                else
                    if(position==1)
                    {
                        Intent intent=new  Intent(v.getContext(),Messi.class);
                        v.getContext().startActivity(intent);
                }

                else
                    if(position==2)
                    {
                        Intent intent=new  Intent(v.getContext(),Sr4.class);
                        v.getContext().startActivity(intent);
                }

                else
                    if (position==3)
                    {
                        Intent intent=new  Intent(v.getContext(),Inesta8.class);
                        v.getContext().startActivity(intent);
                }
                else
                    if (position==4)
                    {
                        Intent intent=new  Intent(v.getContext(),MD9.class);
                        v.getContext().startActivity(intent);
                }


            }
        });
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}