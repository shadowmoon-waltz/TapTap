package com.kieronquinn.app.taptap.ui.screens.setup.configuration.troubleshooting

import android.os.Bundle
import com.afollestad.materialdialogs.MaterialDialog
import com.kieronquinn.app.taptap.R
import com.kieronquinn.app.taptap.components.base.BaseBottomSheetDialogFragment

class TroubleshootingBottomSheetDialogFragment: BaseBottomSheetDialogFragment() {

    override fun onMaterialDialogCreated(materialDialog: MaterialDialog, savedInstanceState: Bundle?): MaterialDialog = materialDialog.apply {
        title(R.string.bs_troubleshooting_title)
        message(R.string.bs_troubleshooting_content)
        withOk()
    }

}