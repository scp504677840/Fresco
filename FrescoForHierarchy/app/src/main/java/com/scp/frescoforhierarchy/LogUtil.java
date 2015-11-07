package com.scp.frescoforhierarchy;

import android.util.Log;

/**
 * 日志
 */
public class LogUtil {

    public static final int VERBOSE = Log.VERBOSE;

    public static final int DEBUG = Log.DEBUG;

    public static final int INFO = Log.INFO;

    public static final int WARN = Log.WARN;

    public static final int ERROR = Log.ERROR;

    public static final int ASSERT = Log.ASSERT;

    //获取SLogDefaultLoggingDelegate实例
    private static LoggingDelegate mHandler = LogUtilDefaultLoggingDelegate.getInstance();

    /**
     * 设置日志委托
     *
     * @param delegate 日志委托
     */
    public static void setLoggingDelegate(LoggingDelegate delegate) {
        if (delegate == null) {
            //抛出非法数据异常
            throw new IllegalArgumentException();
        }

        mHandler = delegate;
    }

    /**
     * 该级别是否能被记录
     *
     * @param level 日志信息级别
     * @return 返回true说明能被记录，返回false则说明不能被记录
     */
    public static boolean isLoggable(int level) {
        return mHandler.isLoggable(level);
    }

    /**
     * 设置最低信息级别
     *
     * @param level 最低日志信息级别
     */
    public static void setMininumLoggingLevel(int level) {
        mHandler.setMininumLoggingLevel(level);
    }

    /**
     * 获取最低日志信息级别
     *
     * @return 最低日志信息级别
     */
    public static int getMininumLoggingLevel() {
        return mHandler.getMininuLoggingLevel();
    }

    public static void v(String tag, String msg) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Object arg1) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, formatString(msg, arg1));
        }
    }

    public static void v(String tag, String msg, Object arg1, Object arg2) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, formatString(msg, arg1, arg2));
        }
    }

    public static void v(String tag, String msg, Object arg1, Object arg2, Object arg3) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, formatString(msg, arg1, arg2, arg3));
        }
    }

    public static void v(String tag, String msg, Object arg1, Object arg2, Object arg3, Object arg4) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, formatString(msg, arg1, arg2, arg3, arg4));
        }
    }

    public static void v(Class<?> cls, String msg) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), msg);
        }
    }

    public static void v(Class<?> cls, String msg, Object arg1) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), formatString(msg, arg1));
        }
    }

    public static void v(Class<?> cls, String msg, Object arg1, Object arg2) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), formatString(msg, arg1, arg2));
        }
    }

    public static void v(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3) {
        if (isLoggable(VERBOSE)) {
            v(cls, formatString(msg, arg1, arg2, arg3));
        }
    }

    public static void v(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3,
                         Object arg4) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), formatString(msg, arg1, arg2, arg3, arg4));
        }
    }

    public static void v(String tag, String msg, Object... args) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, formatString(msg, args));
        }
    }

    public static void v(String tag, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, formatString(msg, args), tr);
        }
    }

    public static void v(Class<?> cls, String msg, Object... args) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), formatString(msg, args));
        }
    }

    public static void v(Class<?> cls, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), formatString(msg, args), tr);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(tag, msg, tr);
        }
    }

    public static void v(Class<?> cls, String msg, Throwable tr) {
        if (mHandler.isLoggable(VERBOSE)) {
            mHandler.v(getTag(cls), msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Object arg1) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(tag, formatString(msg, arg1));
        }
    }

    public static void d(String tag, String msg, Object arg1, Object arg2) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(tag, formatString(msg, arg1, arg2));
        }
    }

    public static void d(String tag, String msg, Object arg1, Object arg2, Object arg3) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(tag, formatString(msg, arg1, arg2, arg3));
        }
    }

    public static void d(String tag, String msg, Object arg1, Object arg2, Object arg3, Object arg4) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(tag, formatString(msg, arg1, arg2, arg3, arg4));
        }
    }

    public static void d(Class<?> cls, String msg) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), msg);
        }
    }

    public static void d(Class<?> cls, String msg, Object arg1) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), formatString(msg, arg1));
        }
    }

    public static void d(Class<?> cls, String msg, Object arg1, Object arg2) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), formatString(msg, arg1, arg2));
        }
    }

    public static void d(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), formatString(msg, arg1, arg2, arg3));
        }
    }

    public static void d(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3,
                         Object arg4) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), formatString(msg, arg1, arg2, arg3, arg4));
        }
    }

    public static void d(String tag, String msg, Object... args) {
        if (mHandler.isLoggable(DEBUG)) {
            d(tag, formatString(msg, args));
        }
    }

    public static void d(String tag, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(DEBUG)) {
            d(tag, formatString(msg, args), tr);
        }
    }

    public static void d(Class<?> cls, String msg, Object... args) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), formatString(msg, args));
        }
    }

    public static void d(Class<?> cls, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), formatString(msg, args), tr);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(tag, msg, tr);
        }
    }

    public static void d(Class<?> cls, String msg, Throwable tr) {
        if (mHandler.isLoggable(DEBUG)) {
            mHandler.d(getTag(cls), msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Object arg1) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, formatString(msg, arg1));
        }
    }

    public static void i(String tag, String msg, Object arg1, Object arg2) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, formatString(msg, arg1, arg2));
        }
    }

    public static void i(String tag, String msg, Object arg1, Object arg2, Object arg3) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, formatString(msg, arg1, arg2, arg3));
        }
    }

    public static void i(String tag, String msg, Object arg1, Object arg2, Object arg3, Object arg4) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, formatString(msg, arg1, arg2, arg3, arg4));
        }
    }

    public static void i(Class<?> cls, String msg) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), msg);
        }
    }

    public static void i(Class<?> cls, String msg, Object arg1) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), formatString(msg, arg1));
        }
    }

    public static void i(Class<?> cls, String msg, Object arg1, Object arg2) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), formatString(msg, arg1, arg2));
        }
    }

    public static void i(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), formatString(msg, arg1, arg2, arg3));
        }
    }

    public static void i(Class<?> cls, String msg, Object arg1, Object arg2, Object arg3,
                         Object arg4) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), formatString(msg, arg1, arg2, arg3, arg4));
        }
    }

    public static void i(String tag, String msg, Object... args) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, formatString(msg, args));
        }
    }

    public static void i(String tag, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, formatString(msg, args), tr);
        }
    }

    public static void i(Class<?> cls, String msg, Object... args) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), formatString(msg, args));
        }
    }

    public static void i(Class<?> cls, Throwable tr, String msg, Object... args) {
        if (isLoggable(INFO)) {
            mHandler.i(getTag(cls), formatString(msg, args), tr);
        }
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(tag, msg, tr);
        }
    }

    public static void i(Class<?> cls, String msg, Throwable tr) {
        if (mHandler.isLoggable(INFO)) {
            mHandler.i(getTag(cls), msg, tr);
        }
    }

    public static void w(String tag, String msg) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(tag, msg);
        }
    }

    public static void w(Class<?> cls, String msg) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(getTag(cls), msg);
        }
    }

    public static void w(String tag, String msg, Object... args) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(tag, formatString(msg, args));
        }
    }

    public static void w(String tag, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(tag, formatString(msg, args), tr);
        }
    }

    public static void w(Class<?> cls, String msg, Object... args) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(getTag(cls), formatString(msg, args));
        }
    }

    public static void w(Class<?> cls, Throwable tr, String msg, Object... args) {
        if (isLoggable(WARN)) {
            w(cls, formatString(msg, args), tr);
        }
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(tag, msg, tr);
        }
    }

    public static void w(Class<?> cls, String msg, Throwable tr) {
        if (mHandler.isLoggable(WARN)) {
            mHandler.w(getTag(cls), msg, tr);
        }
    }

    public static void e(String tag, String msg) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(tag, msg);
        }
    }

    public static void e(Class<?> cls, String msg) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(getTag(cls), msg);
        }
    }

    public static void e(String tag, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(tag, formatString(msg, args));
        }
    }

    public static void e(String tag, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(tag, formatString(msg, args), tr);
        }
    }

    public static void e(Class<?> cls, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(getTag(cls), formatString(msg, args));
        }
    }

    public static void e(Class<?> cls, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(getTag(cls), formatString(msg, args), tr);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(tag, msg, tr);
        }
    }

    public static void e(Class<?> cls, String msg, Throwable tr) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(getTag(cls), msg, tr);
        }
    }

    public static void wtf(String tag, String msg) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(tag, msg);
        }
    }

    public static void wtf(Class<?> cls, String msg) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.e(getTag(cls), msg);
        }
    }

    public static void wtf(String tag, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.wtf(tag, formatString(msg, args));
        }
    }

    public static void wtf(String tag, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.wtf(tag, formatString(msg, args), tr);
        }
    }

    public static void wtf(Class<?> cls, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.wtf(getTag(cls), formatString(msg, args));
        }
    }

    public static void wtf(Class<?> cls, Throwable tr, String msg, Object... args) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.wtf(getTag(cls), formatString(msg, args), tr);
        }
    }

    public static void wtf(String tag, String msg, Throwable tr) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.wtf(tag, msg, tr);
        }
    }

    public static void wtf(Class<?> cls, String msg, Throwable tr) {
        if (mHandler.isLoggable(ERROR)) {
            mHandler.wtf(getTag(cls), msg, tr);
        }
    }

    private static String formatString(String str, Object... args) {
        return String.format(null, str, args);
    }

    private static String getTag(Class<?> clazz) {
        return clazz.getSimpleName();
    }


}
