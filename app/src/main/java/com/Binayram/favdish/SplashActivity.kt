package com.Binayram.favdish

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.Binayram.favdish.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_splash)
        val splashBinding: ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)
        splashBinding.tvAppName.text = "Hello"


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            @Suppress("DEPRECATION")
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        }
        val splashScreen = AnimationUtils.loadAnimation(this,R.anim.anim_splash)
        splashBinding.tvAppName.animation = splashScreen

        splashScreen.setAnimationListener(object: Animation.AnimationListener{
            override fun onAnimationStart(animation: Animation?) {
               // TODO("Not yet implemented")
            }

            override fun onAnimationEnd(animation: Animation?) {
                //TODO("Not yet implemented")
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
                finish()
            },1500)
            }

            override fun onAnimationRepeat(animation: Animation?) {
              //  TODO("Not yet implemented")
            }

        })
    }
}