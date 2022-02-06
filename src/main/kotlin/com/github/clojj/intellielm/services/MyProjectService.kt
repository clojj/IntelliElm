package com.github.clojj.intellielm.services

import com.intellij.openapi.project.Project
import com.github.clojj.intellielm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
