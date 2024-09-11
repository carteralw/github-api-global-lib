
def call(String branch, Closure body) {
    return {
        if (env.BRANCH_NAME == branch) {
            body()
        } else {
            echo "Skipping - not on ${branch} branch"
        }
    }
}