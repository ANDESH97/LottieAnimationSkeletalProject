package com.brownie.lottieanimationstest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animatedView: LottieAnimationView = findViewById(R.id.animationView);

        animatedView.visibility = View.VISIBLE
        animatedView.setAnimation(R.raw.ripple_loading_animation)
        animatedView.playAnimation()

        startAnimation()
    }

    private fun startAnimation() {
        Handler().postDelayed(Runnable { // This method will be executed once the timer is over
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 10000)
    }
}