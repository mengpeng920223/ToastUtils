package com.mengpeng.toastutils

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_success.setOnClickListener({
            ToastUtils.onSuccessShowToast("成功toast")
        })

        textView_error.setOnClickListener({
            ToastUtils.onErrorShowToast("失败toast")
        })

        textView_default.setOnClickListener({
            ToastUtils.onDefaultShowToast("默认toast")
        })
        textView_warn.setOnClickListener({
            ToastUtils.onWarnShowToast("Warn toast")
        })
        textView_info.setOnClickListener({
            ToastUtils.onInfoShowToast("Info toast")
        })
    }
}
