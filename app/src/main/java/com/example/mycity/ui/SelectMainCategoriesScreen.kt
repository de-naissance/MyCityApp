package com.example.mycity.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.data.MainCategories

@Composable
fun SelectMainCategoriesScreen(
    myCityViewModel: MyCityViewModel, // Не доконца уверен в этом решении
    option: List<MainCategories>,
    onNextCategoriesClicked: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        option.forEach { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement =  Arrangement.Start
            ) {
                Button(
                    onClick = {
                        onNextCategoriesClicked()
                        myCityViewModel.updateSelectedSubcategories(
                            nameSelectedTitle = item.nameCategories,
                            subcategories = item.subcategories
                        )
                    },
                    contentPadding = PaddingValues(
                        horizontal = 20.dp,
                        vertical = 12.dp
                    ),
                    modifier = modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.filledTonalButtonColors(
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                        contentColor = MaterialTheme.colorScheme.onTertiaryContainer
                    )
                ) {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = stringResource(item.nameCategories),
                        modifier = Modifier.size(ButtonDefaults.IconSize)
                    )
                    Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
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

@Preview(showBackground = true)
@Composable
fun SelectOptionPreview() {
    // SelectMainCategoriesScreen(option = categories)
}
