package com.example.mycity.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = Color(0xffffcd68),
    primaryVariant = Color(0xffe1e7b0),
    background = Color(0xffffe4be), // Всё верно бекграунд
    surface = Color(0xffaa8c5c), // Фон внутри блоков
    onSurface = Color(0xFF281900),
    onPrimary = Color(0xFF452B00),
    secondary = Color(0xFFDDC3A2),

    /* primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
    Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

private val LightColors = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)


private val DarkColors = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
    tertiary = md_theme_dark_tertiary,
    onTertiary = md_theme_dark_onTertiary,
    tertiaryContainer = md_theme_dark_tertiaryContainer,
    onTertiaryContainer = md_theme_dark_onTertiaryContainer,
    error = md_theme_dark_error,
    errorContainer = md_theme_dark_errorContainer,
    onError = md_theme_dark_onError,
    onErrorContainer = md_theme_dark_onErrorContainer,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
    outline = md_theme_dark_outline,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inverseSurface = md_theme_dark_inverseSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    outlineVariant = md_theme_dark_outlineVariant,
    scrim = md_theme_dark_scrim,
)

/*private val replyLightColorScheme = lightColorScheme(
    primary = Color(0xffffc972), // Главные элементы выбора
    onPrimary = Color(0xFF281900), // Цвет внутри первичного
    primaryContainer= Color(0xff006c44), // Пока хз
    onPrimaryContainer= Color(0xff006c44), // Пока хз
    secondary = Color(0xffaa8c5c), // Пока хз
    onSecondary = Color(0xff00d477),
    tertiary = Color(0xFF243516), // Пока хз
    onTertiary = Color(0xFF243516), // Пока хз
    tertiaryContainer = Color(0xff00d477),//Color(0xFF3A4C2B),
    onTertiaryContainer = Color(0xff00d477),//Color(0xFFD3EABC),
    background = Color(0xfffffbff), // Всё верно бекграунд
    onBackground = Color(0xff251a00),
    surface = Color(0xffffdf9c), // Фон топБара
    onSurface = Color(0xff251a00), // Цвет шрифта топ бара
    surfaceVariant = Color(0xffffe4be), // Фон моих карт
    onSurfaceVariant = Color(0xff4e4539), // Цвет внутри моих карт
    surfaceTint = Color(0xff006c44),
    inverseSurface = Color(0xffaa8c5c),
    inverseOnSurface = Color(0xff00d477),
    error = Color(0xff00d477),
    onError = Color(0xff00d477),
    errorContainer = Color(0xff00d477),
    onErrorContainer = Color(0xff00d477),
    outline = Color(0xff00d477),
    outlineVariant = Color(0xff00d477),
    scrim = Color(0xff00d477),
)*/

@Composable
fun MyCityTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }
    MaterialTheme(
        colorScheme = colors,
        typography = MyCityTypography,
        shapes = Shapes,
        content = content
    )

}