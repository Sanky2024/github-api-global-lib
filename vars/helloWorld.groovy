def call(Map config = [:]) {
    sh "echo Hello1 ${config.name}. Today is ${config.dayOfWeek}."
}
