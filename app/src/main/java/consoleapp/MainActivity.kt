package consoleapp

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
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

        val commandRouterFactory = DaggerCommandRouterFactory.create()
        val commandRouter = commandRouterFactory.router()

        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextCommand)
        button.setOnClickListener {
            commandRouter.route(editText.text.toString())
        }
    }

    override fun onResume() {
        super.onResume()
     //   val scanner = Scanner(System.`in`)
        //Было:
        //CommandRouter commandRouter = new CommandRouter();

        //Стало:
        //Было:
        //CommandRouter commandRouter = new CommandRouter();

        //Стало:
    //    val commandRouterFactory = DaggerCommandRouterFactory.create()
//        val commandRouter = commandRouterFactory.router()
//
//        while (scanner.hasNextLine()) {
//            commandRouter.route(scanner.nextLine())
//            println("Настя в scan")
//        }
//

    }
}