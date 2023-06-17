package com.asadbek.viewpagertablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asadbek.viewpagertablayout.adapter.FragmentPagerAdapter
import com.asadbek.viewpagertablayout.adapter.PagetAdapter
import com.asadbek.viewpagertablayout.adapter.User
import com.asadbek.viewpagertablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list:ArrayList<String>
    lateinit var list2:ArrayList<User>
    lateinit var pagetAdapter: FragmentPagerAdapter
    lateinit var fragmentPagetAdapter: PagetAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        list2 = ArrayList()
        list.add("Sadfjsdklfnle")
        //pagetAdapter = PagetAdapter(list,this)
        list2.add(User("Begi","https://storage.kun.uz/source/thumbnails/_medium/7/nQOjIed8GxqA0TgQDRG0Cyd5tVtZBwqE_medium.jpg"))
        list2.add(User("Shoxrux","https://storage.kun.uz/source/thumbnails/_medium/7/9UA1uQqtVq0fYas_ZPL7PegSXpCjcTk2_medium.jpg"))
        list2.add(User("Ali","https://storage.kun.uz/source/thumbnails/_medium/7/p4642Usfi9DwqdYGEbf4qifXJTs9fKYt_medium.jpg"))
        pagetAdapter = FragmentPagerAdapter(supportFragmentManager,list2)
        binding.viewPager.adapter = pagetAdapter
    }
}