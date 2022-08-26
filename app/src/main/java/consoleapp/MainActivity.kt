package consoleapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.nestdev.daggertraining.R
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val commandProcessor: CommandProcessor =
            DaggerCommandLineAtm_CommandProcessorFactory.create().processor()

        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextCommand)
        button.setOnClickListener {
            commandProcessor.process(editText.text.toString())
        }
    }
}