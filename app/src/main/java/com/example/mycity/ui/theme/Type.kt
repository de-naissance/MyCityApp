package com.example.mycity.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mycity.R


val Rubik = FontFamily(
    Font(R.font.rubik_regular),
    Font(R.font.rubik_bold, FontWeight.Bold),
    Font(R.font.rubik_light, FontWeight.Light),
    Font(R.font.rubik_sem_bold, FontWeight.SemiBold),
    Font(R.font.rubik_medium, FontWeight.Medium)
)

val Comfortaa = FontFamily(
    Font(R.font.comfortaa_regular),
    Font(R.font.comfortaa_bold, FontWeight.Bold),
    Font(R.font.comfortaa_light, FontWeight.Light),
    Font(R.font.comfortaa_medium, FontWeight.Medium)
)

val MyCityTypography = Typography(
    displayMedium = TextStyle(
        fontFamily = Comfortaa,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Rubik,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    )
)