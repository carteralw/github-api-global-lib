
def call(String stepName, Closure body) {
    return {
        def start = System.currentTimeMillis()
        body()
        def duration = System.currentTimeMillis() - start
        echo "${stepName} took ${duration}ms"
    }
}