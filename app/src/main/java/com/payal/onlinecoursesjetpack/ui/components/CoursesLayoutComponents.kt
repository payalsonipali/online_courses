package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.payal.onlinecoursesjetpack.model.ExploreCourse
import com.payal.onlinecoursesjetpack.model.FeaturedSubject
import com.payal.onlinecoursesjetpack.ui.theme.Green
import com.payal.onlinecoursesjetpack.ui.theme.LightGreen
import com.payal.onlinecoursesjetpack.utils.exploreCourses
import com.payal.onlinecoursesjetpack.utils.featuredSubjects

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ExploreCourses(
    contentHeader: @Composable () -> Unit,
    courses: List<ExploreCourse>,
    onSelectItem: (ExploreCourse) -> Unit
) {
    contentHeader()
    FlowRow(
        maxItemsInEachRow = 2,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        for (course in courses) {
            Surface(
                shape = RoundedCornerShape(20.dp),
                color = course.bgColor,
                modifier = Modifier
                    .height(89.dp)
                    .weight(1f)
                    .clickable(
                        onClick = { onSelectItem(course) }
                    )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Image(
                            painter = painterResource(id = course.image),
                            contentDescription = null,
                            modifier = Modifier.size(89.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Column {
                        Text(
                            text = course.courseName,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight(600)
                            ),
                        )
                        Text(
                            text = "${course.members} Enrolled",
                            style = MaterialTheme.typography.bodySmall,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ResumeCourses(
    courses: List<FeaturedSubject>,
    onClick: () -> Unit
) {
    ContentHeader(
        title = "Resume Courses",
        onClick = onClick
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(courses) {
            GradientCard(
                image = it.image,
                title = it.title,
                subTitle = it.subTitle,
                timeStamp = {},
                linearProgress = {
                    LinearProgressIndicator(
                        progress = it.progress,
                        color = Green,
                        trackColor = LightGreen,
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .fillMaxWidth()
                            .height(2.dp)
                    )
                }
            )
        }
    }
}

@Composable
fun FeaturedSubjects(
    featuredSubjects: List<FeaturedSubject>,
    onClick: () -> Unit
) {
    ContentHeader(
        title = "Explore Courses",
        onClick = onClick
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        items(featuredSubjects) {
            GradientCard(
                image = it.image,
                title = it.title,
                subTitle = it.subTitle,
                timeStamp = { modifier ->
                    Box(
                        modifier = modifier
                            .padding(bottom = 10.dp, end = 10.dp)
                            .background(
                                color = Color.Black.copy(alpha = 0.4f),
                                shape = RoundedCornerShape(4.dp)
                            )
                    ) {
                        Text(
                            text = it.timeStamp,
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = Color.White,
                                fontSize = 8.sp
                            ),
                            modifier = Modifier.padding(vertical = 1.dp, horizontal = 2.dp)
                        )
                    }
                },
                linearProgress = {
                }
            )
        }
    }
}

@Preview
@Composable
fun ExploreCoursesPreview() {
    ExploreCourses(
        courses = exploreCourses,
        contentHeader = {
        },
        onSelectItem = {
        }
    )
}

@Preview
@Composable
fun ResumeCoursesPreview() {
    ResumeCourses(
        courses = featuredSubjects,
        onClick = {
        }
    )
}

@Preview
@Composable
fun FeaturedSubjectsPreview() {
    FeaturedSubjects(
        featuredSubjects = featuredSubjects,
        onClick = {
        }
    )
}