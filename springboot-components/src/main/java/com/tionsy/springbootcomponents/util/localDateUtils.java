package com.tionsy.springbootcomponents.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author tiany
 * @version 1.0
 * @date Created in 2020年11月10日 17:19
 * @since 1.0
 */
public class localDateUtils {
    public static final String DATE_PATTERN = "yyyyMMdd";
    public static final String DATE_PATTERN_LINE = "yyyy-MM-dd";
    public static final String DATE_PATTERN_BIAS = "yyyy/MM/dd";
    public static final String DATE_CHINESE_PATTERN = "yyyy年MM月dd日";
    public static final String DATETIME24_PATTERN = "yyyyMMddHHmmss";
    public static final String DATETIME24_PATTERN_LINE = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME12_PATTERN_LINE = "yyyy-MM-dd hh:mm:ss";
    public static final String DATETIME24_PATTERN_BIAS = "yyyy/MM/dd HH:mm:ss";
    public static final String DATETIME12_PATTERN_BIAS = "yyyy/MM/dd hh:mm:ss";
    public static final String DATETIME24_NOS_PATTERN_LINE = "yyyy-MM-dd HH:mm";

    /**
     * LocalDate转Date
     * @param localDate
     * @return
     */
    public static Date localDate2Date(LocalDate localDate) {
        if(null == localDate) {
            return null;
        }
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * Date转LocalDate
     * @param date
     */
    public static LocalDate date2LocalDate(Date date) {
        if(null == date) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * 获取两个日期相差天数
     * @return
     */
    public static long getDays(LocalDate start, LocalDate end){

        return end.toEpochDay() - start.toEpochDay();
    }

    /**
     * 获取当月第一天
     */

    /**
     * 获取当月最后一天
     */

    /**
     * 获取上月的今天
     */
}
