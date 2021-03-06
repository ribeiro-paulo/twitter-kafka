package com.twitterfront;

import com.facebook.react.ReactActivity;
import com.klarna.reactnative.zlib.RNReactNativeZlibPackage;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    new RNReactNativeZlibPackage();
    return "twitterFront";
  }
}
