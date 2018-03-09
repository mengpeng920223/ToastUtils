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
    private static Context mContext;

    public static ToastUtils getInstance() {
        if (toastUtils == null) {
            toastUtils = new ToastUtils();
        }
        return toastUtils;
    }

    public void initToast(Context context) {
        if (null == mContext) {
            this.mContext = context;
        }
        if (null == currentToast) {
            currentToast = new Toast(mContext);
        }
    }

    public static void onSuccessShowToast(String message) {
        showToast(message, R.mipmap.toast_success,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onSuccessShowToast(int messageID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, R.mipmap.toast_success,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onSuccessShowToast(String message, int iconID) {
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onSuccessShowToast(int messageID, int iconID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_success_shape);
    }

    public static void onErrorShowToast(String message, int iconID) {
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onErrorShowToast(int messageID, int iconID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onErrorShowToast(String message) {
        showToast(message, R.mipmap.toast_error,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onErrorShowToast(int messageID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, R.mipmap.toast_error,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_error_shape);
    }

    public static void onDefaultShowToast(int messageID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, R.mipmap.toast_default,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultShowToast(String message) {
        showToast(message, R.mipmap.toast_default,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultShowToast(int messageID, int iconID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultShowToast(String message, int iconID) {
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onDefaultWithoutIconShowToast(int messageID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, 0,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onDefaultWithoutIconShowToast(String message) {
        showToast(message, 0,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onWarnShowToast(int messageID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, R.mipmap.toast_warn,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onWarnShowToast(String message) {
        showToast(message, R.mipmap.toast_warn,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onWarnShowToast(int messageID, int iconID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onWarnShowToast(String message, int iconID) {
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_warn_shape);
    }

    public static void onInfoShowToast(int messageID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, R.mipmap.toast_info,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }

    public static void onInfoShowToast(String message) {
        showToast(message, R.mipmap.toast_info,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }

    public static void onInfoShowToast(int messageID, int iconID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }

    public static void onInfoShowToast(String message, int iconID) {
        showToast(message, iconID,
                ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_info_shape);
    }


    public static void onShowToast(String message, int iconID) {
        onShowToast(message, iconID, ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onShowToast(int message, int iconID) {
        onShowToast(message, iconID, ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, R.drawable.toast_default_shape);
    }

    public static void onShowToast(String message, int iconID, int toastDrawableID) {
        onShowToast(message, iconID, ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, toastDrawableID);
    }

    public static void onShowToast(int message, int iconID, int toastDrawableID) {
        onShowToast(message, iconID, ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, true, toastDrawableID);
    }

    public static void onShowToast(String message) {
        onShowToast(message, 0, ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }

    public static void onShowToast(int message) {
        onShowToast(message, 0, ContextCompat.getColor(mContext, R.color.toastDefaultTextColor),
                Toast.LENGTH_SHORT, false, R.drawable.toast_default_shape);
    }


    public static void onShowToast(String message, int iconID,
                                   @ColorInt int textColor, int duration, boolean withIcon, int toastDrawableID) {
        showToast(message, iconID, textColor, duration, withIcon, toastDrawableID);
    }

    public static void onShowToast(int messageID, int iconID,
                                   @ColorInt int textColor, int duration, boolean withIcon, int toastDrawableID) {
        String message = mContext.getResources().getString(messageID);
        showToast(message, iconID, textColor, duration, withIcon, toastDrawableID);
    }


    private static void showToast(String message, int iconID,
                                  @ColorInt int textColor, int duration, boolean withIcon, int toastDrawableID) {

        if (currentToast == null) {
            currentToast = new Toast(mContext);
        }

        @SuppressLint("InflateParams")
        View view = LayoutInflater.from(mContext).inflate(R.layout.toast_layout, null);
        RelativeLayout toast_container = view.findViewById(R.id.toast_container);
        ImageView toast_icon = view.findViewById(R.id.toast_icon);
        TextView toast_message = view.findViewById(R.id.toast_message);

        //左边的icon
        if (withIcon && iconID != 0) {
            toast_icon.setVisibility(View.VISIBLE);
            toast_icon.setImageDrawable(ContextCompat.getDrawable(mContext, iconID));
            toast_message.setPadding(dp2px(10), 0, 0, 0);
        } else {
            toast_icon.setVisibility(View.GONE);
            toast_message.setPadding(0, 0, 0, 0);
        }
        //右边的message
        toast_message.setText(message);
        if (0 != textColor) {
            toast_message.setTextColor(textColor);
        } else {
            toast_message.setTextColor(ContextCompat.getColor(mContext, R.color.toastDefaultTextColor));
        }
        //背景样式
        if (0 != toastDrawableID) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                toast_container.setBackground(ContextCompat.getDrawable(mContext, toastDrawableID));
            } else {
                toast_container.setBackgroundDrawable(ContextCompat.getDrawable(mContext, toastDrawableID));
            }
        }

        toast_message.setTypeface(Typeface.create("sans-serif-condensed", Typeface.NORMAL));
        currentToast.setView(view);
        currentToast.setDuration(duration);

        currentToast.show();

    }

    private static int dp2px(float dpValue) {
        float scale = mContext.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5F);
    }

}
