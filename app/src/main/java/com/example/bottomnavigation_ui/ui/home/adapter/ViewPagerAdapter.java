package com.example.bottomnavigation_ui.ui.home.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.bottomnavigation_ui.ui.home.fragments.HomeFragment;


import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private List<HomeFragment> fragments;

    public List<HomeFragment> getFragments() {
        return fragments;
    }

    public void setFragments(List<HomeFragment> fragments) {
        this.fragments = fragments;
    }

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
