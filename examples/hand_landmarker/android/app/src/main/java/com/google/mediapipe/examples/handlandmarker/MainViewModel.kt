/*
 * Copyright 2022 The TensorFlow Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.mediapipe.examples.handlandmarker

import androidx.lifecycle.ViewModel

/**
 *  This ViewModel is used to store hand landmarker helper settings
 */
class MainViewModel : ViewModel() {

    private var _delegate: Int = HandLandmarkerHelper.DELEGATE_CPU
    private var _minConfidence: Float = HandLandmarkerHelper.DEFAULT_THRESHOLD
    private var _maxHands: Int = HandLandmarkerHelper.DEFAULT_NUM_HANDS

    val currentDelegate: Int get() = _delegate
    val currentMinConfidence: Float get() = _minConfidence
    val currentMaxHands: Int get() = _maxHands

    fun setDelegate(delegate: Int) {
        _delegate = delegate
    }

    fun setMinConfidence(threshold: Float) {
        _minConfidence = threshold
    }

    fun setMaxHands(maxResults: Int) {
        _maxHands = maxResults
    }
}
