package dhkim.project.kotlinexample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dhkim.project.kotlinexample.model.CalModel

class MainViewModel : ViewModel() {
    private val _calModel = MutableLiveData<CalModel>().apply {
        value = CalModel(0)
    }

    val calModel: LiveData<CalModel>
        get() = _calModel

    fun addNumber() {
        _calModel.value = _calModel.value?.let {
            CalModel(it.number.plus(1))
        }
    }

    fun subNumber() {
        _calModel.value = _calModel.value?.let {
            CalModel(it.number.minus(1))
        }
    }
}