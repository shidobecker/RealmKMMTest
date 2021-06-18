package br.com.shido.realmtest.data

import io.realm.Realm
import io.realm.RealmConfiguration

object RealmInit {

    val realm: Realm by lazy{
        val configuration = RealmConfiguration(schema = setOf(Course::class, SubjectEnrollment::class))
        Realm.open(configuration)
    }

}