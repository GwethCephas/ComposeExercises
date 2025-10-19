package com.ceph.composeexercises.app.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ceph.composeexercises.R

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
            icon = Icons.Default.Visibility,
            cardImage = painterResource(R.drawable.vault_1)
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
            icon = Icons.Default.Visibility,
            cardImage = painterResource(R.drawable.piggy_bank_2),
            progress = 0.75f,
            progressIndicatorColor = Color(0xFFFAFAFA),
            trackColor = Color(0xFFFF952B).copy(alpha = 0.2f)

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
            cardImage = painterResource(R.drawable.target_1),
            progress = 0.75f,
            progressIndicatorColor = Color(0xFFFF952B),
            trackColor = Color(0xFFFF952B).copy(alpha = 0.2f)

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
            icon = Icons.Default.Visibility,
            cardImage = painterResource(R.drawable.cash_1),
            progress = 0.75f,
            progressIndicatorColor = Color(0xFFFF952B),
            trackColor = Color(0xFFFF952B).copy(alpha = 0.2f)

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
            Spacer(modifier = modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(pagerState.pageCount) { index ->
                    val isSelected = pagerState.currentPage == index
                    Box(
                        modifier = Modifier
                            .padding(4.dp)
                            .clip(CircleShape)
                            .size(
                                DpSize(
                                    width = 24.dp,
                                    height = 4.dp
                                )
                            )
                            .background(
                                color = if (isSelected) Color(0xFF008080) else Color(0xFFCCE6E6)
                            )
                    )

                }

            }

            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFAFAFA)
                )
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                        .background(Color.Transparent),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "You have no activities yet",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = modifier.height(4.dp))

                    Text(
                        text = "  Hi there, you have no linked \n      bank accounts",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF61646C)
                    )
                    Spacer(modifier = modifier.height(8.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFCCE6E6),
                            contentColor = Color(0xFFFAFAFA)
                        ),
                        modifier = Modifier.height(24.dp),
                        contentPadding = PaddingValues(vertical = 0.dp, horizontal = 8.dp)
                    ) {
                        Text(
                            text = "Link bank accounts",
                            fontSize = 12.sp,
                            color = Color(0xFF008080)
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                            contentDescription = "Link Account",
                            tint = Color(0xFF008080),
                            modifier = Modifier.size(16.dp)
                        )
                    }

                    Spacer(modifier = modifier.height(24.dp))

                    Image(
                        painter = painterResource(R.drawable.link_accounts_image),
                        contentDescription = "Link Account",
                        modifier = Modifier.size(
                            DpSize(
                                width = 120.dp,
                                height = 94.dp
                            )
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