def call(String giturl, String gitbranch){
    checkoutgit
    (
        branches: [[name: gitbranch]], 
        extensions: [], 
        userRemoteConfigs: [[url: giturl]])

}