package com.tionsy.springbootcomponents.util;

import com.googlecode.concurrentlinkedhashmap.ConcurrentLinkedHashMap;
import com.googlecode.concurrentlinkedhashmap.Weighers;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

@Slf4j
public final class DateUtil {

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

    private static final Set<String> DATE_PATTERN_SET = new HashSet<String>() {
        {
            addAll(Arrays.asList(new String[]{DATE_PATTERN, DATE_PATTERN_LINE, DATE_PATTERN_BIAS, DATE_CHINESE_PATTERN}));
        }
    };

    private static final Set<String> DATETIME_PATTERN_SET = new HashSet<String>(){
        {
            addAll(Arrays.asList(new String[]{DATETIME24_PATTERN, DATETIME24_PATTERN_LINE, DATETIME12_PATTERN_LINE, DATETIME24_PATTERN_BIAS, DATETIME12_PATTERN_BIAS}));
        }
    };

    private static final ConcurrentMap<String, DateTimeFormatter> FORMATTER_CACHE = new ConcurrentLinkedHashMap
            .Builder<String, DateTimeFormatter>().maximumWeightedCapacity(50).weigher(Weighers.singleton()).build();

    private static DateTimeFormatter getFormatter(String pattern) {
        if (pattern == null || pattern.trim().length() == 0) {
            throw new IllegalArgumentException("Pattern can not be empty");
        }
        DateTimeFormatter formatter = FORMATTER_CACHE.get(pattern);
        if (formatter == null) {
            formatter = DateTimeFormatter.ofPattern(pattern);
            DateTimeFormatter oldFormatter = FORMATTER_CACHE.putIfAbsent(pattern, formatter);
            if (oldFormatter != null) {
                formatter = oldFormatter;
            }
        }
        return formatter;
    }

    public static Long getTimeDiff(Date timest, Date timeed, int type) {
        try {
            if (timest == null) {
                log.info("getTimeDiff timest 为空！");
                return null;
            } else if (timeed == null) {
                log.info("getTimeDiff timeed 为空！");
                return null;
            } else {
                Long result = null;
                switch(type) {
                    case 1:
                        result = getDiffDays(timest, timeed);
                        break;
                    case 2:
                        result = getDiffHours(timest, timeed);
                        break;
                    case 3:
                        result = getDiffMinutes(timest, timeed);
                        break;
                    case 4:
                        result = getDiffSeconds(timest, timeed);
                        break;
                    case 5:
                        result = getDiffStamp(timest, timeed);
                        break;
                    default:
                        log.info("getTimeDiff type未定义！");
                }

                return result;
            }
        } catch (Exception var4) {
            log.error("getTimeDiff 异常：" + var4.getMessage());
            return null;
        }
    }

    private static Long getDiffDays(Date timest, Date timeed) {
        try {
            Calendar calst = Calendar.getInstance();
            Calendar caled = Calendar.getInstance();
            calst.setTime(timest);
            caled.setTime(timeed);
            log.info("LongDiffDays 开始时间：" + formatDate(timest, "yyyy-MM-dd"));
            log.info("LongDiffDays 结束时间：" + formatDate(timeed, "yyyy-MM-dd"));
            calst.set(11, 0);
            calst.set(12, 0);
            calst.set(13, 0);
            caled.set(11, 0);
            caled.set(12, 0);
            caled.set(13, 0);
            Long days = (Long.valueOf(caled.getTime().getTime() / 1000L) - Long.valueOf(calst.getTime().getTime() / 1000L)) / 3600L / 24L;
            return days;
        } catch (Exception var5) {
            log.error("LongDiffDays 异常：" + var5.getMessage());
            return null;
        }
    }

    private static Long getDiffHours(Date timest, Date timeed) {
        try {
            Calendar calst = Calendar.getInstance();
            Calendar caled = Calendar.getInstance();
            calst.setTime(timest);
            caled.setTime(timeed);
            log.info("LongDiffDays 开始时间：" + formatDate(timest, "yyyy-MM-dd HH:mm:ss"));
            log.info("LongDiffDays 结束时间：" + formatDate(timeed, "yyyy-MM-dd HH:mm:ss"));
            calst.set(12, 0);
            calst.set(13, 0);
            caled.set(12, 0);
            caled.set(13, 0);
            Long hoerss = (Long.valueOf(caled.getTime().getTime() / 1000L) - Long.valueOf(calst.getTime().getTime() / 1000L)) / 3600L;
            return hoerss;
        } catch (Exception var5) {
            log.error("getDiffHours 异常：" + var5.getMessage());
            return null;
        }
    }

    private static Long getDiffMinutes(Date timest, Date timeed) {
        try {
            Calendar calst = Calendar.getInstance();
            Calendar caled = Calendar.getInstance();
            calst.setTime(timest);
            caled.setTime(timeed);
            log.info("LongDiffDays 开始时间：" + formatDate(timest, "yyyy-MM-dd HH:mm:ss"));
            log.info("LongDiffDays 结束时间：" + formatDate(timeed, "yyyy-MM-dd HH:mm:ss"));
            calst.set(13, 0);
            caled.set(13, 0);
            Long minutess = (Long.valueOf(caled.getTime().getTime() / 1000L) - Long.valueOf(calst.getTime().getTime() / 1000L)) / 60L;
            return minutess;
        } catch (Exception var5) {
            log.info("getDiffMinutes 异常：" + var5.getMessage());
            return null;
        }
    }

    private static Long getDiffSeconds(Date timest, Date timeed) {
        try {
            Calendar calst = Calendar.getInstance();
            Calendar caled = Calendar.getInstance();
            calst.setTime(timest);
            caled.setTime(timeed);
            log.info("LongDiffDays 开始时间：" + formatDate(timest, "yyyy-MM-dd HH:mm:ss"));
            log.info("LongDiffDays 结束时间：" + formatDate(timeed, "yyyy-MM-dd HH:mm:ss"));
            Long minutess = Long.valueOf(caled.getTime().getTime() / 1000L) - Long.valueOf(calst.getTime().getTime() / 1000L);
            return minutess;
        } catch (Exception var5) {
            log.error("getDiffSeconds 异常：" + var5.getMessage());
            return null;
        }
    }

    private static Long getDiffStamp(Date timest, Date timeed) {
        try {
            Calendar calst = Calendar.getInstance();
            Calendar caled = Calendar.getInstance();
            calst.setTime(timest);
            caled.setTime(timeed);
            log.info("LongDiffDays 开始时间：" + formatDate(timest, "yyyy-MM-dd HH:mm:ss"));
            log.info("LongDiffDays 结束时间：" + formatDate(timeed, "yyyy-MM-dd HH:mm:ss"));
            Long stamps = Long.valueOf(caled.getTime().getTime()) - Long.valueOf(calst.getTime().getTime());
            return stamps;
        } catch (Exception var5) {
            log.error("getDiffStamp 异常：" + var5.getMessage());
            return null;
        }
    }

    public static String formatDate(Date date, String formatePattern) {
        if (formatePattern == null || formatePattern.trim().length() <= 0) {
            formatePattern = "yyyy-MM-dd HH:mm:ss";
        }

        if (date == null) {
            return "";
        } else {
            SimpleDateFormat dateFormate = new SimpleDateFormat(formatePattern);
            return dateFormate.format(date);
        }
    }

    public static Date nowDate() {
        LocalDate localDate = LocalDate.now();
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static String nowStrDate() {
        return nowStrDate(DATE_PATTERN_LINE);
    }

    public static String nowStrDate(String pattern) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = getFormatter(pattern);
        return formatter.format(localDate);
    }

    public static Date nowDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static String nowStrDateTime() {
        return nowStrDateTime(DATETIME24_PATTERN_LINE);
    }

    public static String nowStrDateTime(String pattern) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = getFormatter(pattern);
        return formatter.format(localDateTime);
    }

    public static String format(Date date, String pattern) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        DateTimeFormatter formatter = getFormatter(pattern);
        return formatter.format(localDateTime);
    }

    public static Date parse(String date, String pattern) {
        DateTimeFormatter formatter = getFormatter(pattern);
        if (DATE_PATTERN_SET.contains(pattern)) {
            LocalDate localDate = LocalDate.parse(date, formatter);
            ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
            return Date.from(zonedDateTime.toInstant());
        } else if (DATETIME_PATTERN_SET.contains(pattern)) {
            LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
            ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
            return Date.from(zonedDateTime.toInstant());
        } else {
            throw new IllegalArgumentException("The current date format is not supported");
        }
    }

    public static Date plus(Date date, long amountToAdd, TimeUnit timeUnit) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        localDateTime = localDateTime.plus(amountToAdd, timeUnit.unit);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static Date minus(Date date, long amountToSubtract, TimeUnit timeUnit) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        localDateTime = localDateTime.minus(amountToSubtract, timeUnit.unit);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static Date getMonthEndDate(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        localDateTime = localDateTime.with(TemporalAdjusters.lastDayOfMonth());
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static int getDay(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return localDateTime.getDayOfMonth();
    }

    public static Date setDay(Date date, int day) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        localDateTime = localDateTime.withDayOfMonth(day);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static int getMonth(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return localDateTime.getMonthValue();
    }

    public static Date setMonth(Date date, int month) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        localDateTime = localDateTime.withMonth(month);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public static int getYear(Date date) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        return localDateTime.getYear();
    }

    public static Date setYear(Date date, int year) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        localDateTime = localDateTime.withYear(year);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Date.from(zonedDateTime.toInstant());
    }

    public enum TimeUnit {

        SECONDS("Seconds", ChronoUnit.SECONDS),
        MINUTES("Minutes", ChronoUnit.MINUTES),
        HOURS("Hours", ChronoUnit.HOURS),
        DAYS("Days", ChronoUnit.DAYS),
        WEEKS("Weeks", ChronoUnit.WEEKS),
        MONTHS("Months", ChronoUnit.MONTHS),
        YEARS("Years", ChronoUnit.YEARS);

        private final String name;
        private final ChronoUnit unit;

        private TimeUnit(String name, ChronoUnit unit) {
            this.name = name;
            this.unit = unit;
        }

    }

    public static void main(String[] args) {
        Date s = DateUtil.parse("2018-11-30 17:30:00", DATETIME24_PATTERN_LINE);
        Date e = DateUtil.plus(s, 3, TimeUnit.MONTHS);
        System.out.println(DateUtil.format(e, DATE_PATTERN_LINE));
    }

}
