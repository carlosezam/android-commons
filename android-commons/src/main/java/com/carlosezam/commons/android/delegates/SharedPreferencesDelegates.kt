package com.carlosezam.commons.android.delegates

import android.content.SharedPreferences
import androidx.core.content.edit
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

interface SharedPreferencesHolder {
    val sharedPreferences: SharedPreferences
}

class StringPreferenceDelegate<H : SharedPreferencesHolder>(
    private val key: String,
    private val defaultValue: String = ""
) : ReadWriteProperty<H, String> {
    override fun getValue(thisRef: H, property: KProperty<*>): String = thisRef.sharedPreferences.getString(key, defaultValue)!!
    override fun setValue(thisRef: H, property: KProperty<*>, value: String) = thisRef.sharedPreferences.edit(true) { putString(key, value) }
}

class IntPreferenceDelegate<H : SharedPreferencesHolder>(
    private val key: String,
    private val defaultValue: Int = 0
) : ReadWriteProperty<H, Int> {
    override fun getValue(thisRef: H, property: KProperty<*>): Int = thisRef.sharedPreferences.getInt(key, defaultValue)
    override fun setValue(thisRef: H, property: KProperty<*>, value: Int) = thisRef.sharedPreferences.edit(true) { putInt(key, value) }
}

class BooleanPreferenceDelegate<H : SharedPreferencesHolder>(
    private val key: String,
    private val defaultValue: Boolean = false
) : ReadWriteProperty<H, Boolean> {
    override fun getValue(thisRef: H, property: KProperty<*>): Boolean = thisRef.sharedPreferences.getBoolean(key, defaultValue)
    override fun setValue(thisRef: H, property: KProperty<*>, value: Boolean) = thisRef.sharedPreferences.edit(true) { putBoolean(key, value) }
}

class FloatPreferencesDelegate<H: SharedPreferencesHolder>(
    private val key: String,
    private val defaultValue: Float = 0f
) : ReadWriteProperty<H, Float> {
    override fun getValue(thisRef: H, property: KProperty<*>): Float = thisRef.sharedPreferences.getFloat(key, defaultValue)
    override fun setValue(thisRef: H, property: KProperty<*>, value: Float) = thisRef.sharedPreferences.edit( true ){ putFloat(key, value) }
}

class LongPreferencesDelegate<H: SharedPreferencesHolder>(
    private val key: String,
    private val defaultValue: Long = 0
) : ReadWriteProperty<H, Long> {
    override fun getValue(thisRef: H, property: KProperty<*>): Long = thisRef.sharedPreferences.getLong(key, defaultValue)
    override fun setValue(thisRef: H, property: KProperty<*>, value: Long) = thisRef.sharedPreferences.edit( true ){ putLong(key, value) }
}

class SetPreferencesDelegate<H: SharedPreferencesHolder>(
    private val key: String,
    private val defaultValue: Set<String>? = null
) : ReadWriteProperty<H, Set<String>?> {
    override fun getValue(thisRef: H, property: KProperty<*>): MutableSet<String>? = thisRef.sharedPreferences.getStringSet(key, defaultValue)
    override fun setValue(thisRef: H, property: KProperty<*>, value: Set<String>?) = thisRef.sharedPreferences.edit( true ){ putStringSet(key, value) }
}