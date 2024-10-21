package com.example.pertemuan_4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
){
    Column (
        modifier=modifier.fillMaxSize()
    ){
        HeaderSection2()
        DetailMhs(
            Param ="Nama",
            Argu = "Jois Ilham"
        )
        DetailMhs(
            Param = "Nim",
            Argu = "20220140125"
        )
        DetailMhs(
            Param ="Prodi",
            Argu = "Teknologi Invormasi"
        )
        DetailMhs(
            Param ="Fakultas",
            Argu = "Teknik"
        )
        DetailMhs(
            Param ="Universitas",
            Argu = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            Param ="Alamat",
            Argu = "Sleman Yogyakarta"
        )
        DetailMhs(
            Param ="Email",
            Argu = "Jois@gmail.com"
        )
    }
}

@Composable
fun HeaderSection2(){
    Box(
        modifier=Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ){
        Row (
            modifier=Modifier.fillMaxWidth().padding(16.dp)
        ){
            Box(
                contentAlignment = Alignment.BottomEnd,
            ){
                Image(painter = painterResource(R.drawable.umy),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape).size(80.dp)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.background(Color.Blue).size(20.dp)
                )
            }
            Column (
                modifier = Modifier.padding(15.dp)
            ){
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMhs(
    Param: String, Argu: String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = Param,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = Argu,
                modifier = Modifier.weight(2f))
        }
    }
}
