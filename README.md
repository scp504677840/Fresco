# Fresco
##Fresco的应用：

###1、占位图
![placeholderImage](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/placeholderImage.png)

###2、进度图
![progressBarImage](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/progressBarImage.gif)

###3、重试图
![retryImage](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/retryImage.gif)

###4、失败图
![failureImage](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/failureImage.gif)

###5、实际图
![actualImage](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/actualImage.png)

###6、缩放模式

	| 类型 | 描述 |
	| ------------- | ------------- |
	| center | 居中，无缩放 |
	| centerCrop | 保持宽高比缩小或放大，使得两边都大于或等于显示边界。居中显示。 |
	| focusCrop | 同centerCrop, 但居中点不是中点，而是指定的某个点 |
	| centerInside | 使两边都在显示边界内，居中显示。如果图尺寸大于显示边界，则保持长宽比缩小图片。|
	| fitCenter | 保持宽高比，缩小或者放大，使得图片完全显示在显示边界内。居中显示 |
	| fitStart | 同上。但不居中，和显示边界左上对齐 |
	| fitEnd | 同fitCenter， 但不居中，和显示边界右下对齐 |
	| fitXY | 不保存宽高比，填充满显示边界 |
	| none | 如要使用tile mode显示, 需要设置为none |
	
	
	推荐使用：focusCrop 类型

	Fresco中文说明对这一点也有详情的说明： [缩放](http://www.fresco-cn.org/docs/scaling.html#_)

###7、圆形图
![roundAsCircle](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/roundAsCircle.gif)

###8、圆角图
![roundingBorderCircle](https://github.com/scp504677840/Fresco/blob/master/demonstration%20figure/roundingBorderCircle.gif)

###9、叠加图 

###10、按压状态下叠加图 

###11、背景图

###11、常见问题
