package com.carlosezam.commons.android.syntacticsugar

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract


fun unless(predicate: Boolean, block: () -> Unit ) : Unit {
    if( !predicate ) block()
}

fun <T> tryOrNull(
    function : () -> T
) : T? =
    try {
        function()
    } catch (e: Exception) {
        null
    }

suspend fun <T> tryOrNullSuspend(
    function: suspend () -> T
) : T?  =
    try {
        function()
    } catch (e: Exception) {
        null
    }