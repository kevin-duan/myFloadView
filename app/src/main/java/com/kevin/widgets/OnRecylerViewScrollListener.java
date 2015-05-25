package com.kevin.widgets;

/**
 * Author by kevin .
 */
public interface OnRecylerViewScrollListener {
    public void onScrollStateChange(android.support.v7.widget.RecyclerView recyclerView, int newState);

    public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy);
}
