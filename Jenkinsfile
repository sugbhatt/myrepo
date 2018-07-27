node {
  stage('SCM Checkout') {
    git 'https://github.com/sugbhatt/myrepo'
  }
  stage('Clean') {
    def mvnHome = tool name: 'M3', type: 'maven'
    sh "${mvnHome}/bin/mvn clean"
  }
}
