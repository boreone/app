package com.photograph365.go.photograph.utils;

import android.util.Log;

import com.photograph365.go.photograph.ConfigBuild;

/**
 * Created by jake64 on 2017/8/21.
 */

public class LogUtil {
    private static final String LOG_PREFIX = "Tag";

    private static final boolean LOGGING_ENABLED = ConfigBuild.DEBUG;
    private static final int MAX_TAG_LENGTH = 23;//超过23个字符会报错
    private static final int LOG_PREFIX_LENGTH = LOG_PREFIX.length();

    public static String makeLogTag(Class clazz) {
        return makeLogTag(clazz.getSimpleName());
    }


    public static String makeLogTag(String str) {
        if (str.length() > MAX_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            return LOG_PREFIX + str.substring(0, MAX_TAG_LENGTH - LOG_PREFIX_LENGTH - 1);
        }

        return LOG_PREFIX + str;
    }


    public static void logD(final String tag, String message) {
        if (LOGGING_ENABLED) {
            //  if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, message);
            //  }
        }
    }

    public static void logD(final String tag, String message, Throwable cause) {
        if (LOGGING_ENABLED) {
            //   if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, message, cause);
            //   }
        }
    }

    public static void logV(final String tag, String message) {
        if (LOGGING_ENABLED) {
            if (Log.isLoggable(tag, Log.VERBOSE)) {
                Log.v(tag, message);
            }
        }
    }

    public static void logV(final String tag, String message, Throwable cause) {
        if (LOGGING_ENABLED) {
            if (Log.isLoggable(tag, Log.VERBOSE)) {
                Log.v(tag, message, cause);
            }
        }
    }

    public static void logI(final String tag, String message) {
        if (LOGGING_ENABLED) {
            Log.i(tag, message);
        }
    }

    public static void logI(final String tag, String message, Throwable cause) {
        if (LOGGING_ENABLED) {
            Log.i(tag, message, cause);
        }
    }

    public static void logW(final String tag, String message) {
        if (LOGGING_ENABLED) {
            Log.w(tag, message);
        }
    }

    public static void logW(final String tag, String message, Throwable cause) {
        if (LOGGING_ENABLED) {
            Log.w(tag, message, cause);
        }
    }

    public static void logE(final String tag, String message) {
        if (LOGGING_ENABLED) {
            Log.e(tag, message);
        }
    }

    public static void logE(final String tag, String message, Throwable cause) {
        if (LOGGING_ENABLED) {
            Log.e(tag, message, cause);
        }
    }

    /**
     * Utility class
     */
    private LogUtil() {
    }

}
