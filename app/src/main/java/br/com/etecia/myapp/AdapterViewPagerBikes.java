package br.com.etecia.myapp;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterViewPagerBikes extends FragmentStateAdapter {

    public AdapterViewPagerBikes(@NonNull FragmentActivity fragmentActivity) {

        super(fragmentActivity);

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {

            case 0:
                return new BikesNovasFragment();
            case 1:
                return new BikesUsadasFragment();
            case 2:
                return new BikesDoacaoFragment();
            default:
                return new BikesNovasFragment();

            return null;

        }

    }

    @Override
    public int getItemCount() {

        return 3;

    }

}
