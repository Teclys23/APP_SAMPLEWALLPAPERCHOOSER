package mythi.samplewallpaperchooser;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class SampleImageAdapter extends BaseAdapter {
    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.pic_simple_1, R.drawable.pic_simple_2,
            R.drawable.pic_simple_3, R.drawable.pic_simple_4,
            R.drawable.pic_simple_5, R.drawable.pic_simple_6,
            R.drawable.pic_simple_7
    };
    private Context mContext;

    // Constructor
    public SampleImageAdapter(Context c) {
        mContext = c;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(500, 500
        ));
        return imageView;
    }

}