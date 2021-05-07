package app.yonezawa.yone.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ドラムのサウンドファイルを読み込んで、プレイヤーを作る
        val drumSound = MediaPlayer.create(this, R.raw.drum_sound)

        //ドラムがタップされたときに呼ばれる
        drumImage.setOnClickListener {

            //ドラムの音を巻き戻す
            drumSound.seekTo(0)

            //ドラムの音を再生する
            drumSound.start()
        }
    }

}