package com.payal.onlinecoursesjetpack.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import coil.size.Size

@Composable
fun SvgImageFromAssets(fileName: String, contentDescription: String?, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val assetFileName = "file:///android_asset/$fileName"

    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(context)
            .data(assetFileName)
            .decoderFactory(SvgDecoder.Factory())
            .size(Size.ORIGINAL)
            .build()
    )

    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier,
        contentScale = ContentScale.Fit
    )
}