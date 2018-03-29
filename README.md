# LikeStarAnimation

![](https://github.com/wapchief/LikeStarAnimation/blob/master/device_screenshots.gif?raw=true)


[![](https://www.jitpack.io/v/wapchief/LikeStarAnimation.svg)](https://www.jitpack.io/#wapchief/LikeStarAnimation)


To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}

```

Step 2. Add the dependency

```
	dependencies {
	        compile 'com.github.wapchief:LikeStarAnimation:1.0.4'
	}
```


Step 3. add .xml View

```
        <com.wapchief.likestarlibrary.like.TCHeartLayout
            android:id="@+id/heart_layout"
            android:layout_width="100dp"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_alignParentRight="true"
            android:focusable="true" />

```

Step 4. OnClick show

```
            public void onClick(View v) {
                mHeartLayout.addFavor();
            }
```

#### Other The custom

```
        //res
        mHeartLayout.setDrawableIds(new int[]{R.drawable.img});
        //animation duration time
        mHeartLayout.setAnimalTime(2000);
        //view color
        mHeartLayout.setImgColor(Color.parseColor("#000000"));
```