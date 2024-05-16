package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.payal.onlinecoursesjetpack.R

@Composable
fun HomeHeader(
    onSearch: () -> Unit
) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo"
            )
            Spacer(modifier = Modifier.weight(1f))
            RoundIcon(
                icon = R.drawable.notification,
                description = "notification",
                onClick = {}
            )
            RoundIcon(
                icon = R.drawable.search,
                description = "notification",
                onClick = onSearch
            )
        }
        Text(
            text = "Hello Katie,",
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 20.sp,
                fontWeight = FontWeight(500)
            )
        )
        Text(
            text = "What would you like to learn today?",
            style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight(400)
            )
        )
    }
}

@Preview
@Composable
fun HomeHeaderPreview() {
    HomeHeader(
        onSearch = {
        }
    )
}