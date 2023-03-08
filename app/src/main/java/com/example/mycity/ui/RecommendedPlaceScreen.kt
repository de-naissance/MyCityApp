package com.example.mycity.ui

import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.data.RecommendedPlace
import com.example.mycity.data.local.LocalRecommendedPlace.allRecommendedPlace
import com.example.mycity.ui.theme.MyCityTheme

@Composable
fun RecommendedPlaceScreen(
    recommendedPlace: RecommendedPlace,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(ScrollState(0)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyRow(
            modifier = modifier,
            horizontalArrangement = Arrangement.Center,
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 18.dp)
        ){
            items(recommendedPlace.ImagePlace) { image ->
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier
                        .fillParentMaxWidth(1f)
                        .aspectRatio(16f / 9f)
                        .padding(horizontal = 12.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    //.border(BorderStroke(4.dp, Color(0xFF2A1800)), RoundedCornerShape(20.dp))
                )
            }
        }
        CardLocation(
            modifier = modifier,
            address = recommendedPlace.address,
            coordinate = recommendedPlace.coordinate
        )
        Card(
            modifier = modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .clip(RoundedCornerShape(10.dp)),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant
            )
        ) {
            Column(
                modifier = modifier
                    .clip(RoundedCornerShape(40.dp)),
            ) {
                Text(
                    text = "Описание:",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                )
                Text(
                    text = stringResource(id = recommendedPlace.placeDescription),
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Left,
                    modifier = modifier
                        .padding(start = 20.dp, end = 20.dp, bottom = 16.dp)
                )
            }
        }
    }
}

@Composable
private fun CardLocation(
    modifier: Modifier = Modifier,
    @StringRes address: Int,
    @StringRes coordinate: Int,
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .clip(RoundedCornerShape(10.dp)),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            contentColor = MaterialTheme.colorScheme.onSurfaceVariant
        )
    ) {
        Column(
            modifier = modifier
                .clip(RoundedCornerShape(20.dp))
                .fillMaxWidth()
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
                .clip(RoundedCornerShape(40.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = modifier.padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Местоположение",
                )
                Spacer(modifier = modifier.weight(1f))
                ItemButton(
                    expanded = expanded,
                    onClick = { expanded = !expanded },
                    modifier = modifier
                )
            }
            if(expanded) {
                Location(
                    address = address,
                    coordinate = coordinate
                )
            }
        }
    }
}

@Composable
private fun ItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = "Местоположение",
            tint = MaterialTheme.colorScheme.onPrimary,
            modifier = modifier
                .padding()
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colorScheme.primary),
        )
    }
}

@Composable
private fun Location(
    modifier: Modifier = Modifier,
    @StringRes address: Int,
    @StringRes coordinate: Int,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = modifier.padding(bottom = 5.dp)
        ) {
            Text(
                text = "Адрес:",
                style = MaterialTheme.typography.titleSmall,
                modifier = modifier.padding(end = 5.dp)
            )
            Text(
                text = stringResource(id = address),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Row(
            modifier = modifier.padding(bottom = 5.dp)
        ) {
            Text(
                text = "Координаты:",
                style = MaterialTheme.typography.titleSmall,
                modifier = modifier.padding(end = 5.dp)
            )
            Text(
                text = stringResource(id = coordinate),
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedPlaceScreenPreview() {
    MyCityTheme(darkTheme = false) {
        RecommendedPlaceScreen(
            recommendedPlace = allRecommendedPlace[3]
        )
    }
}