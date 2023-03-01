package com.yong.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AuthScreen() {
    LoginText()
}

@Preview
@Composable
fun LoginText() {
    Column {
        Text(
            text = stringResource(id = R.string.login_text),
            modifier = Modifier.padding(12.dp),
            textAlign = TextAlign.Center
        )

        EmailField()
        PasswordField()
    }
}

@Composable
fun EmailField() {
    val defaultEmail = remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = defaultEmail.value,
        onValueChange = { email -> defaultEmail.value = email },
        modifier = Modifier.padding(8.dp),
        placeholder = { Text(stringResource(id = R.string.email_placeholder)) },
        singleLine = true
    )
}

@Composable
fun PasswordField() {
    val defaultPassword = remember { mutableStateOf("") }
    TextField(
        value = defaultPassword.value,
        onValueChange = { password -> defaultPassword.value = password },
        modifier = Modifier.padding(8.dp),
        placeholder = { Text(stringResource(id = R.string.password_placeholder)) },
        singleLine = true,
    )
}