package com.hfad.mycard;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;

public class NewsRecyclerAdapter  extends
        RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder>{

    private final String title;
    private final String imageUrl;
    private final Category category;
    private final Date publishDate;
    private final String previewText;
    private final String fullText;

    public class ViewHolder {
    }
}
