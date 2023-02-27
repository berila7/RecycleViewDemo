package com.example.recycleviewdemo

import androidx.appcompat.app.AppCompatDelegate

class ThemeSwitcher {
    companion object {
        fun switchTo(themeMode: Int) {
            when (themeMode) {
                AppCompatDelegate.MODE_NIGHT_NO -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                AppCompatDelegate.MODE_NIGHT_YES -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
                AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                }
                AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY -> {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY)
                }
            }
        }
    }
}
