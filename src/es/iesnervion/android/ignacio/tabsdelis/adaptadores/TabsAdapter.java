package es.iesnervion.android.ignacio.tabsdelis.adaptadores;

import es.iesnervion.android.ignacio.tabsdelis.Fragmento1;
import es.iesnervion.android.ignacio.tabsdelis.Fragmento2;
import es.iesnervion.android.ignacio.tabsdelis.Fragmento3;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsAdapter extends FragmentPagerAdapter {
 
    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            return new Fragmento1();
        case 1:
            return new Fragmento2();
        case 2:
            return new Fragmento3();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
 
}
