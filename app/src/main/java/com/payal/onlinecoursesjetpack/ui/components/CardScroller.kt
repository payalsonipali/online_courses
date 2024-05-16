package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.payal.onlinecoursesjetpack.R
import com.payal.onlinecoursesjetpack.ui.theme.Green
import com.payal.onlinecoursesjetpack.ui.theme.Grey80
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarouselCard(
    pagerState: PagerState
) {
    HorizontalPager(
        state = pagerState,
    ) {
        Surface(
            shape = RoundedCornerShape(30.dp),
            color = Black,
            modifier = Modifier
                .height(194.dp)
        ) {
            Box {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.scroller_image),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxHeight()
                            .aspectRatio(2f)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 20.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "CRACK DSP IN",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight(700)
                        ),
                        modifier = Modifier
                            .background(color = White)
                            .padding(3.dp),
                    )
                    Spacer(modifier = Modifier.padding(top = 2.dp))
                    Text(
                        text = "JUST 12 HOURS⏰",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight(700)
                        ),
                        modifier = Modifier
                            .background(color = White)
                            .padding(3.dp),
                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(
                        text = "Learn More",
                        modifier = Modifier
                            .background(color = Green)
                            .padding(5.dp),
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = White
                        )
                    )
                }
                Box(
                    modifier = Modifier
                        .wrapContentHeight()
                        .align(Alignment.BottomCenter)
                ) {
                    PageIndicator(pagerState)
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PageIndicator(
    pagerState: PagerState
) {
    val scope = rememberCoroutineScope()
    Row(
        Modifier.wrapContentHeight(),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(pagerState.pageCount) { iteration ->
            val color = if (pagerState.currentPage == iteration) White else Grey80
            Box(
                modifier = Modifier
                    .padding(bottom = 6.dp, start = 2.dp, end = 2.dp)
                    .clip(CircleShape)
                    .background(color)
                    .size(4.dp)
                    .clickable(
                        onClick = {
                            scope.launch {
                                pagerState.animateScrollToPage(iteration)
                            }
                        },
                    )
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun CardScrollerPreview() {
    CarouselCard(
        pagerState = rememberPagerState(pageCount = { 3 })
    )
}