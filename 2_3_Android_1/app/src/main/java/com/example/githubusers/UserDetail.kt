package com.example.githubusers

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class UserDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)

        val tvObject1: TextView = findViewById(R.id.tv_item_name)

        val data = intent.getParcelableExtra<GithubUser>("DATA")
        val textName = "${data?.name}"
        tvObject1.text = textName

        val tvObject2: TextView = findViewById(R.id.tv_item_username)
        val textUsername = "${data?.username}"
        tvObject2.text = textUsername

        val imgObject1: de.hdodenhof.circleimageview.CircleImageView = findViewById(R.id.img_item_photo)
        if (data != null) {
            data.photo.let { imgObject1.setImageResource(it) }
        }

        val tvObject3: TextView = findViewById(R.id.tv_item_follower)
        val textFollower = "Follower: ${data?.follower}"
        tvObject3.text = textFollower

        val tvObject4: TextView = findViewById(R.id.tv_item_following)
        val textFollowing = "Following: ${data?.following}"
        tvObject4.text = textFollowing

        val tvObject5: TextView = findViewById(R.id.tv_item_company)
        val textCompany = "Company: ${data?.company}"
        tvObject5.text = textCompany

        val tvObject6: TextView = findViewById(R.id.tv_item_location)
        val textLocation = "Location: ${data?.location}"
        tvObject6.text = textLocation

        val tvObject7: TextView = findViewById(R.id.tv_item_repository)
        val textRepository = "Number of Repository: ${data?.repository}"
        tvObject7.text = textRepository

        val btn: Button = findViewById(R.id.btn_share)
        btn.setOnClickListener(this)

    }

}

private fun Button.setOnClickListener(userDetail: UserDetail) {
    val share = Intent.createChooser(Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, "https://developer.android.com/training/sharing/")

        // (Optional) Here we're setting the title of the content
        putExtra(Intent.EXTRA_TITLE, "Introducing content previews")

        // (Optional) Here we're passing a content URI to an image to be displayed
        data = "https://developer.android.com/training/sharing/".toUri()
        flags = Intent.FLAG_GRANT_READ_URI_PERMISSION
    }, null)
    startActivity(share)

}

fun startActivity(shareIntent: Intent?) {

}