package com.payal.onlinecoursesjetpack.utils

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import coil.size.Size
import com.payal.onlinecoursesjetpack.R
import com.payal.onlinecoursesjetpack.model.BottomNavigationItem
import com.payal.onlinecoursesjetpack.model.ExploreCourse
import com.payal.onlinecoursesjetpack.model.FeaturedSubject
import com.payal.onlinecoursesjetpack.model.Master
import com.payal.onlinecoursesjetpack.ui.navigation.home
import com.payal.onlinecoursesjetpack.ui.navigation.my_course
import com.payal.onlinecoursesjetpack.ui.navigation.profile
import com.payal.onlinecoursesjetpack.ui.navigation.watch_list
import com.payal.onlinecoursesjetpack.ui.theme.LightBlue
import com.payal.onlinecoursesjetpack.ui.theme.LightGreen
import com.payal.onlinecoursesjetpack.ui.theme.LightOrange
import com.payal.onlinecoursesjetpack.ui.theme.LightPurple

val bottomNavigationItems = listOf(
    BottomNavigationItem(
        title = home,
        selectedIcon = Icons.Filled.Home,
        unSelectedItem = Icons.Outlined.Home
    ),
    BottomNavigationItem(
        title = my_course,
        selectedIcon = Icons.Filled.AccountBox,
        unSelectedItem = Icons.Outlined.AccountBox
    ),
    BottomNavigationItem(
        title = watch_list,
        selectedIcon = Icons.Filled.Favorite,
        unSelectedItem = Icons.Outlined.Favorite
    ),
    BottomNavigationItem(
        title = profile,
        selectedIcon = Icons.Filled.Person,
        unSelectedItem = Icons.Outlined.Person
    )
)

val exploreCourses = listOf(
    ExploreCourse(
        image = R.drawable.explore_course_1,
        courseName = "B.Tech",
        members = "50K",
        bgColor = LightOrange
    ),
    ExploreCourse(
        image = R.drawable.explore_course_2,
        courseName = "GATE",
        members = "2.4K",
        bgColor = LightGreen
    ),
    ExploreCourse(
        image = R.drawable.explore_course_3,
        courseName = "2.4K",
        members = "50K",
        bgColor = LightPurple
    ),
    ExploreCourse(
        image = R.drawable.explore_course_4,
        courseName = "UPSC",
        members = "2.4K",
        bgColor = LightBlue
    )
)

val masters = listOf(
    Master(
        image = R.drawable.master1,
        name = "Manu M Rajan",
        profession = "14 times All India Gate Rank"
    ),
    Master(
        image = R.drawable.master2,
        name = "Dr. K Renganathan",
        profession = "G-Level ISRO Scientist"
    ),
    Master(
        image = R.drawable.master3,
        name = "Sekhar Sir",
        profession = "Prominent Figure"
    )
)

val featuredSubjects = listOf(
    FeaturedSubject(
        image = R.drawable.featured_sub_img1,
        title = "Z Transform using EQN I",
        subTitle = "Digital Signal Processing",
        timeStamp = "1H 20m",
        progress = 0.5f
    ),
    FeaturedSubject(
        image = R.drawable.feature_sub_img2,
        title = "Z Transform using EQN I",
        subTitle = "Digital Signal Processing",
        timeStamp = "1H 20m",
        progress = 0.5f
    )
)

val topics1 = listOf(
    "Mechanical Engineering",
    "Electronics & Communications"
)

val topics2 = listOf(
    "Electronics & Instrumentations",
    "Computer Science",
    "Electrical & Electronics Engineering\n"
)

val multiTopics = listOf(topics1, topics2)

val btechBranchCourses = listOf(
    ExploreCourse(
        image = R.drawable.explore_course_1,
        courseName = "MECH",
        members = "MechanicalEngineering",
        bgColor = LightOrange
    ),
    ExploreCourse(
        image = R.drawable.explore_course_2,
        courseName = "AEI",
        members = "Applied Electronics and Instrumentation",
        bgColor = LightGreen
    ),
    ExploreCourse(
        image = R.drawable.explore_course_1,
        courseName = "ECE",
        members = "Mechanical Engineering",
        bgColor = LightOrange
    ),
    ExploreCourse(
        image = R.drawable.explore_course_2,
        courseName = "CSE",
        members = "Applied Electronics and Instrumentation",
        bgColor = LightGreen
    ),
    ExploreCourse(
        image = R.drawable.explore_course_1,
        courseName = "EIE",
        members = "Mechanical Engineering",
        bgColor = LightOrange
    ),
    ExploreCourse(
        image = R.drawable.explore_course_2,
        courseName = "EEE",
        members = "Applied Electronics and Instrumentation",
        bgColor = LightGreen
    ),
    ExploreCourse(
        image = R.drawable.explore_course_1,
        courseName = "EIE",
        members = "Mechanical Engineering",
        bgColor = LightOrange
    ),
    ExploreCourse(
        image = R.drawable.explore_course_2,
        courseName = "BME",
        members = "Applied Electronics and Instrumentation",
        bgColor = LightGreen
    )
)