package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payal.onlinecoursesjetpack.R
import com.payal.onlinecoursesjetpack.ui.theme.Grey80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarView(
    state: MutableState<TextFieldValue>,
    placeholder: String
) {
    TextField(
        value = state.value,
        onValueChange = { value ->
            state.value = value
        },
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(30.dp)
            ),
        placeholder = {
            Text(
                text = placeholder,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Grey80
                )
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            containerColor = Color.White
        ),
        maxLines = 1,
        singleLine = true,
        textStyle = TextStyle(
            color = Color.Gray,
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "search",
                modifier = Modifier.padding(10.dp)
            )
        },
        trailingIcon = {
            Image(
                painter = painterResource(id = R.drawable.trailing_icon),
                contentDescription = "trailingIcon",
                modifier = Modifier.padding(10.dp)
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun SearchBarViewPreview() {
    SearchBarView(
        placeholder = "Search for Courses",
        state = remember {
            mutableStateOf(TextFieldValue(""))
        }
    )
}