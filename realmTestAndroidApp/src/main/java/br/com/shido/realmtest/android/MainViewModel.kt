package br.com.shido.realmtest.android

import androidx.lifecycle.ViewModel
import br.com.shido.realmtest.data.Course
import br.com.shido.realmtest.data.CourseRepository
import br.com.shido.realmtest.models.CourseUI

class MainViewModel : ViewModel() {


    fun createCourse() {
        CourseRepository().createCourse()
    }

    fun fetchCourses() : List<CourseUI>{
        return CourseRepository().fetchCourses()
    }

    fun deleteCourse(){
        CourseRepository().deleteCourse("")
    }

    fun updateCourse(){
        CourseRepository().updateCourse("")
    }


}