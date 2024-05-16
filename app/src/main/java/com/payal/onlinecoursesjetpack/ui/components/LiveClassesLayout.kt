package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.payal.onlinecoursesjetpack.ui.theme.Red

@Composable
fun LiveClassesLayout() {
    Surface(
        shape = RoundedCornerShape(30.dp),
        color = Color.Black,
        modifier = Modifier
            .height(194.dp)
    ) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.live_class_img),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(2f)
            )

            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 30.dp, bottom = 20.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Red
                        ),
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 5.dp, vertical = 1.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.reader_logo),
                                contentDescription = "live",
                                tint = Color.White
                            )
                            Text(
                                text = " Live",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = Color.White
                                ),
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Free",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.White
                        ),
                        modifier = Modifier
                            .background(
                                color = Green,
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(vertical = 1.dp, horizontal = 8.dp)
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(start = 20.dp, top = 20.dp, bottom = 20.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Code: MET202",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.White,
                    fontSize = 8.sp
                ),
                modifier = Modifier
                    .background(
                        color = Color.White.copy(alpha = 0.3f),
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(vertical = 2.dp, horizontal = 5.dp)
            )
            Text(
                text = "Engineering\nThermodynamics",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight(700),
                    color = Color.White,
                ),
            )
            Column {
                Text(
                    text = "16/5/2024 | 12:00 AM",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = Color.White
                    )
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google_meet_logo),
                        contentDescription = "google_meet_logo",
                        modifier = Modifier
                            .size(14.dp)
                    )
                    Text(
                        text = "Google Meet",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.White
                        )
                    )
                }
            }
            Text(
                text = "Notify Me",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Color.White
                ),
                modifier = Modifier
                    .border(
                        border = BorderStroke(
                            width = 1.dp,
                            color = Color.White
                        ),
                        shape = RoundedCornerShape(28.dp)
                    )
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }
    }
}

@Composable
fun YouTubeLiveLayout() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(201.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Gradient1,
                        Gradient2
                    ),
                ),
                shape = RoundedCornerShape(16.dp)
            ),
    ) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.img1), // Replace with your image resource
                contentDescription = "Descriptive Alt Text",
                modifier = Modifier
                    .padding(top = 10.dp, start = 10.dp, bottom = 10.dp, end = 5.dp)
                    .weight(1f),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img2), // Replace with your image resource
                    contentDescription = "Descriptive Alt Text",
                    modifier = Modifier
                        .padding(vertical = 10.dp)
                        .weight(2f),
                    contentScale = ContentScale.Crop
                )
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 10.dp),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img3), // Replace with your image resource
                        contentDescription = "Descriptive Alt Text",
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.img4), // Replace with your image resource
                        contentDescription = "Descriptive Alt Text",
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, end = 10.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.youtube_logo),
                    contentDescription = "youtube_logo",
                    modifier = Modifier
                        .width(26.dp)
                        .height(18.dp)
                )
                Text(
                    text = "Top Live Videos on Youtube",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color.White,
                        fontWeight = FontWeight(500)
                    ),
                    modifier = Modifier.padding(top = 5.dp)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Box(
                    modifier = Modifier
                        .border(
                            shape = RoundedCornerShape(30.dp),
                            border = BorderStroke(width = 1.dp, color = Color.White)
                        )
                ) {
                    Text(
                        text = "Watch Now",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = Color.White
                        ),
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
fun LiveClassesLayoutPreview() {
    LiveClassesLayout()
}

@Preview
@Composable
fun YouTubeLiveLayoutPreview() {
    YouTubeLiveLayout()
}