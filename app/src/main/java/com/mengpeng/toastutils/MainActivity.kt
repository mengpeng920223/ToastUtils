package com.mengpeng.toastutils

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_success.setOnClickListener({
            ToastUtils.onSuccessShowToast(this, "成功toast")
        })

        textView_error.setOnClickListener({
            ToastUtils.onErrorShowToast(this, "失败toast")
        })

        textView_default.setOnClickListener({
            ToastUtils.onDefaultShowToast(this, "默认toast")
        })
        textView_warn.setOnClickListener({
            ToastUtils.onWarnShowToast(this, "Warn toast")
        })
        textView_info.setOnClickListener({
            ToastUtils.onInfoShowToast(this, "Info toast")
        })
    }
}
