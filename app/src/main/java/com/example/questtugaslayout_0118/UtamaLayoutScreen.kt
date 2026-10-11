package com.example.questtugaslayout_0118

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UtamaLayoutScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 32.dp, bottom = 16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header Prodi & Universitas
            Text(
                text = stringResource(id = R.string.title_prodi),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = stringResource(id = R.string.title_univ),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(24.dp))

            // 1. Card 1: Ilham Saputra (Paling Atas)
            ProfileCard(
                nama = stringResource(id = R.string.nama_card1),
                nomor = stringResource(id = R.string.nomor_card1),
                alamat = stringResource(id = R.string.alamat_card1),
                backgroundColor = colorResource(id = R.color.card_bg_gray),
                namaColor = colorResource(id = R.color.text_white),
                nomorColor = colorResource(id = R.color.text_cyan),
                alamatColor = colorResource(id = R.color.text_yellow),
                isCursive = true
            )

            // 2. Card 2: Nabila Putri (Lengkap dengan Nomor Kontak)
            ProfileCard(
                nama = stringResource(id = R.string.nama_card2),
                nomor = stringResource(id = R.string.nomor_card2),
                alamat = stringResource(id = R.string.alamat_card2),
                backgroundColor = colorResource(id = R.color.card_bg_purple),
                namaColor = colorResource(id = R.color.text_white),
                nomorColor = colorResource(id = R.color.text_cyan),
                alamatColor = colorResource(id = R.color.text_yellow)
            )

            // 3. Card 3: Udin Samsudin
            ProfileCard(
                nama = stringResource(id = R.string.nama_card3),
                nomor = stringResource(id = R.string.nomor_card3),
                alamat = stringResource(id = R.string.alamat_card3),
                backgroundColor = colorResource(id = R.color.card_bg_blue),
                namaColor = colorResource(id = R.color.text_white),
                nomorColor = colorResource(id = R.color.text_cyan),
                alamatColor = colorResource(id = R.color.text_white)
            )

            // 4. Card 4: Zahra Rahmawati
            ProfileCard(
                nama = stringResource(id = R.string.nama_card4),
                nomor = stringResource(id = R.string.nomor_card4),
                alamat = stringResource(id = R.string.alamat_card4),
                backgroundColor = colorResource(id = R.color.card_bg_green),
                namaColor = colorResource(id = R.color.text_white),
                nomorColor = colorResource(id = R.color.text_cyan),
                alamatColor = colorResource(id = R.color.text_white)
            )
        }

        // Footer Copyright di bagian paling bawah
        Text(
            text = stringResource(id = R.string.footer_copyright),
            fontSize = 11.sp,
            color = colorResource(id = R.color.text_footer),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp)
        )
    }
}
