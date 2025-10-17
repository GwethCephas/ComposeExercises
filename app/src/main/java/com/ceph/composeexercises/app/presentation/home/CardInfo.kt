package com.ceph.composeexercises.app.presentation.home

import android.icu.util.Currency
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import java.util.Locale

data class CardInfo(
    val title: String,
    val description: String,
    val cardContainerColor: Color,
    val cardContentColor: Color,
    val action: () -> Unit,
    val actionButtonText: String,
    val actionButtonContainerColor: Color,
    val actionButtonContentColor: Color,
    val amount: String,
    val icon: ImageVector,
    val currency: String = Currency.getInstance("NGN").getSymbol(Locale("en", "NG"))

)
