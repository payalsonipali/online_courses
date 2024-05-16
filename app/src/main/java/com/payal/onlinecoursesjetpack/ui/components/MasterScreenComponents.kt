package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.payal.onlinecoursesjetpack.model.Master
import com.payal.onlinecoursesjetpack.ui.theme.Grey70
import com.payal.onlinecoursesjetpack.utils.masters
import com.payal.onlinecoursesjetpack.utils.multiTopics

@Composable
fun MeetTheMaster(
    masters: List<Master>,
    onClick: () -> Unit
) {
    ContentHeader(
        title = "Meet the Masters",
        onClick = onClick
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(masters) {
            Box(
                modifier = Modifier
                    .height(177.dp)
                    .width(131.dp)
                    .background(
                        shape = RoundedCornerShape(18.dp),
                        color = Color.Black
                    )
            ) {
                Image(
                    painter = painterResource(id = it.image),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Text(
                        text = it.name,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.White,
                            fontWeight = FontWeight(500)
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = it.profession,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Grey70,
                            fontWeight = FontWeight(400),
                            fontSize = 8.sp
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
fun TopTopics(
    multiTopics: List<List<String>>,
    onClick: () -> Unit
) {
    ContentHeader(
        title = "Top Topics",
        onClick = onClick
    )
    for (topics in multiTopics) {
        Spacer(modifier = Modifier.height(15.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(topics) {
                Surface(
                    modifier = Modifier
                        .border(
                            shape = RoundedCornerShape(28.dp),
                            border = BorderStroke(width = 1.dp, color = Color.Black)
                        )
                ) {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodySmall,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(vertical = 10.dp, horizontal = 14.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun MeetTheMasterPreview() {
    MeetTheMaster(
        masters = masters,
        onClick = {
        }
    )
}

@Preview
@Composable
fun TopTopicsPreview() {
    TopTopics(
        multiTopics = multiTopics,
        onClick = {
        }
    )
}