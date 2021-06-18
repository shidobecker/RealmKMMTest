package br.com.shido.realmtest.android

import android.os.Bundle
import android.util.Log.w
import androidx.appcompat.app.AppCompatActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.createCourse()

        viewModel.fetchCourses().forEach {
            w("A", "Fetch Courses ${it.name}")
        }
    }
}
