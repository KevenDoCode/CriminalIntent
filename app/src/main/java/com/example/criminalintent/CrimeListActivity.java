package com.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by deng on 2017/5/15.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment CreateFragment() {
        return new CrimeListFragment();
    }
}
