package com.payal.onlinecoursesjetpack.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.payal.onlinecoursesjetpack.R
import com.payal.onlinecoursesjetpack.ui.components.CarouselCard
import com.payal.onlinecoursesjetpack.ui.components.ContentHeader
import com.payal.onlinecoursesjetpack.ui.components.ExploreCourses
import com.payal.onlinecoursesjetpack.ui.components.FeaturedSubjects
import com.payal.onlinecoursesjetpack.ui.components.HomeHeader
import com.payal.onlinecoursesjetpack.ui.components.LiveClassesLayout
import com.payal.onlinecoursesjetpack.ui.components.MeetTheMaster
import com.payal.onlinecoursesjetpack.ui.components.ResumeCourses
import com.payal.onlinecoursesjetpack.ui.components.TopTopics
import com.payal.onlinecoursesjetpack.ui.components.YouTubeLiveLayout
import com.payal.onlinecoursesjetpack.ui.navigation.selectedCoursesScreen
import com.payal.onlinecoursesjetpack.utils.exploreCourses
import com.payal.onlinecoursesjetpack.utils.featuredSubjects
import com.payal.onlinecoursesjetpack.utils.masters
import com.payal.onlinecoursesjetpack.utils.multiTopics

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    Surface(
        color = White
    ) {
        val pagerState = rememberPagerState(pageCount = { 3 })

        Column(
            modifier = Modifier.padding(horizontal = 10.dp)
        ) {
            HomeHeader(
                onSearch = {
                    navHostController.navigate(selectedCoursesScreen)
                }
            )
            Spacer(modifier = Modifier.height(20.dp))
            CarouselCard(
                pagerState = pagerState
            )
            Spacer(modifier = Modifier.height(20.dp))
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                item {
                    ExploreCourses(
                        courses = exploreCourses,
                        contentHeader = {
                            ContentHeader(
                                title = "Explore Courses",
                                onClick = {
                                }
                            )
                        },
                        onSelectItem = { // TODO handled events at top level of ui
                        }
                    )
                }
                item {
                    MeetTheMaster(
                        masters = masters,
                        onClick = { // TODO handled event
                        }
                    )
                }
                item {
                    FeaturedSubjects(
                        featuredSubjects = featuredSubjects,
                        onClick = { // TODO handled event
                        }
                    )
                }
                item {
                    TopTopics(
                        multiTopics = multiTopics,
                        onClick = { // TODO handled event
                        }
                    )
                }
                item {
                    YouTubeLiveLayout()
                }
                item {
                    ResumeCourses(
                        courses = featuredSubjects,
                        onClick = { // TODO handled event
                        }
                    )
                }
                item {
                    Image(
                        painter = painterResource(id = R.drawable.question_paper_bg),
                        contentDescription = "question_paper_bg",
                        modifier = Modifier
                            .weight(1f),
                        contentScale = ContentScale.Crop
                    )
                }
                item {
                    LiveClassesLayout()
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navHostController = rememberNavController()
    )
}