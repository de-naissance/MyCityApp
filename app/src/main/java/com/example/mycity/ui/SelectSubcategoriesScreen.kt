package com.example.mycity.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
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
    myCityViewModel: MyCityViewModel,
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
                    onClick = {
                        onNextCategoriesClicked()
                        myCityViewModel.updateRecommendedPlace(
                            place = item.recommendedPlace
                        )
                              },
                    contentPadding = PaddingValues(
                        horizontal = 20.dp,
                        vertical = 12.dp
                    ),
                    modifier = modifier.fillMaxWidth(),
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer
                    )
                ) {
                    Text(
                        stringResource(item.nameCategories),
                        style = MaterialTheme.typography.bodyMedium,
                    )
                    Spacer(modifier = modifier.weight(1f))
                }
            }
        }
    }
}

/*@Preview(showBackground = true)
@Composable
fun SelectSubcategoriesPreview() {
    SelectSubcategoriesScreen(option = attractions)
}*/
