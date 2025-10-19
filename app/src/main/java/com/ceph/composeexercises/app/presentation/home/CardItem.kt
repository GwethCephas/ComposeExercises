package com.ceph.composeexercises.app.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardItem(
    cardInfo: CardInfo,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardInfo.cardContainerColor
        )
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .size(
                        DpSize(
                            width = 125.dp, height = 98.dp
                        )
                    )
                    .offset(y = 40.dp),
                painter = cardInfo.cardImage,
                contentDescription = null,
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = cardInfo.title,
                        color = cardInfo.cardContentColor,
                        fontSize = 12.sp
                    )
                    Button(
                        modifier = modifier.height(24.dp),
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = cardInfo.actionButtonContainerColor
                        ),
                        contentPadding = PaddingValues(vertical = 0.dp, horizontal = 12.dp)
                    ) {
                        Text(
                            text = cardInfo.actionButtonText,
                            color = cardInfo.cardContainerColor,
                            fontSize = 10.sp
                        )
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                            contentDescription = null,
                            tint = cardInfo.cardContainerColor,
                            modifier = modifier.size(16.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = cardInfo.currency,
                        color = cardInfo.cardContentColor,
                        fontSize = 14.sp
                    )
                    Text(
                        text = cardInfo.amount,
                        color = cardInfo.cardContentColor,
                        fontSize = 20.sp
                    )
                    Icon(
                        imageVector = cardInfo.icon,
                        contentDescription = null,
                        tint = Color(0xFF55AAAA)
                    )

                }
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = cardInfo.description,
                    color = cardInfo.cardContentColor,
                    fontSize = 12.sp
                )
                Spacer(modifier = Modifier.height(24.dp))

                cardInfo.progress?.let { progressValue ->
                    LinearProgressIndicator(
                        progress = { progressValue },
                        modifier = Modifier
                            .padding(top = 4.dp)
                            .width(330.dp)
                            .height(4.dp)
                            .clip(RoundedCornerShape(50)),
                        color = cardInfo.progressIndicatorColor!!,
                        trackColor = cardInfo.trackColor!!,
                        strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
                    )
                }

            }
        }
    }
}