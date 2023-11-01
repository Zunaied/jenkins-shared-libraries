def call(String gitUrl, String gitBranch,String gitCred) {
    chekougit([
              $class: 'GitSCM',
        (branches: [[name: gitBranch]], extensions: [], userRemoteConfigs: [[credentialsId: gitCred, url: gitUrl ]])
    ])
}
