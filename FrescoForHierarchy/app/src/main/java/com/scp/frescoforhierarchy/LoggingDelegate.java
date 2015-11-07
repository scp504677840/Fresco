package com.scp.frescoforhierarchy;

/**
 *
 */
public interface LoggingDelegate {
    /**
     * 设置一个最低等级的日志不会被日志记录器所记录或者其它检查
     *
     * @param level 设置的最低等级
     */
    void setMininumLoggingLevel(int level);

    /**
     * 是否能被记录
     *
     * @return 低等级
     */
    int getMininuLoggingLevel();

    /**
     * 获取指定的等级是否要记录
     *
     * @param level 指定的日志等级
     * @return 这个等级
     */
    boolean isLoggable(int level);

    /**
     * 发送一个VERBOSE级别的日志信息
     *
     * @param tag 用于识别一个日志信息的来源。它通常标识类或活动日志调用发生的地方。
     * @param msg 记录的信息
     */
    void v(String tag, String msg);

    /**
     * 发送一个VERBOSE级别的日志信息和一个异常信息
     *
     * @param tag 用于识别一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     * @param tr  异常信息
     */
    void v(String tag, String msg, Throwable tr);

    /**
     * 发送一个DEBUG级别的日志信息
     *
     * @param tag 用于识别一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     */
    void d(String tag, String msg);

    /**
     * 发送一个DEBUG级别的日志信息和一个异常信息
     *
     * @param tag 用于识别一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     * @param tr  异常信息
     */
    void d(String tag, String msg, Throwable tr);

    /**
     * 发送一个INFO级别的日志信息
     *
     * @param tag 用于识别一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     */
    void i(String tag, String msg);

    /**
     * 发送一个INFO级别的日志信息和一个异常信息
     *
     * @param tag 用于识别一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     * @param tr  异常信息
     */
    void i(String tag, String msg, Throwable tr);

    /**
     * 发送一个WARN级别的日志信息
     *
     * @param tag 用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     */
    void w(String tag, String msg);

    /**
     * 发送一个WARN级别的日志信息和一个异常信息
     *
     * @param tag 用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     * @param tr  异常信息
     */
    void w(String tag, String msg, Throwable tr);

    /**
     * 发送一个ERROR级别的日志信息
     *
     * @param tag 用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     */
    void e(String tag, String msg);

    /**
     * 发送一个ERROR级别的日志信息和一个异常信息
     *
     * @param tag 用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     * @param tr  异常信息
     */
    void e(String tag, String msg, Throwable tr);

    /**
     * 发送一个ERROR级别的日志信息
     * 发送wtf应用错误报告(取样)
     * 注意:这不相当于android.util.Log#wtf
     *
     * @param tag 用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     */
    void wtf(String tag, String msg);

    /**
     * 发送一个ERROR级别的日志信息
     *
     * @param tag 用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg 记录的信息
     * @param tr  异常信息
     */
    void wtf(String tag, String msg, Throwable tr);

    /**
     * 日志信息
     *
     * @param priority 日志信息的优先级
     * @param tag      用于标识一个日志信息的来源。它通常标识类或活动日志调用发生的地方
     * @param msg      记录的信息
     */
    void log(int priority, String tag, String msg);
}
