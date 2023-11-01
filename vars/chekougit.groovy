def call(String gitUrl, String gitBranch,String gitCred) {
    chekougit(
        (branches: [[name: gitBranch]], extensions: [], userRemoteConfigs: [[credentialsId: gitCred, url: gitUrl ]])
    )
}
