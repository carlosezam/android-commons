package com.carlosezam.commons.android.coroutines

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface CoroutineDispatcherProvider {
    val Main: CoroutineDispatcher
    val Default: CoroutineDispatcher
    val IO: CoroutineDispatcher
    val Unconfined: CoroutineDispatcher
}

object DefaultDispatcherProvider : CoroutineDispatcherProvider {

    override val Main: CoroutineDispatcher
        get() = Dispatchers.Main

    override val Default: CoroutineDispatcher
        get() = Dispatchers.Default

    override val IO: CoroutineDispatcher
        get() = Dispatchers.IO

    override val Unconfined: CoroutineDispatcher
        get() = Dispatchers.Unconfined

}