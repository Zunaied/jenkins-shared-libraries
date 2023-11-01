def call(String gitUrl, String gitBranch) {
    chekougit(
        [
        $class: 'GitSCM',
        branches: [[name: gitBranch]],
        userRemoteConfigs: [[url: gitUrl]]
    ]
    )
}
