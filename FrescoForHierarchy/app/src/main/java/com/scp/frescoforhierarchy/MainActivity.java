package com.scp.frescoforhierarchy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.graphics.Color.GREEN;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView sdv;
    //需要下载的图片地址
    private Uri imageUrl = Uri.parse("http://avatar.csdn.net/4/E/8/1_y1scp.jpg");
    //private Uri imageUrl = Uri.parse("http://www.sonystyle.com.cn/activity/wallpaper/2015/nov/01_640x1136.jpg");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化Fresco
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //获取SimpleDraweeView
        sdv = (SimpleDraweeView) findViewById(R.id.main_sdv);

        //初始化多张背景图集合
        List<Drawable> bgs = new ArrayList<Drawable>();
        bgs.add(ContextCompat.getDrawable(this,R.mipmap.bg_zero));
        bgs.add(ContextCompat.getDrawable(this,R.mipmap.bg_one));
        bgs.add(ContextCompat.getDrawable(this,R.mipmap.bg_two));

        //初始化多张叠加图集合
        List<Drawable> overlays = new ArrayList<Drawable>();
        overlays.add(ContextCompat.getDrawable(this,R.mipmap.overlay_one));
        overlays.add(ContextCompat.getDrawable(this,R.mipmap.overlay_two));
        overlays.add(ContextCompat.getDrawable(this, R.mipmap.overlay_three));

        GenericDraweeHierarchy hierarchy = new GenericDraweeHierarchyBuilder(getResources())
                //设置淡入淡出动画持续时间
                .setFadeDuration(5000)
                //设置单张背景图
                .setBackground(ContextCompat.getDrawable(this, R.mipmap.bg_zero))
                //设置多张背景图
                //.setBackgrounds(bgs)
                //设置单张叠加图
                //.setOverlay(ContextCompat.getDrawable(this,R.mipmap.overlay_one))
                //设置多张叠加图
                //.setOverlays(overlays)
                //设置占位图及它的缩放类型
                .setPlaceholderImage(ContextCompat.getDrawable(this, R.mipmap.icon_placeholder), ScalingUtils.ScaleType.FOCUS_CROP)
                //设置正在加载图及其缩放类型
                .setProgressBarImage(ContextCompat.getDrawable(this, R.mipmap.icon_progress_bar), ScalingUtils.ScaleType.FOCUS_CROP)
                //设置失败图及其缩放类型
                .setFailureImage(ContextCompat.getDrawable(this, R.mipmap.icon_failure), ScalingUtils.ScaleType.FOCUS_CROP)
                //设置重试图及其缩放类型
                .setRetryImage(ContextCompat.getDrawable(this, R.mipmap.icon_retry), ScalingUtils.ScaleType.FOCUS_CROP)
                //构建
                .build();

        //设置GenericDraweeHierarchy
        sdv.setHierarchy(hierarchy);

        //构建Controller
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                //设置点击重试是否开启
                .setTapToRetryEnabled(true)
                //构建
                .build();

        //设置Controller
        sdv.setController(controller);

        //开始下载
        sdv.setImageURI(imageUrl);

    }
}
