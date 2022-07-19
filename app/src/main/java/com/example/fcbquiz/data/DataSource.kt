package com.example.fcbquiz.data

import com.example.fcbquiz.data.model.Vip

class DataSource {

    fun loadVips(): List<Vip> {
        val vipList = listOf(

            Vip("Cesaria Evoria", true),
            Vip("Adriano Celentano", true),
            Vip("Eros Ramazotti", true),
            Vip("Antonio Vivaldi", true),
            Vip("Francesco Guccini", true),
            Vip("Franco Battiato", true),
            Vip("Lucio Battisti", true),
            Vip("Gino Paoli", true),
            Vip("Johnny Hallyday", true),
            Vip("Bernard Lavilliers", true),
            Vip("Julien Clerc", true),
            Vip("Umberto Tozzi", true),
            Vip("Toto Cutugno", true),
            Vip("Ismae lo", true),
            Vip("Salif Keita ", true),
            Vip("Fred Arbinger", false),
            Vip("Michael Ballack", false),
            Vip("Emre Can", false),
            Vip("Eric Maxim Choupo-Moting", false),
            Vip("Dante", false),
            Vip("Antonio Di Salvo", false),
            Vip("Bernd Dreher", false),
            Vip("Gianluca Gaudino", false),
            Vip("Andreas Görlitz", false),
            Vip("Paolo Guerrero", false),
            Vip("Lucas Hernández", false),
            Vip("Uli Hoeneß", false),
            Vip("Mats Hummels", false),
            Vip("Jean-Pierre Papin", false),
            Vip("Lukas Podolski", false)


            )
        return vipList.shuffled()
    }
}