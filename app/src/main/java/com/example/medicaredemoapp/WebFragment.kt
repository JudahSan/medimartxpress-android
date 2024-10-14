package com.example.medicaredemoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.hotwire.turbo.fragments.TurboWebFragment
import dev.hotwire.turbo.nav.TurboNavGraphDestination
import java.util.zip.Inflater

@TurboNavGraphDestination(uri = "turbo://fragment/web")
class WebFragment : TurboWebFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceString: Bundle?): View? {
        return inflater.inflate(R.layout.web_fragment, container, false)
    }
    override fun shouldObserveTitleChanges(): Boolean {
        return false
    }
}
