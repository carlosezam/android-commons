package com.carlosezam.commons.android.syntacticsugar

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract


fun unless(predicate: Boolean, block: () -> Unit ) : Unit {
    if( !predicate ) block()
}