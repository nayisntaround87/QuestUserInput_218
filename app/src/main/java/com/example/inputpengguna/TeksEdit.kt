package com.example.inputpengguna

import android.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    //variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember {mutableStateOf("")}
    var textAlamat by remember { mutableStateOf("")}
    var textJK by remember {mutableStateOf("")}

    //variabel-variabel untuk menyimpan data diperoleh dari komponen
    var nama by remember {mutableStateOf("")}
    var alamat by remember {mutableStateOf("")}
    var jenis by remember {mutableStateOf("")}

    val gender:List<string> = listOf("Laki-laki", "Perempuan")



}