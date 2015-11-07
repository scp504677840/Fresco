package com.scp.frescoforhierarchy;

import android.util.Log;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by imahe001 on 2015/10/29.
 */
public class LogUtilDefaultLoggingDelegate implements LoggingDelegate {

    //创建一个SLogDefaultLoggingDelegate实例
    public static final LogUtilDefaultLoggingDelegate mInstance = new LogUtilDefaultLoggingDelegate();

    //定义默认的日志TAG
    private String mApplicationTag = "unknown";

    //定义默认的日志级别
    private int mMininumLogginLevel = Log.WARN;

    /**
     * 通过单例模式获取SLogDefaultLoggingDelegate实例
     *
     * @return SLogDefaultLoggingDelegate实例
     */
    public static LogUtilDefaultLoggingDelegate getInstance() {
        return mInstance;
    }

    //单例模式
    private LogUtilDefaultLoggingDelegate() {
    }

    /**
     * 设置应用日志的TAG
     *
     * @param tag TAG
     */
    public void setApplicationTag(String tag) {
        mApplicationTag = tag;
    }

    @Override
    public void setMininumLoggingLevel(int level) {
        mMininumLogginLevel = level;
    }

    @Override
    public int getMininuLoggingLevel() {
        return mMininumLogginLevel;
    }

    @Override
    public boolean isLoggable(int level) {
        return mMininumLogginLevel <= level;
    }

    @Override
    public void v(String tag, String msg) {
        println(Log.VERBOSE, tag, msg);
    }

    @Override
    public void v(String tag, String msg, Throwable tr) {
        println(Log.VERBOSE, tag, msg, tr);
    }

    @Override
    public void d(String tag, String msg) {
        println(Log.DEBUG, tag, msg);
    }

    @Override
    public void d(String tag, String msg, Throwable tr) {
        println(Log.DEBUG, tag, msg, tr);
    }

    @Override
    public void i(String tag, String msg) {
        println(Log.INFO, tag, msg);
    }

    @Override
    public void i(String tag, String msg, Throwable tr) {
        println(Log.INFO, tag, msg, tr);
    }

    @Override
    public void w(String tag, String msg) {
        println(Log.WARN, tag, msg);
    }

    @Override
    public void w(String tag, String msg, Throwable tr) {
        println(Log.WARN, tag, msg, tr);
    }

    @Override
    public void e(String tag, String msg) {
        println(Log.ERROR, tag, msg);
    }

    @Override
    public void e(String tag, String msg, Throwable tr) {
        println(Log.ERROR, tag, msg, tr);
    }

    @Override
    public void wtf(String tag, String msg) {
        println(Log.ERROR, tag, msg);
    }

    @Override
    public void wtf(String tag, String msg, Throwable tr) {
        println(Log.ERROR, tag, msg, tr);
    }

    @Override
    public void log(int priority, String tag, String msg) {
        println(priority, tag, msg);
    }

    /**
     * 输出日志
     *
     * @param priority 日志信息优先级
     * @param tag      用于标识一个日志信息的来源。它通常标识类或活动日志调用的地方。
     * @param msg      记录的信息
     */
    private void println(int priority, String tag, String msg) {
        Log.println(priority, prefixTag(tag), msg);
    }

    /**
     * 输出日志
     *
     * @param priority 日志信息优先级
     * @param tag      用于标识一个日志信息的来源。它通常标识类或活动日志调用的地方。
     * @param msg      记录的信息
     * @param tr       异常
     */
    private void println(int priority, String tag, String msg, Throwable tr) {
        Log.println(priority, prefixTag(tag), getMsg(msg, tr));
    }

    /**
     * 获取记录的信息
     *
     * @param msg 记录的消息
     * @param tr  异常
     * @return 记录的消息和异常的信息
     */
    private String getMsg(String msg, Throwable tr) {
        return msg + "\n" + getStackTraceString(tr);
    }

    /**
     * 获取异常文本信息
     *
     * @param tr 异常信息
     * @return 异常文本信息
     */
    private String getStackTraceString(Throwable tr) {
        if (tr == null) {
            return "";
        }
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        tr.printStackTrace(pw);
        return sw.toString();
    }

    /**
     * 在TAG前面添加一个前缀。
     *
     * @param tag TAG
     * @return 带有前缀的TAG或者原TAG
     */
    private String prefixTag(String tag) {
        if (mApplicationTag != null) {
            return mApplicationTag + ":" + tag;
        } else {
            return tag;
        }
    }

}
