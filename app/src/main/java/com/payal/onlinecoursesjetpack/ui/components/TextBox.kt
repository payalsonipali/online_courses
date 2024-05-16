package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextBox(
    text: String,
    bgColor: Color,
    textColor: Color,
    radius: Dp,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = bgColor,
                shape = RoundedCornerShape(radius)
            )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodySmall.copy(
                color = textColor,
                fontSize = 8.sp
            ),
            modifier = Modifier.padding(vertical = 1.dp, horizontal = 2.dp)
        )
    }
}

@Composable
fun TextBoxPreview() {
    TextBox(
        text = "My text",
        bgColor = Color.White,
        textColor = Color.Black,
        radius = 20.dp
    )
}