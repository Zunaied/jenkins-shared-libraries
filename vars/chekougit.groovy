def call() {
    chekougit(checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'git-cred', url: 'https://github.com/Zunaied/Youtube-clone-app.git']])
