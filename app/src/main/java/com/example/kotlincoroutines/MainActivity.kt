package com.example.kotlincoroutines

import android.os.Bundle
import android.provider.Settings.Global
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlincoroutines.ui.theme.KotlinCoroutinesTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinCoroutinesTheme {

                //Light Weightness

                /*
                GlobalScope.launch {
                    repeat(100000){
                        launch {
                            println("android")
                        }
                    }
                }


                 */

                //Scope
                //Global Scope, runBlocking, CoroutineScope

                /*
                //runBlocking
                println("run blocking start")
                runBlocking {
                    launch {
                        delay(5000)
                        println("run blocking")
                    }
                }
                println("run blocking end")

                 */

                /*
                //GlobalScope

                println("global scope start")
                GlobalScope.launch {
                    delay(5000)
                    println("global scope")
                }
                println("global scope end")

                 */


              /*  //CoroutineScope
                println("coroutine scope start")
                CoroutineScope(Dispatchers.Default).launch {
                    delay(5000)
                    println("coroutine scope")
                }
                println("coroutine scope end")

                */
            }
        }
    }
}