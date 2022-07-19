import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * @author RubioAlves
 * Created 30/04/2022 at 16:06
 */
fun DependencyHandlerScope.kotlin(){
    "implementation"(Dependencies.kotlin)
    "implementation"(Dependencies.kotlin_jdk)
}

fun DependencyHandlerScope.networking(){
    "implementation"(Dependencies.retrofit)
    "implementation"(Dependencies.converter_gson)
    "implementation"(Dependencies.okhttp3_logging_interceptor)
}

fun DependencyHandlerScope.compose(){
    "implementation"(Dependencies.core_ktx)
    "implementation"(Dependencies.compose_activity)
    "implementation"(Dependencies.compose_ui)
    "implementation"(Dependencies.compose_tooling)
    "implementation"(Dependencies.compose_foundation)
    "implementation"(Dependencies.compose_material)
    "implementation"(Dependencies.compose_material_icons_core)
    "implementation"(Dependencies.compose_material_icons_extended)
    "implementation"(Dependencies.compose_livedata)
    "debugImplementation"(Dependencies.compose_tooling)
}
fun DependencyHandlerScope.junit(){
    "testImplementation"(Dependencies.junit)
    "androidTestImplementation"(Dependencies.ext_junit)
}
fun DependencyHandlerScope.espresso(){
    "androidTestImplementation"(Dependencies.espresso_core)
}
fun DependencyHandlerScope.composeTest(){
    junit()
    espresso()
    "androidTestImplementation"(Dependencies.compose_ui_test)
}