package com.example.lab3.ui.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lab3.ui.InterfaceAdapter
import com.example.lab3.ui.model.Image
import com.example.lab3.ui.model.User

class MainActivityViewModel : ViewModel() {
    private val _users = MutableLiveData<ArrayList<InterfaceAdapter>>()
    val users: LiveData<ArrayList<InterfaceAdapter>> = _users

    fun loadUserList() {
        val list = ArrayList<InterfaceAdapter>()
        list.add(User(0, "Vladyslav", 21, "Like a basketball", "vladyslav@gmail.com", true))
        list.add(Image(1, "Vladyslav", "9:25"))
        list.add(User(2, "Igor", 19, "Like a swimming pool", "igor@gmail.com", false))
        list.add(Image(3, "Igor", "13:00"))
        list.add(User(4, "Bob", 12, "Like a football", "bob@gmail.com", true))
        list.add(Image(5, "Bob", "17:35"))
        _users.value = list
    }
}