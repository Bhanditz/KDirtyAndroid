/*
 * Copyright 2016 Victor Albertos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package presentation.foundation.transformations

import io.reactivex.CompletableTransformer

interface TransformationsCompletable {

    /**
     * Prepare the single to use an io thread for subscription and to observe on the UI thread only after
     * the stream of data has reached this point.
     */
    fun schedules(): CompletableTransformer

    /**
     * Outputs the formatted exception on [android.support.design.widget.Snackbar] and resume
     * the error returning an empty single.
     */
    fun reportOnSnackBar(): CompletableTransformer

    /**
     * Outputs the formatted exception on [android.widget.Toast] and resume the error returning
     * an empty single.
     */
    fun reportOnToast(): CompletableTransformer

    /**
     * Show a loading dialog just before single is subscribed and hide it after it is completed.
     */
    fun loading(): CompletableTransformer

    /**
     * Show a loading dialog just before single is subscribed and hide it after it is completed.

     * @param content Text to display in the dialog
     */
    fun loading(content: String): CompletableTransformer
}