package com.facebook.litho.codelab;

import android.graphics.Color;
import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.Row;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateInitialState;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.State;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaAlign;

@LayoutSpec
class PlaygroundComponentSpec {

  @OnCreateLayout
  static Component onCreateLayout(ComponentContext c, @State boolean isColored) {
    return Column.create(c)
        .backgroundColor(Color.WHITE)
        .child(
            Text.create(c)
                .textSizeSp(20)
                .alignSelf(YogaAlign.CENTER)
                .text("Playground sample"))
        .build();
  }
}
