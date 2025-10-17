package com.ceph.composeexercises.app.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    val cardItems = listOf(
        CardInfo(
            title = "Account Balance",
            description = "The total balance from your linked bank accounts.",
            cardContainerColor = Color(0xFF008080),
            cardContentColor = Color(0xFFFAFAFA),
            action = {},
            actionButtonText = "Link bank accounts",
            actionButtonContainerColor = Color(0xFFFAFAFA),
            actionButtonContentColor = Color(0xFF008080),
            amount = "0.00",
            icon = Icons.Default.Visibility
        ),
        CardInfo(
            title = "Total Savings",
            description = "You haven't created any savings goal yet.",
            cardContainerColor = Color(0xFFFF952B),
            cardContentColor = Color(0xFFFAFAFA),
            action = {},
            actionButtonText = "Add a savings goal",
            actionButtonContainerColor = Color(0xFFFAFAFA),
            actionButtonContentColor = Color(0xFFFF952B),
            amount = "0.00",
            icon = Icons.Default.Visibility
        ),
        CardInfo(
            title = "Monthly budget",
            description = "You haven't created any budgets yet.",
            cardContainerColor = Color(0xFFFAFAFA),
            cardContentColor = Color.Black,
            action = {},
            actionButtonText = "Create a budget",
            actionButtonContainerColor = Color(0xFF008080),
            actionButtonContentColor = Color(0xFFFAFAFA),
            amount = "0.00",
            icon = Icons.Default.Visibility,
        ),
        CardInfo(
            title = "Total expenses",
            description = "You haven't linked any bank accounts yet.",
            cardContainerColor = Color(0xFFFFE6CC),
            cardContentColor = Color.Black,
            action = {},
            actionButtonText = "Link bank accounts",
            actionButtonContainerColor = Color(0xFF008080),
            actionButtonContentColor = Color(0xFFFAFAFA),
            amount = "0.00",
            icon = Icons.Default.Visibility
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                title = {
                    Column(
                        modifier = modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Hello, Jane",
                            fontSize = 16.sp
                        )
                        Text(
                            text = "Your financial journey starts here.",
                            fontSize = 14.sp

                        )
                    }
                },
                actions = {
                    Row {
                        IconButton(
                            onClick = {},
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color(0xFFFFE6CC),
                                contentColor = Color.Black
                            )

                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Notifications"
                            )
                        }

                        IconButton(
                            onClick = {},
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color(0xFFFFE6CC),
                                contentColor = Color.Black
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "Notifications"
                            )
                        }

                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val pagerState = rememberPagerState(pageCount = { cardItems.size })
            HorizontalPager(
                state = pagerState
            ) { page ->
                CardItem(
                    cardInfo = cardItems[page]
                )

            }
            Spacer(modifier = modifier.size(8.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(pagerState.pageCount) { index ->
                    val isSelected = pagerState.currentPage == index
                    Box(
                        modifier = Modifier
                            .size(
                                20.dp
                            )
                            .padding(4.dp)
                            .clip(CircleShape)
                            .background(
                                color = if (isSelected) Color(0xFF008080) else Color(0xFFCCE6E6)
                            )
                    )

                }

            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}