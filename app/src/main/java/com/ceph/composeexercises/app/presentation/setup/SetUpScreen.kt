package com.ceph.composeexercises.app.presentation.setup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ceph.composeexercises.R
import com.ceph.composeexercises.app.presentation.components.ActionListItem
import com.ceph.composeexercises.app.presentation.navigation.NavRoutes

@Composable
fun SetUpScreen(
    navController: NavHostController
) {

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Color(0xFFF9FAFB)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = buildAnnotatedString {
                    append("Welcome to ")
                    withStyle(SpanStyle(color = Color(0xFF0097A7))) {
                        append(" Fintrack!")
                    }
                },
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "Let's get you set up.",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(32.dp))


            ActionListItem(
                text = "Set up a pin",
                description = "Enhance your account security.",
                painter = painterResource(R.drawable.account_setup_1),
                onClick = {
                    navController.navigate(NavRoutes.Passcode.route)
                },
            )
            ActionListItem(
                text = "Link your bank \naccounts.",
                description = "Link your bank accounts to \nstart tracking your expenses.",
                painter = painterResource(R.drawable.account_setup_2),
                onClick = {},

                )

            ActionListItem(
                text = "Create your savings goal",
                description = "What are your financial goals?",
                painter = painterResource(R.drawable.account_setup_3),
                onClick = {},

                )

            Spacer(modifier = Modifier.weight(0.75f))
            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0097A7)
                )
            ) {
                Text(text = "Skip for now")
            }
        }

    }

}

