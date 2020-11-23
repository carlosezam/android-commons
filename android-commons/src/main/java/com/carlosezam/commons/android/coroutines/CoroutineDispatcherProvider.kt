package com.carlosezam.commons.android.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainCoroutineDispatcher

interface CoroutineDispatcherProvider {
    val Main: MainCoroutineDispatcher
    val Default: CoroutineDispatcher
    val IO: CoroutineDispatcher
    val Unconfined: CoroutineDispatcher
}

object DefaultDispatcherProvider : CoroutineDispatcherProvider {

    override val Main: MainCoroutineDispatcher
        get() = Dispatchers.Main

    override val Default: CoroutineDispatcher
        get() = Dispatchers.Default

    override val IO: CoroutineDispatcher
        get() = Dispatchers.IO

    override val Unconfined: CoroutineDispatcher
        get() = Dispatchers.Unconfined

}