package com.example.mycity.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R

@Composable
fun RecommendedPlaceScreen(
    @DrawableRes image: Int,
    @StringRes body: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp),
        elevation = 5.dp,
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = modifier
                    .padding(vertical = 10.dp, horizontal = 12.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .border(BorderStroke(4.dp, Color(0xFF2A1800)), RoundedCornerShape(20.dp))
                    .fillMaxWidth()
            )
            Spacer(modifier = modifier.size(10.dp))
            Text(
                text = stringResource(id = body),
                style = MaterialTheme.typography.body1,
                modifier = modifier
                    .verticalScroll(ScrollState(0))
                    .padding(horizontal = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedPlaceScreenPreview() {
    RecommendedPlaceScreen(
        image = R.drawable.fountain_seven_girls,
        body = R.string.fountain_seven_girls_description
    )
}