package com.lottie.dynamicupdate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.FontAssetDelegate
import com.airbnb.lottie.TextDelegate
import com.lottie.dynamicupdate.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lottie.apply {
            setTextDelegate(object : TextDelegate(this) {
                override fun getText(input: String?): String {
                    return when (input) {
//                        "+777123456" -> "+1234567890"    // Uncomment this line to see the text change
                        else -> super.getText(input)
                    }
                }
            })

            setFontAssetDelegate(object : FontAssetDelegate() {
                override fun getFontPath(fontFamily: String?): String {
                    return "font/centralesansbook.ttf"
                }

                override fun getFontPath(
                    fontFamily: String?,
                    fontStyle: String?,
                    fontName: String?
                ): String {
                    return "font/centralesansbook.ttf"
                }
            })
        }
    }
}