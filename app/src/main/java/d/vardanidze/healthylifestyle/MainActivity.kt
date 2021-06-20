package d.vardanidze.healthylifestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import d.vardanidze.healthylifestyle.fragments.SettingsFragment
import d.vardanidze.healthylifestyle.fragments.UserInputFragment

class MainActivity : AppCompatActivity() {

    private var userInputFragment = UserInputFragment()
    private var settingsFragment = SettingsFragment()

    private lateinit var homeButton: MenuItem
    private lateinit var settingButton: MenuItem
    private lateinit var statisticButton: MenuItem
    private lateinit var viewPager : ViewPager2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = arrayListOf(userInputFragment, settingsFragment)
        viewPager = findViewById<ViewPager2>(R.id.viewPager)

        var navView = findViewById<BottomNavigationView>(R.id.nav_view)


        homeButton = navView.menu.getItem(0)
        statisticButton = navView.menu.getItem(1)
        settingButton = navView.menu.getItem(2)

        viewPager.adapter = ViewPagerAdapter(list, this)
        viewPager.setCurrentItem(0, true)

    }


    fun homeClicked(item: MenuItem) {
        viewPager.setCurrentItem(0,true)
    }

    fun settingsClicked(item: MenuItem) {
        viewPager.setCurrentItem(1,true)
    }

}