# SetPrimaryItemExample

This code describes the PagerAdapter#setPrimaryItem will crash if you bind page the with the asynchronous data and implement the PagerAdapter with Kotlin.

## Java implementation
This will not crash

## Kotlin implementation
This will be crash

```stacktrace

01-17 11:00:05.767 4032-4032/com.wakwak.setprimaryitemexample E/AndroidRuntime: FATAL EXCEPTION: main
                                                                                Process: com.wakwak.setprimaryitemexample, PID: 4032
                                                                                java.lang.IllegalArgumentException: Parameter specified as non-null is null: method kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull, parameter any
                                                                                    at com.wakwak.setprimaryitemexample.kotlin.KtPagerAdapter.setPrimaryItem(KtPagerAdapter.kt)
                                                                                    at android.support.v4.view.ViewPager.populate(ViewPager.java:1236)
                                                                                    at android.support.v4.view.ViewPager.populate(ViewPager.java:1086)
                                                                                    at android.support.v4.view.ViewPager.onMeasure(ViewPager.java:1616)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.support.constraint.ConstraintLayout.onMeasure(ConstraintLayout.java:1028)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6083)
                                                                                    at android.widget.FrameLayout.onMeasure(FrameLayout.java:185)
                                                                                    at android.support.v7.widget.ContentFrameLayout.onMeasure(ContentFrameLayout.java:139)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6083)
                                                                                    at android.support.v7.widget.ActionBarOverlayLayout.onMeasure(ActionBarOverlayLayout.java:400)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6083)
                                                                                    at android.widget.FrameLayout.onMeasure(FrameLayout.java:185)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6083)
                                                                                    at android.widget.LinearLayout.measureChildBeforeLayout(LinearLayout.java:1464)
                                                                                    at android.widget.LinearLayout.measureVertical(LinearLayout.java:758)
                                                                                    at android.widget.LinearLayout.onMeasure(LinearLayout.java:640)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.view.ViewGroup.measureChildWithMargins(ViewGroup.java:6083)
                                                                                    at android.widget.FrameLayout.onMeasure(FrameLayout.java:185)
                                                                                    at com.android.internal.policy.DecorView.onMeasure(DecorView.java:689)
                                                                                    at android.view.View.measure(View.java:19857)
                                                                                    at android.view.ViewRootImpl.performMeasure(ViewRootImpl.java:2275)
                                                                                    at android.view.ViewRootImpl.measureHierarchy(ViewRootImpl.java:1366)
                                                                                    at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:1619)
                                                                                    at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:1254)
                                                                                    at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:6337)
                                                                                    at android.view.Choreographer$CallbackRecord.run(Choreographer.java:874)
                                                                                    at android.view.Choreographer.doCallbacks(Choreographer.java:686)
                                                                                    at android.view.Choreographer.doFrame(Choreographer.java:621)
                                                                                    at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:860)
                                                                                    at android.os.Handler.handleCallback(Handler.java:751)
                                                                                    at android.os.Handler.dispatchMessage(Handler.java:95)
                                                                                    at android.os.Looper.loop(Looper.java:154)
                                                                                    at android.app.ActivityThread.main(ActivityThread.java:6119)
                                                                                    at java.lang.reflect.Method.invoke(Native Method)
                                                                                    at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:886)
                                                                                    at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:776)

```
