package dhkim.project.kotlinexample.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dhkim.project.kotlinexample.BR
import dhkim.project.kotlinexample.R
import dhkim.project.kotlinexample.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewDataBinding: ViewDataBinding
    private val mainViewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        viewDataBinding.lifecycleOwner = this

        binding {
            viewDataBinding.setVariable(BR.mainVm, mainViewModel)
        }
    }

    fun binding(action: ViewDataBinding.() -> Unit) {
        viewDataBinding.run(action)
    }
}