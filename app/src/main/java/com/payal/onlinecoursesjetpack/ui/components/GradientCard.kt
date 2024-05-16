package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.payal.onlinecoursesjetpack.R
import com.payal.onlinecoursesjetpack.ui.theme.Gradient1
import com.payal.onlinecoursesjetpack.ui.theme.Gradient2
import com.payal.onlinecoursesjetpack.ui.theme.Green
import com.payal.onlinecoursesjetpack.ui.theme.Grey50
import com.payal.onlinecoursesjetpack.ui.theme.Grey80
import com.payal.onlinecoursesjetpack.ui.theme.LightGreen

@Composable
fun GradientCard(
    image: Int,
    title: String,
    subTitle: String,
    timeStamp: @Composable (Modifier) -> Unit,
    linearProgress: @Composable () -> Unit
) {
    Column(
        modifier = Modifier.width(186.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Gradient1,
                            Gradient2
                        )
                    ),
                    shape = RoundedCornerShape(16.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Descriptive Alt Text",
                modifier = Modifier
                    .height(122.dp)
                    .width(130.dp)
            )
            timeStamp(Modifier.align(Alignment.BottomEnd))
        }
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight(600)
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(
            text = subTitle,
            style = MaterialTheme.typography.bodySmall.copy(
                fontWeight = FontWeight(400),
                fontSize = 10.sp,
                color = Gray
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = 5.dp)
        )
        linearProgress()
    }
}

@Preview(showBackground = true)
@Composable
fun GradientCardPreview() {
    GradientCard(
        image = R.drawable.featured_sub_img1,
        title = "My Course",
        subTitle = "My course is...",
        timeStamp = {
        },
        linearProgress = {
        }
    )
}