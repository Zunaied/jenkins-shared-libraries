def call(String gitUrl, String gitBranch) {
    checkoutgit(
        branches: [[name: gitBranch]],
        extensions: [],
        userRemoteConfigs: [[url: gitUrl]]
    )
}
