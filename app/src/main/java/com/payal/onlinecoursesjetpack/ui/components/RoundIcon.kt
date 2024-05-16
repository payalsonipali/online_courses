package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payal.onlinecoursesjetpack.R
import com.payal.onlinecoursesjetpack.ui.theme.Grey50

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoundIcon(
    icon: Int,
    description: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        shape = CircleShape,
        colors = CardDefaults.cardColors(
            containerColor = Grey50
        ),
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = description,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Preview
@Composable
fun RoundIconPreview() {
    RoundIcon(
        onClick = {
        },
        icon = R.drawable.search,
        description = ""
    )
}