package com.github.kishoretulsiani.myawesomefirstplugin.services

import com.github.kishoretulsiani.myawesomefirstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
