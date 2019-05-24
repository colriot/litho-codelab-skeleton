package com.facebook.litho.codelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val componentContext = ComponentContext(this)
    setContentView(
      LithoView.create(
        this,
        PlaygroundComponent.create(componentContext).build()
      )
    )
  }
}
