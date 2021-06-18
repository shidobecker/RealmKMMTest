package br.com.shido.realmtest.data

import io.realm.RealmObject

class Course : RealmObject {
    var id : String = randomUUID()

    var name: String = ""

 }

class SubjectEnrollment : RealmObject {
    var id: String = randomUUID()

    var name: String = ""
}