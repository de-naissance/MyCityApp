package com.example.mycity.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.data.Subcategories
import com.example.mycity.data.local.Attractions.attractions
import com.example.mycity.data.local.HomeScreenCategories.categories

@Composable
fun SelectSubcategoriesScreen(
    option: List<Subcategories>,
    onSelectionCategories: (String) -> Unit = {},
    onNextCategoriesClicked: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var selectedValue by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        option.forEach { item ->
            Row(
                modifier = Modifier
                    /*.selectable(
                    selected = selectedValue == stringResource(item.nameCategories),
                    onClick = {

                        *//*selectedValue = Text(stringResource(item.second))
                        onSelectionChanged(item.second)*//*
                    } )*/
                    .fillMaxWidth()
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement =  Arrangement.Start
            ) {
                Button(
                    onClick = { onNextCategoriesClicked },
                    contentPadding = PaddingValues(
                        horizontal = 20.dp,
                        vertical = 12.dp
                    ),
                    modifier = modifier.fillMaxWidth(),
                ) {
                    Text(stringResource(item.nameCategories))
                    Spacer(modifier = modifier.weight(1f))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelectSubcategoriesPreview() {
    SelectSubcategoriesScreen(option = attractions)
}
