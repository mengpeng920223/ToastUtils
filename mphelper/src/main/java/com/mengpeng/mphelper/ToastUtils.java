package com.mengpeng.mphelper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 作者：MengPeng
 * 时间：2018/3/8 - 下午3:23
 * 说明：
 */
public class ToastUtils {
    private static Toast currentToast;
    private static ToastUtils toastUtils;

    public static ToastUtils getInstance() {
        if (toastUtils == null) {
            toastUtils = new ToastUtils();
        }
        return toastUtils;
    }

    public void initToast(Context context) {
        if (null == currentToast) {
            currentToast = new Toast(context);
        }
    }


    public static void onSuccessShowToast(Context context, String message) {
        showToast(context, message, R.mipmap.toast_success,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onSuccessShowToast(Context context, int messageID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, R.mipmap.toast_success,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onSuccessShowToast(Context context, String message, int iconID) {
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onSuccessShowToast(Context context, int messageID, int iconID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onErrorShowToast(Context context, String message, int iconID) {
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onErrorShowToast(Context context, int messageID, int iconID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onErrorShowToast(Context context, String message) {
        showToast(context, message, R.mipmap.toast_error,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onErrorShowToast(Context context, int messageID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, R.mipmap.toast_error,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onDefaultShowToast(Context context, int messageID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, R.mipmap.toast_default,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultShowToast(Context context, String message) {
        showToast(context, message, R.mipmap.toast_default,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultShowToast(Context context, int messageID, int iconID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultShowToast(Context context, String message, int iconID) {
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultWithoutIconShowToast(Context context, int messageID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, 0,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onDefaultWithoutIconShowToast(Context context, String message) {
        showToast(context, message, 0,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onWarnShowToast(Context context, int messageID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, R.mipmap.toast_warn,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onWarnShowToast(Context context, String message) {
        showToast(context, message, R.mipmap.toast_warn,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onWarnShowToast(Context context, int messageID, int iconID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onWarnShowToast(Context context, String message, int iconID) {
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onInfoShowToast(Context context, int messageID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, R.mipmap.toast_info,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }

    public static void onInfoShowToast(Context context, String message) {
        showToast(context, message, R.mipmap.toast_info,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }

    public static void onInfoShowToast(Context context, int messageID, int iconID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }

    public static void onInfoShowToast(Context context, String message, int iconID) {
        showToast(context, message, iconID,
                ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }


    public static void onShowToast(Context context, String message, int iconID) {
        onShowToast(context, message, iconID, ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onShowToast(Context context, int message, int iconID) {
        onShowToast(context, message, iconID, ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onShowToast(Context context, String message, int iconID, int toastDrawableID) {
        onShowToast(context, message, iconID, ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, toastDrawableID);
    }

    public static void onShowToast(Context context, int message, int iconID, int toastDrawableID) {
        onShowToast(context, message, iconID, ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, toastDrawableID);
    }

    public static void onShowToast(Context context, String message) {
        onShowToast(context, message, 0, ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onShowToast(Context context, int message) {
        onShowToast(context, message, 0, ContextCompat.getColor(context, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onShowToast(Context context, int messageID, int iconID,
                                   @ColorInt int textColor, int toastDrawableID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID, textColor, Toast.LENGTH_SHORT, true, toastDrawableID);
    }

    public static void onShowToast(Context context, String message, int iconID,
                                   @ColorInt int textColor, int toastDrawableID) {
        showToast(context, message, iconID, textColor, Toast.LENGTH_SHORT, true, toastDrawableID);
    }


    public static void onShowToast(Context context, String message, int iconID,
                                   @ColorInt int textColor, int duration, boolean withIcon, int toastDrawableID) {
        showToast(context, message, iconID, textColor, duration, withIcon, toastDrawableID);
    }

    public static void onShowToast(Context context, int messageID, int iconID,
                                   @ColorInt int textColor, int duration, boolean withIcon, int toastDrawableID) {
        String message = context.getResources().getString(messageID);
        showToast(context, message, iconID, textColor, duration, withIcon, toastDrawableID);
    }


    private static void showToast(Context context, String message, int iconID,
                                  @ColorInt int textColor, int duration, boolean withIcon, int toastDrawableID) {

        if (currentToast == null) {
            currentToast = new Toast(context);
        }

        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        RelativeLayout toast_container = view.findViewById(R.id.toast_container);
        ImageView toast_icon = view.findViewById(R.id.toast_icon);
        TextView toast_message = view.findViewById(R.id.toast_message);

        //左边的icon
        if (withIcon && iconID != 0) {
            toast_icon.setVisibility(View.VISIBLE);
            toast_icon.setImageDrawable(ContextCompat.getDrawable(context, iconID));
            toast_message.setPadding(dp2px(context, 10), 0, 0, 0);
        } else {
            toast_icon.setVisibility(View.GONE);
            toast_message.setPadding(0, 0, 0, 0);
        }
        //右边的message
        toast_message.setText(message);
        if (0 != textColor) {
            toast_message.setTextColor(textColor);
        } else {
            toast_message.setTextColor(ContextCompat.getColor(context, R.color.toastDefaultTextColor));
        }
        //背景样式
        if (0 != toastDrawableID) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                toast_container.setBackground(ContextCompat.getDrawable(context, toastDrawableID));
            } else {
                toast_container.setBackgroundDrawable(ContextCompat.getDrawable(context, toastDrawableID));
            }
        }

        toast_message.setTypeface(Typeface.create("sans-serif-condensed", Typeface.NORMAL));
        currentToast.setView(view);
        currentToast.setDuration(duration);

        currentToast.show();

    }

    private static int dp2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5F);
    }

}
