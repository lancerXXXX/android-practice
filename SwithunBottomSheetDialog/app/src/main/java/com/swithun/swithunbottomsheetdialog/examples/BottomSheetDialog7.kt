package com.swithun.swithunbottomsheetdialog.examples

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.swithun.swithunbottomsheetdialog.BottomSheetDialog
import com.swithun.swithunbottomsheetdialog.BottomSheetDialogLayout
import com.swithun.swithunbottomsheetdialog.R

class BottomSheetDialog7: BottomSheetDialog() {
    override fun onCreateContentView(
        inflater: LayoutInflater,
        contentViewWrapper: BottomSheetDialogLayout,
        savedInstanceState: Bundle?
    ) {
        inflater.inflate(R.layout.bottom_sheet_dialog_0, contentViewWrapper, true)
        contentViewWrapper.asIBottomSheetDialogLayoutSetting().customStateList = listOf(
            BottomSheetDialogLayout.CustomHeight.Bottom(0),
            BottomSheetDialogLayout.CustomHeight.Number(1300),
            BottomSheetDialogLayout.CustomHeight.Highest(0)
        )
        contentViewWrapper.asIBottomSheetDialogLayoutSetting().initState = 1
        contentViewWrapper.asIBottomSheetDialogLayoutSetting().stateListener = { state ->
            if (state == 0) {
                this.dismiss()
            }
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.testClick)?.setOnClickListener {
            Toast.makeText(view.context, "hahah", Toast.LENGTH_SHORT).show()
        }
        view.findViewById<TextView>(R.id.clickButton)?.setOnClickListener {
            Toast.makeText(view.context, "hahah", Toast.LENGTH_SHORT).show()
        }
    }
}