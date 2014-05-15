package edu.dartmouth.cs.dtutor;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Container Activity for DTutor fragments.
 */
public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private static final String TAB_KEY_INDEX = "tab_key";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ActionBar
        ActionBar actionbar = getActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // TODO:
        // create new tabs and and set up the titles of the tabs
        ActionBar.Tab mHomeTab = actionbar.newTab().setText(getString(R.string.ui_tabname_home));
        ActionBar.Tab mTutoringTab = actionbar.newTab().setText(getString(R.string.ui_tabname_tutor));
        ActionBar.Tab mGoalsTab = actionbar.newTab().setText(getString(R.string.ui_tabname_goals));
        ActionBar.Tab mAboutTab = actionbar.newTab().setText(getString(R.string.ui_tabname_about));
        
        // TODO:
        // create the fragments
        Fragment mHomeFragment = new HomeFragment();
        Fragment mTutorFragment = new TutorFragment();
        Fragment mGoalsFragment = new GoalsFragment();
        Fragment mAboutFragment = new AboutFragment();

        // TODO:
        // bind the fragments to the tabs - set up tabListeners for each tab
        mHomeTab.setTabListener(new DTutorTabsListener(mHomeFragment, getApplicationContext()));
        mTutoringTab.setTabListener(new DTutorTabsListener(mTutorFragment, getApplicationContext()));
        mGoalsTab.setTabListener(new DTutorTabsListener(mGoalsFragment, getApplicationContext()));
        mAboutTab.setTabListener(new DTutorTabsListener(mAboutFragment, getApplicationContext()));

        // TODO:
        // add the tabs to the action bar
        actionbar.addTab(mHomeTab);
        actionbar.addTab(mTutoringTab);
        actionbar.addTab(mGoalsTab);
        actionbar.addTab(mAboutTab);

        // restore navigation pane
        if(savedInstanceState != null) {
            actionbar.setSelectedNavigationItem(savedInstanceState.getInt(TAB_KEY_INDEX, 0));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO: what do we NEED to have in the settings? what do we WANT?
        switch (item.getItemId()) {
        case R.id.menuitem_search:
            Log.d(TAG, getString(R.string.ui_menu_search));
            return true;
        case R.id.menuitem_share:
            Log.d(TAG, getString(R.string.ui_menu_share));
            return true;
        case R.id.menuitem_feedback:
            Log.d(TAG, getString(R.string.ui_menu_feedback));
            return true;
        case R.id.menuitem_about:
            Log.d(TAG, getString(R.string.ui_menu_about));
            return true;
        case R.id.menuitem_quit:
            Log.d(TAG, getString(R.string.ui_menu_quit));
            finish(); // close the activity
            return true;
        }
        return false;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TAB_KEY_INDEX, getActionBar().getSelectedNavigationIndex());
    }

}

/**
 * TabListenr class for managing user interaction with the ActionBar tabs.
 */
class DTutorTabsListener implements ActionBar.TabListener {

    private static final String TAG = "DTutorTabsListener";

    public Fragment fragment;
    public Context context;

    public DTutorTabsListener(Fragment fragment, Context context) {
        this.fragment = fragment;
        this.context = context;
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
        Log.d(TAG, "tab reselected!");
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        Log.d(TAG, "tab selected!");
        ft.replace(R.id.fragment_container, fragment);
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        Log.d(TAG, "tab unselected!");
        ft.remove(fragment);
    }

}