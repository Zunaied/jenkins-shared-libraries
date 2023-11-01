def call(String giturl, String gitbranch){
    checkoutgit
    (
        $class: 'GitSCM',
        branches: [[name: gitbranch]], 
    
        userRemoteConfigs: [[url: giturl]])

}