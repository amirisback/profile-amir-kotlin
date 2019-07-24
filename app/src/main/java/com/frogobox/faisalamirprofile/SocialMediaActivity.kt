package com.frogobox.faisalamirprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.frogobox.faisalamirprofile.adapter.SocialMediaAdapter
import com.frogobox.faisalamirprofile.model.SocialMedia
import kotlinx.android.synthetic.main.activity_social_media.*
import kotlinx.android.synthetic.main.container_title.*

class SocialMediaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)

        initView()

    }

    private fun initView(){
        tv_content_title.text = getString(R.string.title_social_media)
        tv_content_subtitle.text = getString(R.string.subtitle_social_media)
        initListView()
    }

    private fun initListView(){
        val arraySocialMedia : MutableList<SocialMedia> = mutableListOf()

        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_linkedin, getString(R.string.text_link_linkedin)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_github, getString(R.string.text_link_github)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_dribbble, getString(R.string.text_link_dribbble)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_medium, getString(R.string.text_link_medium)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_playstore, getString(R.string.text_link_playstore)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_facebook, getString(R.string.text_link_facebook)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_instagram, getString(R.string.text_link_instagram)))
        arraySocialMedia.add(SocialMedia(R.drawable.img_logo_twitter, getString(R.string.text_link_twitter)))

        val adapter = SocialMediaAdapter(this, arraySocialMedia)
        val mLayoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL ,false)

        rv_social_media.adapter = adapter
        rv_social_media.layoutManager = mLayoutManager
    }

}
