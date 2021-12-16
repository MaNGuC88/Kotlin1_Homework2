package com.example.kotlin1_homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1_homework2.databinding.ActivityMainBinding
import com.example.kotlin1_homework2.extensions.load

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val images = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        addImageUrls()
        setRandomImage()
        addMoreImageUrl()
    }

    private fun addImageUrls() {
        images.add("https://mobimg.b-cdn.net/v3/fetch/1d/1d7b14c4407fcdea5faadd6539a7cd9d.jpeg")
        images.add("https://on-desktop.com/wps/2018Movies_Master_Yoda_with_a_laser_sword_127234_.jpg")
        images.add("https://avatarko.ru/img/kartinka/16/Star_Wars_15519.jpg")
        images.add("https://cs9.pikabu.ru/post_img/big/2017/05/02/8/1493727132162441987.jpg")
        images.add("https://img4.goodfon.ru/wallpaper/nbig/6/4b/star-wars-star-wars-battlefront-ii-2017-battlefront-ii-sta-9.jpg")
    }

    private fun setRandomImage() {
        binding.btnRandom.setOnClickListener {
            binding.ivImage.load(images.random())
        }
    }

    private fun addMoreImageUrl() {
        binding.btnSubmit.setOnClickListener {
            images.add(binding.etUrl.text.toString())
            binding.etUrl.setText("")
        }
    }
}