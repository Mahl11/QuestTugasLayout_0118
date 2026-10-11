package com.example.questtugaslayout_0118

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileCard(
    nama: String,
    alamat: String,
    nomor: String? = null,
    backgroundColor: Color,
    namaColor: Color = Color.White,
    nomorColor: Color = Color.Unspecified,
    alamatColor: Color = Color.White,
    isCursive: Boolean = false,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_kiri),
                modifier = Modifier.size(54.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = nama,
                    fontSize = if (isCursive) 20.sp else 18.sp,
                    fontWeight = if (isCursive) FontWeight.Normal else FontWeight.Bold,
                    fontFamily = if (isCursive) FontFamily.Cursive else FontFamily.Default,
                    color = namaColor
                )

                if (!nomor.isNullOrEmpty()) {
                    Text(
                        text = nomor,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        color = nomorColor
                    )
                }

                Text(
                    text = alamat,
                    fontSize = 12.sp,
                    color = alamatColor
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = stringResource(id = R.string.desc_logo_kanan),
                modifier = Modifier.size(54.dp)
            )
        }
    }
}
