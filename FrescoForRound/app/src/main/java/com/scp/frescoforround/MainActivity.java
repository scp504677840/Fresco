package com.scp.frescoforround;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private SimpleDraweeView sdv;
    /**
     * 图片地址
     */
    private Uri imageUrl = Uri.parse("http://avatar.csdn.net/4/E/8/1_y1scp.jpg");

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

        //初始化圆角圆形参数对象
        RoundingParams rp = new RoundingParams();
        //设置图像是否为圆形
        rp.setRoundAsCircle(true);
        //设置圆角半径
        //rp.setCornersRadius(20);
        //分别设置左上角、右上角、左下角、右下角的圆角半径
        //rp.setCornersRadii(20,25,30,35);
        //分别设置（前2个）左上角、(3、4)右上角、(5、6)左下角、(7、8)右下角的圆角半径
        //rp.setCornersRadii(new float[]{20,25,30,35,40,45,50,55});
        //设置边框颜色及其宽度
        rp.setBorder(Color.BLACK, 10);
        //设置叠加颜色
        rp.setOverlayColor(Color.GRAY);
        //设置圆形圆角模式
        //rp.setRoundingMethod(RoundingParams.RoundingMethod.BITMAP_ONLY);
        //设置圆形圆角模式
        rp.setRoundingMethod(RoundingParams.RoundingMethod.OVERLAY_COLOR);

        //获取GenericDraweeHierarchy对象
        GenericDraweeHierarchy hierarchy = GenericDraweeHierarchyBuilder.newInstance(getResources())
                //设置圆形圆角参数
                .setRoundingParams(rp)
                //设置圆角半径
                //.setRoundingParams(RoundingParams.fromCornersRadius(20))
                //分别设置左上角、右上角、左下角、右下角的圆角半径
                //.setRoundingParams(RoundingParams.fromCornersRadii(20,25,30,35))
                //分别设置（前2个）左上角、(3、4)右上角、(5、6)左下角、(7、8)右下角的圆角半径
                //.setRoundingParams(RoundingParams.fromCornersRadii(new float[]{20,25,30,35,40,45,50,55}))
                //设置圆形圆角参数；RoundingParams.asCircle()是将图像设置成圆形
                //.setRoundingParams(RoundingParams.asCircle())
                //设置淡入淡出动画持续时间(单位：毫秒ms)
                .setFadeDuration(5000)
                //构建
                .build();

        //设置Hierarchy
        sdv.setHierarchy(hierarchy);

        //构建Controller
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                //设置需要下载的图片地址
                .setUri(imageUrl)
                //设置点击重试是否开启
                .setTapToRetryEnabled(true)
                //构建
                .build();

        //设置Controller
        sdv.setController(controller);
    }
}
