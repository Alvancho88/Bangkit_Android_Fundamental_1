package com.example.githubusers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvUser: RecyclerView

    private val list = ArrayList<GithubUser>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUser = findViewById(R.id.rv_github_icon)
        rvUser.setHasFixedSize(true)

        list.addAll(listUser)
        showRecyclerList()
    }

    private val listUser: ArrayList<GithubUser>
        get() {
            val dataName = resources.getStringArray(R.array.data_name)
            val dataDescription = resources.getStringArray(R.array.data_username)
            val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
            val dataFollower = resources.getIntArray(R.array.data_follower)
            val dataFollowing = resources.getIntArray(R.array.data_following)
            val dataCompany = resources.getStringArray(R.array.data_company)
            val dataLocation = resources.getStringArray(R.array.data_location)
            val dataRepository = resources.getStringArray(R.array.data_repository)
            val listUser= ArrayList<GithubUser>()
            for (i in dataName.indices) {
                val user = GithubUser(dataName[i],dataDescription[i], dataPhoto.getResourceId(i, -1),
                    dataFollower[i], dataFollowing[i], dataCompany[i], dataLocation[i], dataRepository[i]
                )
                listUser.add(user)
            }
            return listUser
        }

    private fun showRecyclerList() {
        rvUser.layoutManager = LinearLayoutManager(this)
        val listUserAdapter = ListUserAdapter(list)
        rvUser.adapter = listUserAdapter
        listUserAdapter.setOnItemClickCallback(object : ListUserAdapter.OnItemClickCallback {
            override fun onItemClicked(data: GithubUser) {
                val intentToDetail = Intent(this@MainActivity, UserDetail::class.java)
                intentToDetail.putExtra("DATA", data)
                startActivity(intentToDetail)
            }
        })
    }

}