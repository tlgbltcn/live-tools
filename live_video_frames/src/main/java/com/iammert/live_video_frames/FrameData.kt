package com.iammert.live_video_frames

import android.graphics.Bitmap

data class FrameData(val bitmap: Bitmap, val fillRatio: Float) {
    companion object {
        const val FULL_RATIO = 1.0f
    }
}