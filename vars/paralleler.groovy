
def call(Map stages) {
    return {
        parallel stages.collectEntries { name, closure ->
            [(name): {
                stage(name) {
                    closure()
                }
            }]
        }
    }
}