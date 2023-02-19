package com.example.pmdm22_examen_2t.ui.ej02

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class CountersListViewModel : ViewModel() {
    private val _list = mutableStateListOf<Counter>()
    val list: List<Counter> get() = _list


    fun remove(item: Counter) {
        _list.remove(item)
    }

    fun increment(item: Counter) {
        item.count++
    }

    fun decrement(item: Counter) {
        item.count--
    }

    fun add(item: Counter) {
        _list.add(item)
    }

    fun getGlobalCount() =
        //_list.map { it.count }.fold(0) { acc, counter -> acc + counter }
        _list.sumOf { it.count }

/*    fun getGlobalCountImperativo() : Int {
        var acc = 0
        for (item: Counter in _list) {
            acc += item.count
        }
        return acc
    }*/



}