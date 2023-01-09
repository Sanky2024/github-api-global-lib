def call(Map config = [:]) {
    sh "echo Helloo ${config.name}. Today is ${config.dayOfWeek}."
}
