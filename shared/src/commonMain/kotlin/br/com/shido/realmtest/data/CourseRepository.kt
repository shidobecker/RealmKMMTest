package br.com.shido.realmtest.data

import br.com.shido.realmtest.models.CourseUI
import io.realm.RealmResults
import io.realm.delete

class CourseRepository {

    fun createCourse() {
        val courses = fetchCourses()
        if(courses.isEmpty()) {
            val course = Course().apply {
                name = "Course 1"
            }
            with(RealmInit.realm) {
                writeBlocking {
                    copyToRealm(course)
                }
            }
        }
    }

    fun fetchCourses(): List<CourseUI> {
        return RealmInit.realm.objects(Course::class).map {
            CourseUI(it.id, it.name)
        }
    }

    fun updateCourse(id: String) {
        val realm = RealmInit.realm
        realm.objects<Course>().query("id == $id").firstOrNull()?.also { foundCourse ->
            realm.writeBlocking {
                foundCourse.name = "New Name"
            }
        }
    }

    fun deleteCourse(id: String) {
        val realm = RealmInit.realm
        realm.objects<Course>().query("id == $id").firstOrNull()?.delete()
    }


}