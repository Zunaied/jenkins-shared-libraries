def call(String gitUrl, String gitBranch) {
    checkoutgit(
        [
        $class: 'GitSCM',
        branches: [[name: gitBranch]],
        userRemoteConfigs: [[url: gitUrl]]
    ]
    )
}
